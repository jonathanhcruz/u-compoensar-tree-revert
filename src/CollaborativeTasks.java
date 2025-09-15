public class CollaborativeTasks {
    public void reverseOrder(Node node) {
        if (node != null) {
            reverseOrder(node.right);
            System.out.print(node.value + " ");
            reverseOrder(node.left);
        }
    }
}