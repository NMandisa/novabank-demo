package za.co.novabank.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import za.co.novabank.core.enums.account.AccountCategory;
import za.co.novabank.core.enums.account.AccountStatus;
import za.co.novabank.core.enums.account.AccountType;

/**
 * General DTO for account operations.
 * @author Noxolo.Mkhungo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
    private Long id;
    private CustomerDTO customer;
    private AccountCategory category;
    private AccountType type;
    private Double balance;
    private AccountStatus status;
}
