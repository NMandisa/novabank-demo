package za.co.novabank.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Handles the basic customer interactions with accounts such as account creation and viewing account balances and details.
 * It might interact with the AccountManagementController to perform actions like activating or deactivating accounts or updating account details.
 * AccountOperationsController might be used when the customer wants to make a transaction (deposit/withdraw) after their account has been created.
 *
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/accounts")
public class AccountController {

    // Account creation
    @PostMapping
    public ResponseEntity<Object> createAccount(@RequestBody Object accountRequest) {
        // Set the initial deposit as balance
        return ResponseEntity.ok(null);
    }

    // Account balance inquiry
    @GetMapping("/{accountId}/balance")
    public ResponseEntity<Object> getAccountBalance(@PathVariable String accountId) {
        // Return the account balance and currency
        return ResponseEntity.ok(null);
    }

    // Account statement
    @GetMapping("/{accountId}/statements")
    public ResponseEntity<List<String>> getAccountStatements(@PathVariable String accountId,
                                                             @RequestParam String startDate, @RequestParam String endDate) {
        // Simulate account statements as a list of transaction details (transaction history)
        return ResponseEntity.ok(null);
    }

    // Account closure
    @PatchMapping("/{accountId}")
    public ResponseEntity<String> closeAccount(@PathVariable String accountId, @RequestBody Map<String, String> reasonRequest) {
        // Set account status to closed and record closure reason
        // Log the closure reason (this would be stored in a database and logs)
        // change account status from  database
        return ResponseEntity.ok("Account closed successfully.");
    }

    // Account types inquiry
    @GetMapping("/types")
    public ResponseEntity<List<String>> getAvailableAccountTypes() {
        return ResponseEntity.ok(null);
    }
}
