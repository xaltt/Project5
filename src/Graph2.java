import java.util.Iterator;
import java.util.LinkedList;

// This class implements the Depth First Traversal
class Graph2 {
    private int V; // No. of vertices

    // Array of lists
    private LinkedList<Integer> adj[];
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    Graph2(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    
    // add edge
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    
    void DFSUtil(int v, boolean visited[]) {
        // Mark node and print
        visited[v] = true;
        System.out.print((char)(v + 65) + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

}