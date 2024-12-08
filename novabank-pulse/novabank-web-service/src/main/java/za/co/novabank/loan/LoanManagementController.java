package za.co.novabank.loan;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/loan-management")
public class LoanManagementController {

    // 1. Track loan repayment schedules
    @GetMapping("/{loanId}/repayment-schedule")
    public ResponseEntity<String> getRepaymentSchedule(@PathVariable Long loanId) {
        // Add detailed schedule (monthly breakdown, etc.)
        return ResponseEntity.ok(null);
    }

    // 2. Handle loan disbursements (transferring loan amounts to customers)
    @PostMapping("/{loanId}/disburse")
    public ResponseEntity<String> disburseLoan(@PathVariable Long loanId) {
        // Logic for loan disbursement (e.g., transferring funds)
        // Here we just simulate that the loan amount is transferred
        return ResponseEntity.ok("Loan disbursed successfully for loan ID: " + loanId);
    }

    // 3. Manage loan statuses (active, paid off, default, etc.)
    @GetMapping("/{loanId}/status")
    public ResponseEntity<String> getLoanStatus(@PathVariable Long loanId) {
        return ResponseEntity.ok("Loan ID: " + loanId + " Status: " );
    }

    // 4. Handle early repayments, loan extensions, or modifications
    @PostMapping("/{loanId}/early-repayment")
    public ResponseEntity<String> makeEarlyRepayment(@PathVariable Long loanId, @RequestBody Object repayment) {
        return ResponseEntity.ok("Early repayment made successfully. Remaining balance: ");
    }

    // Handle loan extensions
    @PostMapping("/{loanId}/extend")
    public ResponseEntity<String> extendLoan(@PathVariable Long loanId, @RequestParam int additionalMonths) {
        return ResponseEntity.ok("Loan extension successful. New term: " + "loan.getRepaymentTermMonths()" + " months.");
    }

    // 5. Generate reports about loan performance or defaults
    @GetMapping("/loan-reports")
    public ResponseEntity<String> generateLoanReport() {
        // For the sake of simplicity, let's just list all loan statuses
        return ResponseEntity.ok(null);
    }

    // Helper to simulate creating a new loan (for testing purposes)
    @PostMapping("/create")
    public ResponseEntity<String> createLoan(@RequestBody Object loanRequest) {
        return ResponseEntity.ok("Loan created successfully with ID: ");
    }

}