package entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "candidate")
public class Candidate {
    @Id
    private String id;

    private String name;

    private double exp;

    @Indexed(unique = true)
    private String email;

}