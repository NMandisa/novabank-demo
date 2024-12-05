// Import necessary Gulp functions
import { src, dest, series, parallel, watch } from 'gulp';
import gulpSass from 'gulp-sass';
import * as nodeSass from 'sass';
import concat from 'gulp-concat';
import uglify from 'gulp-uglify';
import cleanCSS from 'gulp-clean-css';
import rename from 'gulp-rename';
import replace from 'gulp-replace';
import { pipeline } from 'readable-stream';
import autoprefixer from 'gulp-autoprefixer';
import cache from 'gulp-cache'; 
import dotenv from 'dotenv';

// Load environment variables from .env file
dotenv.config();

// Use Dart Sass
const sass = gulpSass(nodeSass);

// Compile SCSS to CSS task for themes
function compileTheme(theme) {
  return src(`src/assets/scss/themes/${theme}.scss`, { allowEmpty: true })
    .pipe(sass().on('error', sass.logError))
    .pipe(cleanCSS())
    .pipe(rename(`theme-${theme}.min.css`))
    .pipe(dest('src/assets/css'));
}

// SCSS to CSS task
function compileSass() {
  return src('src/assets/scss/**/*.scss')
    .pipe(sass().on('error', sass.logError))
    .pipe(cleanCSS())
    .pipe(rename('app.min.css'))
    .pipe(dest('src/assets/css'));
}

// Concatenate and minify JavaScript files
function minifyScripts() {
  return src('src/assets/js/**/*.js')
    .pipe(concat('app.js'))
    .pipe(uglify())
    .pipe(rename('app.min.js'))
    .pipe(dest('src/assets/js'));
}

// Replace theme CSS dynamically
function switchTheme() {
  const theme = process.env.THEME || 'default';
  const regex = /<link rel="stylesheet" href="\.\/assets\/css\/theme.*\.css">/;
  const replacement = `<link rel="stylesheet" href="./assets/css/theme-${theme}.min.css">`;

  console.log(`Replacing theme with: ${replacement}`);

  return src('src/index.html')
    .pipe(replace(regex, replacement))
    .pipe(dest('src'));
}

// Clear Gulp cache task
function clearGulpCache(cb) {
  cache.clearAll();
  cb();
}

// Watch task for changes
function watchFiles() {
  watch('src/assets/scss/**/*.scss', compileSass);
  watch('src/assets/js/**/*.js', minifyScripts);
  watch('src/index.html', switchTheme);
}

// Compile all themes task
function compileAllThemes() {
  return parallel(
    () => compileTheme('default'),
    () => compileTheme('dark')
  );
}

// Default task
export default series(
  parallel(compileSass, minifyScripts, compileAllThemes(), switchTheme),
  watchFiles
);

// Export individual tasks
export const sassTask = compileSass;
export const scriptsTask = minifyScripts;
export const themeSwitchTask = switchTheme;
export const watchTask = watchFiles;
export const clearCache = clearGulpCache;
export const compileThemes = compileAllThemes;
