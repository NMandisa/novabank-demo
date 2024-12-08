package za.co.novabank.billing;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Generating invoices:
 * E.g., after a payment is processed, an invoice needs to be created.
 * Tracking invoice status: Whether the invoice is paid, overdue, or pending.
 * Sending invoices via email or other methods.
 * Invoice adjustments (e.g., discounts, refunds).
 *
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    // Endpoint to get all invoices for a customer
    @GetMapping("/customer/{customerId}")
    public void getInvoicesForCustomer(@PathVariable("customerId") String customerId) {}

    // Endpoint to update the status of an invoice (paid, overdue, etc.)
    @PutMapping("/{invoiceId}/status")
    public ResponseEntity<String> updateInvoiceStatus(@PathVariable String invoiceId, @RequestBody Object status) {
        return null;
    }

    // Endpoint to send the invoice to a customer via email
    @PostMapping("/{invoiceId}/send")
    public ResponseEntity<String> sendInvoiceByEmail(@PathVariable String invoiceId) {
        return null;
    }

    // Endpoint to apply adjustments to an invoice (e.g., discounts or refunds)
    @PutMapping("/{invoiceId}/adjustment")
    public ResponseEntity<String> applyAdjustment(@PathVariable String invoiceId, @RequestBody Object adjustment) {
        return null;
    }
}
