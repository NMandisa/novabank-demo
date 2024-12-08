package za.co.novabank.merchant;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@Slf4j
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/merchant/payment/gateway")
public class PaymentGatewayController {

    // 1. Initiate a payment
    @PostMapping("/initiate")
    public ResponseEntity<String> initiatePayment(@RequestBody Object paymentRequest) {
        // Simulate interaction with a payment gateway to initiate a transaction
        // send the paymentRequest data to the payment gateway here
        log.info("Initiating payment with ID:");
        // Return a response indicating the payment initiation
        return ResponseEntity.ok("Payment initiated with ID: ");
    }

    // Get transaction status
    @GetMapping("/status/{paymentId}")
    public ResponseEntity<String> getTransactionStatus(@PathVariable("paymentId") String paymentId) {
        if (paymentId == null || paymentId.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid payment ID.");
        }
        // Simulate a transaction status response for the given payment ID.
        // In reality, you'd retrieve the status from the payment gateway.
        String status = "successful";
        // This would come from the payment gateway in a real implementation.
        log.info("Payment status for Payment ID {}: {}", paymentId, status);
        return ResponseEntity.ok("Transaction " + paymentId + " is " + status);
    }

    // Handle payment callback from the gateway (e.g., success or failure)
    @PostMapping("/callback")
    public ResponseEntity<String> paymentCallback(@RequestBody Object callback) {
        // Logic to handle callback from the payment gateway
        // For example, updating the transaction status in your system
        log.info("Received payment callback for Payment ID:  with status: ");
        // In a real-world scenario, update the payment status in your database, notify the merchant, etc.
        return ResponseEntity.ok("Payment callback received: ");
    }
}

