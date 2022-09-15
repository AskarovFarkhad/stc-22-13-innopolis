package OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Passport {

    @Id
    private String data;
}
