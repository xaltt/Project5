import java.util.ArrayList;

class Node implements Comparable{
        private char label;
        ArrayList<Node> pointers = new ArrayList<Node>();
        int status = 0;
        //0 ready
        //1 waiting
        //2 processed


        public Node(char label) {
            this.label = label;
        }

        public void addPointer(Node child) {
            pointers.add(child);
        }
        public char getLabel() {
            return label;
        }
        public void printNode() {
            for(Node pointer: pointers) {
                System.out.println("(" + label + ", " + pointer.getLabel() + ")");
            }
        }

        @Override
        public int compareTo(Object arg0) {
            // TODO Auto-generated method stub
            return 0;
        }
    }