package jpa.api.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jpa.api.entities.embed.DeptPK;
import lombok.Data;


@Entity
@Data
@Table(name = "department")
public class Dept {

    @EmbeddedId
    private DeptPK id;

    private String name;
}
