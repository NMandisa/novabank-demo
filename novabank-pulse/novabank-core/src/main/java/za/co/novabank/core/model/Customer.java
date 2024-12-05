package za.co.novabank.core.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import za.co.novabank.core.enums.IdentificationType;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Noxolo.Mkhungo
 */
@AllArgsConstructor
@Builder
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @SequenceGenerator(name = "customer_generator", sequenceName = "sequence_customer_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_generator")
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "identification_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private IdentificationType identificationType;

    @Column(name = "identification", nullable = false, unique = true)
    private String identification;

    @Column(name = "email", nullable = false)
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    @Size(max = 100, message = "Email should not be more than 100 characters")
    private String email;

    @Column(name = "phone", nullable = false)
    @NotBlank(message = "Phone number is mandatory")
    @Size(max = 15, message = "Phone number should not be more than 15 characters")
    @Pattern(regexp = "^\\+?[0-9. ()-]{7,15}$", message = "Phone number is invalid")
    private String phone;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Customer() {

    }
}
