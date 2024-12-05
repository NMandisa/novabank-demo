package za.co.novabank.transaction;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("transactions")
public class TransactionController {
}
