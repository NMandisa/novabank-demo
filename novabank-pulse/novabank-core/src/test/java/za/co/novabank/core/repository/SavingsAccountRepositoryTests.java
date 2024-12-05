package za.co.novabank.core.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import za.co.novabank.core.enums.IdentificationType;
import za.co.novabank.core.enums.account.AccountCategory;
import za.co.novabank.core.enums.account.AccountStatus;
import za.co.novabank.core.enums.account.AccountType;
import za.co.novabank.core.model.Customer;
import za.co.novabank.core.model.account.primary.SavingsAccount;
import za.co.novabank.core.repository.account.SavingsAccountRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


/**
 * @author Noxolo.Mkhungo
 */
@Slf4j
@SpringJUnitConfig
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:/META-INF/core-application-context.xml")
@Rollback(value = false)
class SavingsAccountRepositoryTests {
    @Autowired
    private SavingsAccountRepository savingsAccountRepository;
    @Autowired
    private CustomerRepository customerRepository;
    private Customer customer1;
    private Customer customer2;
    private SavingsAccount activeSavingsAccount;
    private SavingsAccount inactiveSavingsAccount;
    @BeforeEach
    void setUp() {
        customer1 = Customer.builder().phone("89345432543") .email("test@mail.com")
                .identificationType(IdentificationType.NATIONAL_ID)
                .identification("43532534fdw").fullName("Noxolo Mkhungo") .build();
        customerRepository.save(customer1);
        customer2 = Customer.builder().phone("55342o954").email("novabank@mail.com")
                .identificationType(IdentificationType.NATIONAL_ID)
                .identification("6903mgewi4").fullName("Mandisa Mkhungo").build();
        customerRepository.save(customer2);

        activeSavingsAccount = new SavingsAccount();
        activeSavingsAccount.setAccountNumber("685767434363643");
        activeSavingsAccount.setStatus(AccountStatus.ACTIVE);
        activeSavingsAccount.setCategory(AccountCategory.PERSONAL);
        activeSavingsAccount.setTransactions(null);
        activeSavingsAccount.setBalance(32.32D);
        activeSavingsAccount.setType(AccountType.SAVINGS);
        activeSavingsAccount.setCustomer(customer1);
        savingsAccountRepository.save(activeSavingsAccount);
        inactiveSavingsAccount = new SavingsAccount();
        inactiveSavingsAccount.setAccountNumber("324342254534453");
        inactiveSavingsAccount.setStatus(AccountStatus.INACTIVE);
        inactiveSavingsAccount.setCategory(AccountCategory.PERSONAL);
        inactiveSavingsAccount.setType(AccountType.SAVINGS);
        inactiveSavingsAccount.setTransactions(null);
        inactiveSavingsAccount.setBalance(672.32D);
        inactiveSavingsAccount.setCustomer(customer2);
        savingsAccountRepository.save(inactiveSavingsAccount);
    }
    @Test
    @DisplayName("Find By Status")
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
    void testFindByStatus() {
        List<SavingsAccount> activeAccounts = savingsAccountRepository.findByStatus(AccountStatus.ACTIVE);
        List<SavingsAccount> inactiveAccounts = savingsAccountRepository.findByStatus(AccountStatus.INACTIVE);
        assertEquals(1, activeAccounts.size(), "There should be one active account");
        assertTrue(activeAccounts.contains(activeSavingsAccount), "Active account should be present");
        assertEquals(1, inactiveAccounts.size(), "There should be one inactive account");
        assertTrue(inactiveAccounts.contains(inactiveSavingsAccount), "Inactive account should be present");
    }
    @Test
    @DisplayName("Find By Type")
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
    void testFindByType() {
        List<SavingsAccount> savingsAccounts = savingsAccountRepository.findByType(AccountType.SAVINGS);
        //assertEquals(2, savingsAccounts.size(), "There should be two savings accounts");
        assertTrue(savingsAccounts.contains(activeSavingsAccount), "Active savings account should be present");
        assertTrue(savingsAccounts.contains(inactiveSavingsAccount), "Inactive savings account should be present");
    }
    @Test
    @DisplayName("Find Account by ID")
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
    void testFindByIdAndLock() {
        Optional<SavingsAccount> lockedAccount = savingsAccountRepository.findById(activeSavingsAccount.getId());
        assertTrue(lockedAccount.isPresent(), "Locked account should be present");
        lockedAccount.ifPresent(account ->
                assertEquals(activeSavingsAccount, account, "Locked account should be the active savings account"));
    }
}
