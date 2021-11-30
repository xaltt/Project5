import java.util.LinkedList;
import java.util.*;
 

public class Graph extends Main {
     private int V;   // No. of vertices
        private LinkedList<Integer> adj[]; //Adjacency Lists


        @SuppressWarnings({ "unchecked", "rawtypes" })
        Graph(int v)
        {
            V = v;
            adj = new LinkedList[v];
            for (int i=0; i<v; ++i)
                adj[i] = new LinkedList();
        }

}