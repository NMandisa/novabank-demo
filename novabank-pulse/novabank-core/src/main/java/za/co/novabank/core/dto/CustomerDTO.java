package za.co.novabank.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import za.co.novabank.core.enums.IdentificationType;

/**
 * DTO for customer information.
 * @author Noxolo.Mkhungo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String identification;
    private IdentificationType identificationType;
}
