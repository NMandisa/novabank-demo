package za.co.novabank.core.model.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import za.co.novabank.core.enums.InvestmentType;
import za.co.novabank.core.model.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Noxolo.Mkhungo
 */
@Builder
@AllArgsConstructor
@Data
@Entity
@Table(name = "financial_investments")
public class FinancialInvestment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "investment_id")
    private Long id;

    @Column(name = "investment_type", nullable = false)
    private InvestmentType investmentType;
    @Column(name = "amount_invested", nullable = false)
    private BigDecimal amountInvested;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
