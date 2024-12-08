package za.co.novabank.merchant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/merchant")
public class MerchantController {
    // Register a new merchant
    @PostMapping("/register")
    public ResponseEntity<String> registerMerchant(@RequestBody Object merchant) {
        // Logic to save merchant data
        return ResponseEntity.ok("Merchant registered successfully!");
    }

    // Get details of a merchant by ID
    @GetMapping("/{merchantId}")
    public ResponseEntity<Object> getMerchantDetails(@PathVariable("merchantId") String merchantId) {
        // Logic to fetch merchant details
        //Merchant merchant = new Merchant(merchantId, "Sample Business", "contact@example.com", "active");
        return ResponseEntity.ok(null);
    }

    // Update merchant details
    @PutMapping("/{merchantId}")
    public ResponseEntity<String> updateMerchant(@PathVariable("merchantId") String merchantId, @RequestBody Object merchant) {
        // Logic to update merchant info
        return ResponseEntity.ok("Merchant details updated successfully!");
    }

    // Suspend or activate merchant account
    @PatchMapping("/{merchantId}/status")
    public ResponseEntity<String> changeMerchantStatus(@PathVariable("merchantId") String merchantId, @RequestParam("status") String status) {
        // Logic to change merchant status (active/suspended)
        return ResponseEntity.ok("Merchant status updated to " + status);
    }
}
