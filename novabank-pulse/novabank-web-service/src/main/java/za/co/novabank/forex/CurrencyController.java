package za.co.novabank.forex;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/currencies")
public class CurrencyController {
    // Example endpoint to list all currencies
    @GetMapping("/")
    public ResponseEntity<List<Object>> getAllCurrencies() {
        return ResponseEntity.ok(null);
    }
    // Other Currency-related operations like adding, updating, or deleting a currency
}