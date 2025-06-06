package week7.OurLinkedList;



public class NodeTester {
    public static void main(String[] args) {
        //try creating and testing a node
        Node node1 = new Node(10);
        System.out.println(node1);

        //Add a couple more nodes
        Node node2 = new Node(11);
        node1.setLink(node2);
        System.out.println(node2);
        Node node3 = new Node(12);
        node2.setLink(node3);
//
//
//        //print out list
        Node currentNode = node1;
        while (currentNode != null) {
            System.out.print(currentNode + " ");
            currentNode = currentNode.getLink();
        }
        System.out.println();
    }
}
