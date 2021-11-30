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
        // adds edge
        void addEdge(int v,int w)
        {
            adj[v].add(w);
        }

        // prints from source s
        void BFS(int s)
        {
            // Marks visited vertices
            boolean visited[] = new boolean[V];

            //create q
            LinkedList<Integer> queue = new LinkedList<Integer>();

            // mark the actual visited vert
            visited[s]=true;
            queue.add(s);

            while (queue.size() != 0)
            {
                // Dequeue and print
                s = queue.poll();

                System.out.print((char)(s + 65) + " ");
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext())
                {
                    int n = i.next();
                    if (!visited[n])
                    {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
}
