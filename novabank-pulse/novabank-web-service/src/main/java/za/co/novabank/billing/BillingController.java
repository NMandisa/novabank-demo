package za.co.novabank.billing;

import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/billing")
public class BillingController {

    /*1. Utility Bill Payment: POST /billing/pay
     * Payload:{"accountId": "string","billId": "string","amount": "number","reference": "string"}
     * 2. Payee Management: POST /billing/payees
     * DELETE /billing/payees/{payeeId}
     * 3. Payment History:GET /billing/history
     */
    /*Workflow and Integration Between Controllers:

    BillingController:
        The BillingController manages the overall billing process, such as creating billing cycles, processing payments, and tracking outstanding balances.
        It will typically interact with the InvoiceController when a payment is made (i.e., once a payment is processed through BillingController, an invoice is generated or updated in InvoiceController).
        It might also use InvoiceController to retrieve detailed information about the latest invoice for a customer.

    InvoiceController:
        The InvoiceController is responsible for managing invoices, including creating, updating, and sending them to customers.
        It works closely with BillingController when a new invoice needs to be created or updated based on billing activities (e.g., monthly account charges, loan repayments).
        It can also interact with BillingController to ensure that any adjustments made to invoices (such as discounts or refunds) are reflected in the overall billing system.
     */
    // Endpoint to get a customer's outstanding balance and latest bill
    @GetMapping("/{customerId}/balance-and-bill")
    public void balanceAndBill(@PathVariable("customerId") String customerId){}
    // Endpoint to generate billing cycle for a customer
    @PostMapping("/generate/{customerId}")
    public void  generateBillingCycle(@PathVariable String customerId, @RequestBody Object billingCycle) {}
    // Endpoint to generate a bill and process payment for a customer
    @PostMapping("/generate-and-pay/{customerId}")
    public void generateAndPayBill(@PathVariable("customerId") String customerId){}
    // Endpoint to process payment for a customer
    @PostMapping("/process-payment/{customerId}")
    public void processPayment(@PathVariable("customerId") String customerId, @RequestBody Object payment) {}
    // Endpoint to get the status of the latest bill for a customer
    @GetMapping("/{customerId}/latest-bill")
    public void latestBill(@PathVariable("customerId") String customerId) {}
    // Endpoint to manage recurring payments (e.g., for subscriptions or services)
    @PostMapping("/recurring/{customerId}")
    public void setRecurring(@PathVariable("customerId") String customerId, @RequestBody Object recurring) {}
}
