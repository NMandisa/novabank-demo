package za.co.novabank.core.model.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import za.co.novabank.core.enums.LoanType;
import za.co.novabank.core.model.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Noxolo.Mkhungo
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private Long id;
    @Column(name = "loan_type", nullable = false)
    private LoanType loanType;
    @Column(name = "amount", nullable = false)
    private BigDecimal amount;
    @Column(name = "interest_rate", nullable = false)
    private BigDecimal interestRate;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
