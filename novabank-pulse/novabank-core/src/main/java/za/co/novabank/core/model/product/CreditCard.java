package za.co.novabank.core.model.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Noxolo.Mkhungo
 */
@Builder
@AllArgsConstructor
@Data
@Entity
@Table(name = "credit_cards")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long id;
    @Column(name = "card_number", nullable = false, unique = true)
    private String cardNumber;
    @Column(name = "credit_limit", nullable = false)
    private BigDecimal creditLimit;
    @Column(name = "interest_rate", nullable = false)
    private BigDecimal interestRate;
    /*@ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;*/
    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
