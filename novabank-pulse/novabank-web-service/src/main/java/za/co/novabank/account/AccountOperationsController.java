package za.co.novabank.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Provides functionality for transactions.
 * It is directly responsible for handling deposits, withdrawals, fund transfers,and managing transactions for an individual account.
 * It interacts with AccountController to ensure that the account exists before any operation can be carried out, and
 * with AccountManagementController to ensure that the account is active and not restricted.
 * Performing account transfers (e.g., fund transfers between accounts).
 * Handling withdrawals and deposits.
 * Managing transaction history and operations (e.g., recent transactions, recurring payments).
 * Managing linked accounts or debit/credit card operations.
 *
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/account-operations")
public class AccountOperationsController {

    // Deposit funds into an account
    @PostMapping("/{accountId}/deposit")
    public ResponseEntity<String> depositFunds(@PathVariable String accountId, @RequestBody Object depositRequest) {
        return ResponseEntity.ok("Deposit successful. New balance: ");
    }

    // Withdraw funds from an account
    @PostMapping("/{accountId}/withdraw")
    public ResponseEntity<String> withdrawFunds(@PathVariable String accountId, @RequestBody Object withdrawRequest) {
        return ResponseEntity.ok("Withdrawal successful. New balance: ");
    }

    //Fund transfer between two accounts
    @PostMapping("/{fromAccountId}/transfer/{toAccountId}")
    public ResponseEntity<String> transferFunds(@PathVariable String fromAccountId, @PathVariable String toAccountId,
                                                @RequestBody Object transferRequest) {
        return ResponseEntity.ok(null);
    }

    // Get transaction history for an account
    @GetMapping("/{accountId}/transactions")
    public ResponseEntity<List<?>> getTransactionHistory(@PathVariable String accountId) {
        return ResponseEntity.ok(null);
    }
}
