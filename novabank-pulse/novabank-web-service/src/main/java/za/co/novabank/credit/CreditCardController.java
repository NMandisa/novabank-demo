package za.co.novabank.credit;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/credit-cards")
public class CreditCardController {
    //Transaction history: Tracking all transactions made using the credit card.
    //Card payments: Allowing customers to make payments towards their credit card balances.
    //Card activation and deactivation: Activating or deactivating cards when necessary.
    //Card limit and benefits management: Adjusting credit card limits and managing rewards/benefits associated with the card.
    // Apply for a new credit card
    @PostMapping("/apply/{customerId}")
    public ResponseEntity<String> applyCreditCard(@PathVariable("customerId") String customerId,
                                                  @RequestBody Object creditCard) {
        return ResponseEntity.ok("Credit card issued successfully for customer: ");
    }

    // Get balance and available credit limit: GET /credit-cards/{customerId}/balance
    @GetMapping("/{customerId}/balance")
    public ResponseEntity<?> getBalance(@PathVariable("customerId") String customerId) {
        return ResponseEntity.ok(null);
    }

    // Make a payment towards the credit card balance
    @PostMapping("/{customerId}/pay")
    public ResponseEntity<String> makePayment(@PathVariable("customerId") String customerId,
                                              @RequestBody Object paymentRequest) {
        // Apply the payment and adjust the balance
        return ResponseEntity.ok("Payment successful. New balance: ");
    }

    // Get transaction history for a credit card
    @GetMapping("/{customerId}/transactions")
    public ResponseEntity<List<?>> getCardTransactions(@PathVariable("customerId") String customerId) {
        return ResponseEntity.ok(null);
    }

    // Adjust credit limit
    @PatchMapping("/{customerId}/limit")
    public ResponseEntity<String> adjustCreditLimit(@PathVariable("customerId") String customerId,
                                                    @RequestBody Object limitAdjustment) {
        return ResponseEntity.ok("Credit limit adjusted to: ");
    }
}
