package za.co.novabank.customer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/customer-profile")
public class CustomerProfileController {
    /* Updating and managing customer profiles, such as:
    Viewing and updating personal information (name, address, contact details).
    Managing preferences for communication (email subscriptions, SMS notifications).
    Viewing and updating security settings (password change, two-factor authentication).
    Handling customer documents, such as KYC documents or other required proofs.
    Allowing customers to manage linked accounts (e.g., adding/removing bank accounts or cards).
     */
    // Viewing Customer Profile
    @GetMapping("/{customerId}")
    public ResponseEntity<?> viewProfile(@PathVariable("customerId") String customerId) {
        return ResponseEntity.ok(null);
    }

    // Updating Customer Profile
    @PutMapping("/{customerId}")
    public ResponseEntity<String> updateProfile(@PathVariable("customerId") String customerId, @RequestBody Object updatedProfile) {
        // Update customer profile (validation and saving data)
        return ResponseEntity.ok("Customer profile updated successfully.");
    }

    // Update Communication Preferences
    @PutMapping("/{customerId}/preferences")
    public ResponseEntity<String> updatePreferences(@PathVariable("customerId") String customerId, @RequestBody Object preferences) {
        // Update communication preferences
        return ResponseEntity.ok("Communication preferences updated successfully.");
    }

    // Change Security Settings (Password Change or 2FA)
    @PutMapping("/{customerId}/security")
    public ResponseEntity<String> updateSecuritySettings(@PathVariable("customerId") String customerId, @RequestBody Object securitySettings) {
        // Update security settings
        return ResponseEntity.ok("Security settings updated successfully.");
    }

    // Upload KYC Documents
    @PostMapping("/{customerId}/kyc")
    public ResponseEntity<String> uploadKYC(@PathVariable("customerId") String customerId, @RequestBody Object kycDocuments) {
        // Simulate KYC document upload (verify and store the documents securely)
        return ResponseEntity.ok("KYC documents uploaded successfully.");
    }

    // Add/Remove Linked Accounts
    @PutMapping("/{customerId}/linked-accounts")
    public ResponseEntity<String> manageLinkedAccounts(@PathVariable("customerId") String customerId, @RequestBody Object linkedAccounts) {
        // Manage linked accounts this would involve checking for existing linked accounts)
        return ResponseEntity.ok("Linked accounts updated successfully.");
    }

}
