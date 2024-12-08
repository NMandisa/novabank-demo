import { src, dest, series, parallel, watch } from 'gulp';
import gulpSass from 'gulp-sass';  // Gulp plugin for compiling Sass/SCSS
import * as nodeSass from 'sass';  // Node-sass dependency used with Gulp Sass
import concat from 'gulp-concat';  // Gulp plugin to concatenate files
import uglify from 'gulp-uglify';  // Gulp plugin to minify JavaScript
import cleanCSS from 'gulp-clean-css';  // Gulp plugin for minifying CSS
import rename from 'gulp-rename';  // Gulp plugin to rename files
import autoprefixer from 'gulp-autoprefixer';  // Gulp plugin to add vendor prefixes to CSS
import cache from 'gulp-cache';  // Gulp plugin to manage caching of tasks
import path from 'path';  // For resolving paths
import * as sassCompiler from 'sass'; 

// Use Dart Sass via gulp-sass
const sass = gulpSass(nodeSass);

// Paths
const paths = {
  scss: 'src/assets/scss/**/*.scss',
  js: 'src/assets/js/**/*.js',
  themes: 'src/assets/scss/themes',
  cssDest: 'src/assets/css',
  jsDest: 'src/assets/js',
  nodeModules: 'node_modules' // This is crucial for importing Bootstrap from node_modules
};

// Configure gulp-sass with includePaths to node_modules
const sassOptions = {
  importer: sassCompiler,
  includePaths: ['node_modules'] // Tell Sass where to find node_modules
};

// Compile SCSS to CSS for different themes (e.g., light, dark,xmas)
function compileTheme(theme) {
  // SCSS theme compilation task
  return src(path.join(paths.themes, `${theme}.scss`), { allowEmpty: true })  // Allow empty to prevent errors if the theme doesn't exist
    .pipe(sass({ includePaths: [paths.nodeModules] }).on('error', sass.logError))  // Ensure node_modules are included
    .pipe(cleanCSS())  // Minify the compiled CSS for smaller file size
    .pipe(rename(`theme-${theme}.min.css`))  // Rename to minified theme CSS
    .pipe(dest(paths.cssDest));  // Output to assets/css folder
}

// General SCSS to CSS compilation task for the app
function compileSass() {
  return src(paths.scss)  // Source all SCSS files
    .pipe(sass({ includePaths: [paths.nodeModules] }).on('error', sass.logError))  // Ensure node_modules are included
    .pipe(autoprefixer())  // Add vendor prefixes
    .pipe(cleanCSS())  // Minify the CSS
    .pipe(rename('app.min.css'))  // Rename the file to app.min.css
    .pipe(dest(paths.cssDest));  // Output to assets/css folder
}



// Concatenate and minify JavaScript files (e.g., app.js)
function minifyScripts() {
  return src(paths.js)  // Source all JS files
    .pipe(concat('app.js'))  // Concatenate them into a single file
    .pipe(uglify())  // Minify the JS to reduce file size
    .pipe(rename('app.min.js'))  // Rename the minified JS file
    .pipe(dest(paths.jsDest));  // Output the minified JS
}

// Watch task: Automatically rebuild assets on changes to SCSS, JS, or HTML
function watchFiles() {
  watch(paths.scss, compileSass);  // Watch SCSS files and run compileSass on change
  watch(paths.js, minifyScripts);  // Watch JS files and run minifyScripts on change
  watch(path.join(paths.themes, '**/*.scss'), compileAllThemes);  // Watch theme SCSS files
}

// Compile all themes (default and dark) in parallel to optimize speed
function compileAllThemes() {
  return parallel(  // Run both theme tasks in parallel
    () => compileTheme('light'),
    () => compileTheme('dark'),
    () => compileTheme('xmas')
  );
}

// Default task: Runs everything (SCSS, JS, themes, and HTML switching)
export default series(
  parallel(compileSass, minifyScripts, compileAllThemes()),  // Run all tasks in parallel
  watchFiles  // Start the watch task to monitor changes
);

// Export individual tasks for flexibility
export const sassTask = compileSass;  // Export compileSass task
export const scriptsTask = minifyScripts;  // Export minifyScripts task
export const watchTask = watchFiles;  // Export watchFiles task
export const compileThemes = compileAllThemes;  // Export compileAllThemes task