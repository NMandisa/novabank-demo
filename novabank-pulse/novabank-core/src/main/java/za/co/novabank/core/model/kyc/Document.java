package za.co.novabank.core.model.kyc;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import za.co.novabank.core.enums.kyc.DocumentStatus;
import za.co.novabank.core.enums.kyc.DocumentType;

/**
 * @author Noxolo.Mkhungo
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "documents")
public class Document {
    @Id
    @SequenceGenerator(name = "document_generator", sequenceName = "sequence_document_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "document_generator")
    @Column(name = "document_id")
    private long id;

    @Column(name = "document_type")
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;
    @Column(name = "document_status")
    @Enumerated(EnumType.STRING)
    private DocumentStatus documentStatus;
}
