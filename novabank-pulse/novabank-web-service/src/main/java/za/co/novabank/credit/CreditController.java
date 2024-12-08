package za.co.novabank.credit;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/credit")
public class CreditController {
    //Managing credit applications: Allows customers to apply for credit (e.g., personal loans, credit lines).
    //Assessing creditworthiness: Checks customer credit scores and other financial factors.
    //Approving or denying credit: Based on assessments, decides whether a customer qualifies for credit.
    //Credit reviews: Reviewing existing credit limits, increasing or decreasing them based on usage and payment history.
    //Repayment plans: Setting repayment schedules for approved credit accounts.

    // Credit Score Inquiry: GET /credit/scores
    @GetMapping("/scores")
    public ResponseEntity<String> getCreditScore(@RequestParam String customerId) {
        // Simulate checking customer credit score (For simplicity, returning random score)
        int score = (int) (Math.random() * 850); // Example: Credit scores typically range from 300 to 850
        return ResponseEntity.ok("Customer " + customerId + "'s credit score: " + score);
    }

    // Endpoint to apply for credit
    @PostMapping("/apply/{customerId}")
    public ResponseEntity<String> applyForCredit(@PathVariable("customerId") String customerId) {
        // Simulate the credit application process
        // For now, assume every application is successful and add it to the database
        return ResponseEntity.ok("Credit application submitted successfully for customer: " + customerId);
    }

    // Endpoint to view credit status:
    @GetMapping("/{customerId}/status")
    public ResponseEntity<String> getCreditStatus(@PathVariable("customerId") String customerId) {
        // Fetch the credit status for the customer
        return ResponseEntity.ok("Credit Status for customer ");
    }

    // Endpoint to review existing credit and possibly increase limit:
    @PutMapping("/review/{customerId}")
    public ResponseEntity<String> creditReview(@PathVariable("customerId") String customerId) {
        // Check if the customer has an existing credit application
        // Simulate a credit review (e.g., increasing credit limit or approving the application)
        // For simplicity, let's assume a 50% chance to increase the credit limit
        return ResponseEntity.ok("Credit review complete. New status: ");
    }
}
