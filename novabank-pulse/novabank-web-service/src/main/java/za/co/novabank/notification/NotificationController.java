package za.co.novabank.notification;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.novabank.merchant.PaymentGatewayController;

import java.util.Map;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/notifications")
public class NotificationController {
    /**
     * Transaction Notification Setup
     * Allows customers to enable/disable transaction notifications for their accounts.
     * @param customerId - The unique identifier of the customer
     * @param enable - Boolean flag to enable/disable transaction notifications
     * @return A response indicating success or failure
     */
    @PostMapping("/transactions")
    public ResponseEntity<String> setTransactionNotification(@RequestParam("customerId") String customerId,
                                                             @RequestParam("enable") boolean enable) {
        return ResponseEntity.ok("Transaction notifications " + (enable ? "enabled" : "disabled") + " for customer " + customerId);
    }

    /**
     * Custom Alerts Setup
     * Allows customers to configure custom alerts (e.g., balance threshold, spending limit, etc.).
     * @param customerId - The unique identifier of the customer
     * @param alertType - The type of the custom alert (e.g., "balance", "spendingLimit")
     * @param enable - Boolean flag to enable/disable the custom alert
     * @return A response indicating success or failure
     */
    @PostMapping("/custom")
    public ResponseEntity<String> setCustomAlert(@RequestParam("customerId") String customerId,
                                                 @RequestParam("alertType") String alertType,
                                                 @RequestParam("enable") boolean enable) {
        return ResponseEntity.ok("Custom alert '" + alertType + "' " + (enable ? "enabled" : "disabled") + " for customer " + customerId);
    }

    /**
     * View Notifications for a Customer
     * Retrieves the notification preferences for a specific customer.
     * @param customerId - The unique identifier of the customer
     * @return A map of notifications settings for the customer
     */
    @GetMapping("/{customerId}")
    public ResponseEntity<Map<String, Boolean>> getNotifications(@PathVariable("customerId") String customerId) {
        return ResponseEntity.ok(null);
    }
}
