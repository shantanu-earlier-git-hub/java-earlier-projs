package basic.trees;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor

@Getter
@Setter

public class Node {

    private Data data;
    private Node left;
    private Node right;
}
