import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    ArrayList<Node> graph;
    Stack<Node> stack = new Stack<Node>();
    Queue<Node> queue = new PriorityQueue<Node>();
    public Graph() {
        graph = new ArrayList<Node>();
    }


    public void addNode(Node node) {
        graph.add(node);
    }

    public void addEdge(Node parent, Node child) {
        parent.addPointer(child);
    }

    public void printGraph() {
        for(Node node: graph) {
            node.printNode();
        }
    }

    public void DFT(Node node) {
        for(Node n: graph) {
            n.status = 0;
        }
        stack.add(node);
        node.status = 1;
        int processed = 0;
        while(processed < graph.size()) {
            Node current = stack.pop();
            System.out.print(current.getLabel() + " ");
            for(Node adj: current.pointers) {
                if(adj.status == 0) {
                    stack.push(adj);
                    adj.status = 1;
                }
            }
            current.status = 3;
            processed++;
        }
    }
    public void BFT(Node node) {
        for(Node n: graph) {
            n.status = 0;
        }
        queue.add(node);
        node.status = 1;
        int processed = 0;
        while(processed < graph.size()) {
            Node current = queue.poll();
            System.out.print(current.getLabel() + " ");
            for(Node adj: current.pointers) {
                if(adj.status == 0) {
                    queue.add(adj);
                    adj.status = 1;
                }
            }
            current.status = 3;
            processed++;
        }

        System.out.println("");
    }
}