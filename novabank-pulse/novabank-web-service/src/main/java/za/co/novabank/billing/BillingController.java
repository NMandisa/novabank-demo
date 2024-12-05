package za.co.novabank.billing;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("billing")
public class BillingController {
}
