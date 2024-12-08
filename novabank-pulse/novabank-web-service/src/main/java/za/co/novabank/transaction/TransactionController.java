package za.co.novabank.transaction;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/transactions")
public class TransactionController {

    // Funds Transfer (Intrabank)
    @PostMapping("/intrabank")
    public ResponseEntity<String> intrabankTransfer(@RequestBody Object transferRequest) {
        // Logic to process an intrabank transfer (same bank transfer)
        // Validate accounts, check balances, perform the transfer
        // Simulate transaction creation and store it
        return ResponseEntity.ok("");
    }

    // Funds Transfer (Interbank)
    @PostMapping("/interbank")
    public ResponseEntity<String> interbankTransfer(@RequestBody Object transferRequest) {
        // Logic to process an interbank transfer (different bank transfer)
        // Validate accounts, check balances, call external bank API, etc.
        // Simulate transaction creation and store it
        return ResponseEntity.ok("Okay");
    }

    // Transaction History
    @GetMapping
    public ResponseEntity<List<?>> getTransactionHistory(
            @RequestParam String accountId, @RequestParam String startDate, @RequestParam String endDate) {
        // Filter transactions based on accountId and date range
        /*List<Transaction> filteredTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getFromAccountId().equals(accountId) || transaction.getToAccountId().equals(accountId)) {
                // Simple date comparison logic
                if (transaction.getTransactionDate().compareTo(startDate) >= 0 && transaction.getTransactionDate().compareTo(endDate) <= 0) {
                    filteredTransactions.add(transaction);
                }
            }
        }*/
        return ResponseEntity.ok(new ArrayList<>());
    }

    // Transaction Status Inquiry
    @GetMapping("/{transactionId}/status")
    public ResponseEntity<String> getTransactionStatus(@PathVariable String transactionId) {
            return ResponseEntity.ok("Transaction status: ");
    }

    // Transaction Reversal
    @PostMapping("/{transactionId}/reversal")
    public ResponseEntity<String> reverseTransaction(@PathVariable String transactionId) {
        // Here you would reverse the transaction logic (e.g., credit/debit balances)
        return ResponseEntity.ok("Transaction " + transactionId + " has been reversed.");
    }
}
