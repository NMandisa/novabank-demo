package za.co.novabank.core.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import za.co.novabank.core.enums.TransactionType;

import java.time.LocalDateTime;

/**
 * DTO for transaction information.
 * @author Noxolo.Mkhungo
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionDTO {
    private Long id;
    private CustomerDTO customer;
    private LocalDateTime transactionDate;
    private Double amount;
    private String description;
    private TransactionType transactionType;
}
