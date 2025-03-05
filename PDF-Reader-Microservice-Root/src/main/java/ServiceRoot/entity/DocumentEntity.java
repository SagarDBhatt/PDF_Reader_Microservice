package ServiceRoot.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DocumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Getter
    @Setter
    private String document_name;

    @Getter
    @Setter
    private String document_type;

    @Lob
    @Getter
    @Setter
    private byte[] document_binary_data;

}
