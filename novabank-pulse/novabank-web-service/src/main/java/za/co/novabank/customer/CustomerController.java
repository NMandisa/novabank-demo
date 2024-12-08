package za.co.novabank.customer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/customers")
public class CustomerController {

     // Customer Onboarding
     @PostMapping
     public ResponseEntity<String> onboardCustomer(@RequestBody Object customer) {
         return ResponseEntity.ok("Customer onboarded successfully with ID: ");
     }

    // Customer Profile Update
    @PutMapping("/{customerId}")
    public ResponseEntity<String> updateCustomerProfile(@PathVariable("customerId") String customerId, @RequestBody Object updatedDetails) {
        // Update customer details
        return ResponseEntity.ok("Customer profile updated successfully.");
    }

    // Customer KYC Verification
    @PostMapping("/{customerId}/kyc")
    public ResponseEntity<String> verifyKYC(@PathVariable("customerId") String customerId, @RequestBody Object kycDocuments) {
            return ResponseEntity.status(400).body("KYC verification failed.");
    }

    // Customer Account Link Inquiry
    @GetMapping("/{customerId}/accounts")
    public ResponseEntity<String> getCustomerAccounts(@PathVariable("customerId") String customerId) {
        // return a list of linked accounts
        return ResponseEntity.ok("Customer " + customerId + " has the following accounts: ");
    }

    // Customer Deactivation
    @PatchMapping("/{customerId}/status")
    public ResponseEntity<String> deactivateCustomer(@PathVariable("customerId") String customerId, @RequestBody Object statusUpdate) {
        return ResponseEntity.ok("Customer " + customerId + " deactivated successfully. Reason: ");
    }
}
