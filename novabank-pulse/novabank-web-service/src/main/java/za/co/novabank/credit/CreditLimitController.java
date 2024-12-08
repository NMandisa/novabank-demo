package za.co.novabank.credit;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/credit-limit")
public class CreditLimitController {
    /*
    Setting credit limits: Establishing initial credit limits for customers.
    Modifying credit limits: Adjusting credit limits based on customer usage, payment history, or other factors.
    Credit limit checks: Checking whether a customer’s credit utilization has exceeded the limit.
    Notifications: Notifying customers about changes to their credit limits (both increases and decreases).
    Credit limit reviews: Periodically reviewing and updating credit limits based on the customer’s financial behavior.
     */
    // Endpoint to view current credit limit for a customer
    @GetMapping("/{customerId}")
    public ResponseEntity<String> getCreditLimit(@PathVariable("customerId") String customerId) {
        Double creditLimit = 934D;

        if (creditLimit == null) {
            return ResponseEntity.status(404).body("No credit limit found for customer: " + customerId);
        }

        return ResponseEntity.ok("Customer " + customerId + "'s credit limit: " + creditLimit);
    }

    // 2. Endpoint to increase a customer's credit limit: PUT /credit-limit/{customerId}/increase
    @PutMapping("/{customerId}/increase")
    public ResponseEntity<String> increaseCreditLimit(@PathVariable("customerId") String customerId, @RequestParam double amount) {
        return ResponseEntity.ok("Credit limit for customer " + customerId + " increased to: " );
    }

    // Endpoint to decrease a customer's credit limit
    @PutMapping("/{customerId}/decrease")
    public ResponseEntity<String> decreaseCreditLimit(@PathVariable("customerId") String customerId, @RequestParam double amount) {
        return ResponseEntity.ok("Credit limit for customer " + customerId + " decreased to: " );
    }

    // 4. Endpoint to check if a customer has exceeded their credit limit
    @GetMapping("/{customerId}/over-limit")
    public ResponseEntity<String> getCreditLimitOverLimit(@PathVariable("customerId") String customerId) {
        Double creditLimit = 98D;
        Double currentBalance = 796D;

        boolean isOverLimit = currentBalance > creditLimit;
        if (isOverLimit) {
            return ResponseEntity.ok("Customer " + customerId + " has exceeded their credit limit.");
        } else {
            return ResponseEntity.ok("Customer " + customerId + " is within their credit limit.");
        }
    }

}
