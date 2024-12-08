package za.co.novabank.forex;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/forex")
public class ForexController {

    /**
     * Forex and International Transfers
     * Supports currency exchange and cross-border payments.
     * 1. Forex Rates Inquiry: GET /forex/rates
     * 2. International Funds Transfer: POST /forex/transfer
     */
    // Example endpoint for converting currencies
    @GetMapping("/convert")
    public ResponseEntity<Double> convertCurrency(@RequestParam String fromCurrency, @RequestParam String toCurrency, @RequestParam double amount) {
        //double convertedAmount = forexService.convertCurrency(fromCurrency, toCurrency, amount);
        //return ResponseEntity.ok(convertedAmount);
        return null;
    }

    // Other Forex-related methods like get Forex rates, etc.
}

