package za.co.novabank;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("compliance")
public class ComplianceController {
}
