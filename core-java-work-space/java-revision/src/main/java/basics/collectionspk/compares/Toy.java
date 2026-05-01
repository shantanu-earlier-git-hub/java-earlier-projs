package basics.collectionspk.compares;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Toy  implements Comparable<Toy> {

    private int model;

    @Override
    public int compareTo(Toy t) {
        return this.getModel() - t.getModel();
    }
}
