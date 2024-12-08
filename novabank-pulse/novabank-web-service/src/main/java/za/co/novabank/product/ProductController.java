package za.co.novabank.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/products")
public class ProductController {
    //Listing all available financial products.
    //Providing details of a specific product (interest rates, terms, etc.).
    //Managing product creation, updating, or deletion if applicable (e.g., adding new types of savings accounts or credit cards).
    //Managing customer sign-ups or subscriptions to various products.

    // List All Available Financial Products
    @GetMapping("/list")
    public ResponseEntity<List<?>> listAllProducts() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    // Get Details of a Specific Product
    @GetMapping("/{productId}")
    public ResponseEntity<?> getProductDetails(@PathVariable("productId") String productId) {
        return ResponseEntity.ok(null);
    }

    // Create or Update Financial Product
    @PostMapping("/create")
    public ResponseEntity<String> createOrUpdateProduct(@RequestBody Object product) {
        return ResponseEntity.ok("Product  has been created or updated.");
    }

    // Delete Financial Product
    @DeleteMapping("/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable("productId") String productId) {
        return ResponseEntity.ok("Product " + productId + " has been deleted.");
    }

    // Subscribe to a Financial Product
    @PostMapping("/subscribe")
    public ResponseEntity<String> subscribeToProduct(@RequestBody Object subscription) {
       // customerSubscriptions.put(subscription.getCustomerId(), subscription);
        return ResponseEntity.ok("Subscribed to " + subscription.toString());
    }

    // Get Customer Subscriptions
    @GetMapping("/{customerId}/subscriptions")
    public ResponseEntity<List<?>> getCustomerSubscriptions(@PathVariable("customerId") String customerId) {
        //CustomerSubscription subscription = customerSubscriptions.get(customerId);
        return ResponseEntity.ok(null);
    }
}
