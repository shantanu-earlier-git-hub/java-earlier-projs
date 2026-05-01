package basic.trees;

public class BinTree {

    private  Node root;
    private Node current;

    public Node add(Node node) {

        Node newNode = node;

        if(root.getData() !=null && root.getData().id > newNode.getData().id){
            root.setLeft(newNode);
        }
        else if(root.getData() !=null && root.getData().id < newNode.getData().id){
            root.setRight(newNode);
        }

        return newNode;
    }

    public void printTreeData(){

    }

    private Node buildNewNode(Data data){
        Node node = new Node(data, null, null);
        return node;
    }


    public static void main(String[] args) {

        Data data[]= {new Data(1,"name1"), new Data(2,"name2")};
        BinTree binTree = new BinTree();

        binTree.root = new Node (data[0], null, null);

    }
}
