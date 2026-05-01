package basics.collectionspk.comparatorsex;

import com.sun.source.tree.Tree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Objects;
import java.util.TreeSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    private String name;

    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
