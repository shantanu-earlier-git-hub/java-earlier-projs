package jpa.app.dto;

import jakarta.persistence.OneToMany;
import jpa.app.entities.Documents;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;


import java.util.Collection;

@Value
@Data
@NoArgsConstructor
public class WriterDto {

    Integer id=0;

    String name="";

    @OneToMany
    Collection<Documents> documents=null;

}
