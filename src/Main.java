public class Main {
    public static void main(String[] args) {
        CollaborativeTasks ct = new CollaborativeTasks();

        System.out.println("\n Tree numbers in descending order: ");
        Node exampleTree = new Node(50);
        exampleTree.left = new Node(30);
        exampleTree.right = new Node(70);
        exampleTree.left.left = new Node(20);
        exampleTree.left.right = new Node(40);
        exampleTree.right.left = new Node(60);
        exampleTree.right.right = new Node(80);

        ct.reverseOrder(exampleTree);
        // Expected output: 80 70 60 50 40 30 20
    }
}

