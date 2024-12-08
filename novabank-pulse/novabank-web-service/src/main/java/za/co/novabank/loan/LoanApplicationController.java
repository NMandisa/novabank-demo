package za.co.novabank.loan;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/loan-application")
public class LoanApplicationController {

    // Accepting loan applications from customers
    @PostMapping
    public ResponseEntity<String> submitLoanApplication(@RequestBody Object loanApplication) {
        // Validate application data (e.g., credit score, income, etc.)
        // Simulate saving the application (in a real system, save to a database)
        return ResponseEntity.ok("Loan application submitted successfully with ID: " + 1L);
    }

    // Check the status of a loan application
    @GetMapping("/{applicationId}/status")
    public ResponseEntity<String> getApplicationStatus(@PathVariable String applicationId) {
        // Simulate application review logic (status can be 'pending', 'approved', 'rejected')
        return ResponseEntity.ok(null);
    }

    // Submit required documents (for example, ID, proof of income, etc.)
    @PostMapping("/{applicationId}/submit-documents")
    public ResponseEntity<String> submitDocuments(@PathVariable String applicationId, @RequestBody Object documentSubmission) {
        // Simulate storing the documents (In real-world, save the document files to a server or database)
        return ResponseEntity.ok("Documents successfully submitted for application ID: " + applicationId);
    }

    // Helper method to validate the loan application (e.g., check credit score, income level)
    private boolean isValidLoanApplication(Object loanApplication) {
        // Simulate basic validation logic (e.g., check if income is above a threshold, credit score is valid)
        // Reject applications with low credit score
        // Reject applications with low income
        // Additional validation can be added here based on business requirements
        return false;
    }
}
