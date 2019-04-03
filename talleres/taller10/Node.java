public class Node {
    public Node left;
    public Node right;
    public int n;
    public Node(int n){
        this.n = n;
        right = left = null; 
    }
}