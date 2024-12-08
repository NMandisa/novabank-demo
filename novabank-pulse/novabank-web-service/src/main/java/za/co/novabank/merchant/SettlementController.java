package za.co.novabank.merchant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/merchant-settlement")
public class SettlementController {
    // Process a settlement to a merchant
    @PostMapping("/process")
    public ResponseEntity<String> processSettlement(@RequestBody Object settlementRequest) {
        // Logic to process settlement
        return ResponseEntity.ok("Settlement processed for Merchant ID: ");
    }

    // Retrieve settlement details by settlement ID
    @GetMapping("/{settlement-id}")
    public ResponseEntity<Object> getSettlementDetails(@PathVariable("settlement-id") String settlementId) {
        // Logic to retrieve settlement details
        return ResponseEntity.ok(null);
    }

    // Get all settlements for a merchant
    @GetMapping("/merchant/{merchant-id}")
    public ResponseEntity<?> getSettlementsByMerchant(@PathVariable("merchant-id") String merchantId) {
        // Logic to retrieve all settlements for a specific merchant
        return ResponseEntity.ok(null);
    }
}
