package za.co.novabank.loan;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("loans")
public class LoanController {

    // 1. Loan Application: POST /loans
    @PostMapping
    public Object applyForLoan(@RequestBody Object loanRequest) {
        //Object loan = new Object(loanIdCounter++, loanRequest.getCustomerId(), loanRequest.getLoanType(),
                //loanRequest.getLoanAmount(), loanRequest.getRepaymentTermMonths(), loanRequest.getInterestRate());
        //loans.add(loan);
        return null;
    }

    // 2. Loan Eligibility Check: GET /loans/eligibility
    @GetMapping("/eligibility")
    public String checkEligibility(@RequestParam String customerId) {
        // Simulate eligibility check logic (dummy logic: 70% chance to be eligible)
        boolean eligible = Math.random() > 0.3;  // Replace with actual credit score check logic
        return eligible ? "Eligible for a loan" : "Not eligible for a loan";
    }

    // 3. Loan Repayment: POST /loans/{loanId}/repayment
    @PostMapping("/{loanId}/repayment")
    public String repayLoan(@PathVariable Long loanId, @RequestBody Object repaymentRequest) {
        return null;
    }

    // 4. Loan Balance Inquiry: GET /loans/{loanId}/balance
    @GetMapping("/{loanId}/balance")
    public double getLoanBalance(@PathVariable Long loanId) {
        return 0.0;
    }

    // 5. Loan Amortization Schedule: GET /loans/{loanId}/amortization
    @GetMapping("/{loanId}/amortization")
    public List<String> getAmortizationSchedule(@PathVariable Long loanId) {
        //Optional<Loan> loanOptional = loans.stream().filter(loan -> loan.getLoanId().equals(loanId)).findFirst();

       /* if (loanOptional.isPresent()) {
            Loan loan = loanOptional.get();
            List<String> schedule = new ArrayList<>();
            double principal = loan.getLoanAmount();
            double monthlyInterestRate = loan.getInterestRate() / 100 / 12;
            double monthlyPayment = (loan.getLoanAmount() * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loan.getRepaymentTermMonths()));

            for (int month = 1; month <= loan.getRepaymentTermMonths(); month++) {
                double interestPayment = principal * monthlyInterestRate;
                double principalPayment = monthlyPayment - interestPayment;
                principal -= principalPayment;

                schedule.add(String.format("Month %d: Payment = %.2f, Principal = %.2f, Interest = %.2f, Balance = %.2f",
                        month, monthlyPayment, principalPayment, interestPayment, principal));
            }

            return schedule;
        } else {
            throw new RuntimeException("Loan not found");
        }*/
        return null;
    }

    // 6. Get Available Loan Types: GET /loans/types
    @GetMapping("/types")
    public ResponseEntity<List<String>> getAvailableLoanTypes() {
        List<String> loanTypes = new ArrayList<>();
        loanTypes.add("Personal Loan");
        loanTypes.add("Home Loan");
        loanTypes.add("Car Loan");
        loanTypes.add("Student Loan");
        return ResponseEntity.ok(loanTypes);
    }

    // 7. Calculate Loan EMI: GET /loans/emi
    @GetMapping("/emi")
    public ResponseEntity<Double> calculateEMI(@RequestParam double principal, @RequestParam double rate, @RequestParam int termInMonths) {
        // EMI Formula: EMI = [P x R x (1+R)^N] / [(1+R)^N-1]
        double monthlyInterestRate = rate / 100 / 12;
        double emi = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, termInMonths)) / (Math.pow(1 + monthlyInterestRate, termInMonths) - 1);
        return ResponseEntity.ok(emi);
    }

    // 8. Submit Loan Application: POST /loans/submit
    @PostMapping("/submit")
    public ResponseEntity<String> submitLoanApplication(@RequestBody Object loanApplication) {
        // Simulate loan submission logic here
        return ResponseEntity.ok("Application submitted successfully with ID: " + loanApplication);
    }

    // 9. Get Loan Application Status: GET /loans/{applicationId}/status
    @GetMapping("/{applicationId}/status")
    public ResponseEntity<String> getApplicationStatus(@PathVariable String applicationId) {
        // Simulate application status logic (in real-world, this will query a database)
        return ResponseEntity.ok("Application Status: Pending approval for Application ID: " + applicationId);
    }

    // Additional methods for validation, document submission, etc.
}
