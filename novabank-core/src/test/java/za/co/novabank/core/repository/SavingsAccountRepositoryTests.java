package za.co.novabank.core.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import za.co.novabank.core.enums.account.AccountCategory;
import za.co.novabank.core.enums.account.AccountStatus;
import za.co.novabank.core.enums.account.AccountType;
import za.co.novabank.core.model.account.primary.SavingsAccount;

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
    private SavingsAccount activeSavingsAccount;
    private SavingsAccount inactiveSavingsAccount;

    @BeforeEach
    void setUp() {
        activeSavingsAccount = new SavingsAccount();
        activeSavingsAccount.setStatus(AccountStatus.ACTIVE);
        activeSavingsAccount.setCategory(AccountCategory.PERSONAL);
        activeSavingsAccount.setType(AccountType.SAVINGS);
        savingsAccountRepository.save(activeSavingsAccount);
        inactiveSavingsAccount = new SavingsAccount();
        inactiveSavingsAccount.setStatus(AccountStatus.INACTIVE);
        inactiveSavingsAccount.setCategory(AccountCategory.PERSONAL);
        inactiveSavingsAccount.setType(AccountType.SAVINGS);
        savingsAccountRepository.save(inactiveSavingsAccount);
    }
    @Test
    void testFindByStatus() {
        List<SavingsAccount> activeAccounts = savingsAccountRepository.findByStatus(AccountStatus.ACTIVE);
        List<SavingsAccount> inactiveAccounts = savingsAccountRepository.findByStatus(AccountStatus.INACTIVE);
        assertEquals(1, activeAccounts.size(), "There should be one active account");
        assertTrue(activeAccounts.contains(activeSavingsAccount), "Active account should be present");
        assertEquals(1, inactiveAccounts.size(), "There should be one inactive account");
        assertTrue(inactiveAccounts.contains(inactiveSavingsAccount), "Inactive account should be present");
    }
    @Test
    void testFindByType() {
        List<SavingsAccount> savingsAccounts = savingsAccountRepository.findByType(AccountType.SAVINGS);
        //assertEquals(2, savingsAccounts.size(), "There should be two savings accounts");
        assertTrue(savingsAccounts.contains(activeSavingsAccount), "Active savings account should be present");
        assertTrue(savingsAccounts.contains(inactiveSavingsAccount), "Inactive savings account should be present");
    }
    @Test
    void testFindByIdAndLock() {
        Optional<SavingsAccount> lockedAccount = savingsAccountRepository.findById(activeSavingsAccount.getId());
        assertTrue(lockedAccount.isPresent(), "Locked account should be present");
        lockedAccount.ifPresent(account ->
                assertEquals(activeSavingsAccount, account, "Locked account should be the active savings account"));
    }
}
