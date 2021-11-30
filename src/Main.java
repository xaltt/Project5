public class Main {

    public Main() {
        Graph graph = new Graph();
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        Node i = new Node('I');

        graph.addEdge(a, b);
        graph.addEdge(a, d);
        graph.addEdge(a, e);

        graph.addEdge(b, e);

        graph.addEdge(c, b);

        graph.addEdge(d, g);

        graph.addEdge(e, f);
        graph.addEdge(e, h);

        graph.addEdge(f, c);
        graph.addEdge(f, h);

        graph.addEdge(g, h);

        graph.addEdge(h, i);

        graph.addEdge(i, f);

        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
        graph.addNode(d);
        graph.addNode(e);
        graph.addNode(f);
        graph.addNode(g);
        graph.addNode(h);
        graph.addNode(i);


        System.out.println("Breadth First Traversal starting at a:");
        graph.BFT(a);
        System.out.println("Depth First Traversal starting at a:");
        graph.DFT(a);
    }


    public static void main(String[]args) {
        new Main();
    }
}