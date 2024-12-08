package za.co.novabank.forex;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/exchange-rate")
public class ExchangeRateController {

    // Example endpoint to get exchange rate between two currencies
    @GetMapping("/rate")
    public ResponseEntity<Double> getExchangeRate(@RequestParam String fromCurrency, @RequestParam String toCurrency) {
        //double rate = exchangeRateService.getExchangeRate(fromCurrency, toCurrency);
        //return ResponseEntity.ok(rate);
        return null;
    }
    // Other ExchangeRate-related operations like fetching historical rates, etc.
}
