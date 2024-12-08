package za.co.novabank.digital;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/digital-wallet")
public class DigitalWalletController {
    // Create Digital Wallet
    @PostMapping("/{customerId}/create")
    public ResponseEntity<String> createWallet(@PathVariable("customerId") String customerId) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Wallet created for customer " + customerId);
    }

    // Check Wallet Balance
    @GetMapping("/{customerId}/balance")
    public ResponseEntity<Double> getWalletBalance(@PathVariable("customerId") String customerId) {
        return ResponseEntity.ok(00.00D);
    }

    // Add Funds to Digital Wallet
    @PostMapping("/{customerId}/add-funds")
    public ResponseEntity<String> addFunds(@PathVariable("customerId") String customerId, @RequestParam double amount) {
        return ResponseEntity.ok("Successfully added " + amount + " to wallet. New balance: ");
    }

    // Withdraw Funds from Digital Wallet
    @PostMapping("/{customerId}/withdraw-funds")
    public ResponseEntity<String> withdrawFunds(@PathVariable("customerId") String customerId, @RequestParam double amount) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Insufficient funds in the wallet.");
    }

    // Transfer Funds between Digital Wallets
    @PostMapping("/{fromCustomerId}/transfer/{toCustomerId}")
    public ResponseEntity<String> transferFunds(@PathVariable("fromCustomerId") String fromCustomerId,
                                                @PathVariable("toCustomerId") String toCustomerId,
                                                @RequestParam double amount) {
        return ResponseEntity.ok("Successfully transferred " + amount + " from " + fromCustomerId + " to " + toCustomerId);
    }

    // Wallet Transaction History
    @GetMapping("/{customerId}/transactions")
    public ResponseEntity<String> getTransactionHistory(@PathVariable("customerId") String customerId) {
        return ResponseEntity.ok("Transaction history for customer " + customerId);
    }
}
