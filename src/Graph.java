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
    	/*
         * adds starting node to stack and changes status to waiting
         * 
         * in the loop:
         * pops head node and prints its label
         * pushes all ready adjacent nodes to stack
         * changes status of popped node to processed
         * increments loop counter
         * 
         * 
         */
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
    	/*
         * adds starting node to queue and changes status to waiting
         * 
         * in the loop:
         * pops head node and prints its label
         * pushes all ready adjacent nodes to queue
         * changes status of popped node to processed
         * increments loop counter
         * 
         * 
         */
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