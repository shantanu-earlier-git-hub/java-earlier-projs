package jpa.app.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Embeddable
@Data
public class StoreDetails {

    @ManyToMany
    List<Store> stores;

}
