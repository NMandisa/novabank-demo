package za.co.novabank.analytics;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/analytics")
public class AnalyticsController {

    //Generating and presenting reports related to account activity, loan performance, or transactions.
    //Analyzing trends and patterns in transactions, deposits, withdrawals, etc.
    //Providing performance indicators for different services (e.g., customer growth, loan disbursal rates, etc.).
    //Offering custom reports or data export options for stakeholders.
}