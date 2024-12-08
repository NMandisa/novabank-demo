package za.co.novabank.security;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Object loginRequest) {
        // Validate username and password (AuthenticationService)
        // If valid, generate a JWT token
        // If invalid, return 401 Unauthorized
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(Object request) {
        // Invalidate the JWT Token or session (if using session-based auth)
        // This can involve invalidating a session or clearing the JWT token from the client side.

        // For simplicity, we're returning a success message here
        return ResponseEntity.ok("User logged out successfully.");
    }

    @PostMapping("/refresh")
    public ResponseEntity<?> refresh(@RequestBody Object tokenRequest) {
        // Validate the refresh token and issue a new access token (JWT).
        // Dummy example: If the refresh token is valid, generate a new JWT token.
        // validate the refresh token here.
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }

}
