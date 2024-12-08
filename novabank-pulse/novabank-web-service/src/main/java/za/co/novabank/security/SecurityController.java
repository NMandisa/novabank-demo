package za.co.novabank.security;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/security")
public class SecurityController {

    // Password Reset Request
    @PostMapping("/password-reset-request")
    public ResponseEntity<String> passwordResetRequest(@RequestBody Object request) {
        // Logic to initiate password reset process
        // Send an email with a reset link to the user's registered email
        return ResponseEntity.ok("Password reset request sent.");
    }

    // Reset Password
    @PostMapping("/password-reset")
    public ResponseEntity<String> resetPassword(@RequestBody Object resetRequest) {
        // Logic to reset the user's password based on the token sent to the user
        // Validate the reset token and update the password
        return ResponseEntity.ok("Password reset successfully.");
    }

    // Two-Factor Authentication Enable
    @PostMapping("/2fa/enable")
    public ResponseEntity<String> enable2FA(@RequestBody Object request) {
        // Logic to enable two-factor authentication for the user
        // This could involve generating a 2FA secret, enabling 2FA for the user

        return ResponseEntity.ok("Two-factor authentication enabled.");
    }

    // Two-Factor Authentication Disable: POST /security/2fa/disable
    @PostMapping("/2fa/disable")
    public ResponseEntity<String> disable2FA(@RequestBody Object request) {
        // Logic to disable two-factor authentication for the user

        return ResponseEntity.ok("Two-factor authentication disabled.");
    }

    // Verify Two-Factor Authentication Code
    @PostMapping("/2fa/verify")
    public ResponseEntity<String> verify2FACode(@RequestBody Object request) {
        // Logic to verify the 2FA code entered by the user
        return ResponseEntity.ok("Two-factor authentication verified.");
    }

}
