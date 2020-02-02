package graph.adjacencylist;

import java.util.*;

class Graph<T> {

    private Map<T, List<T>> map = new HashMap<>();

    public void addEdge(T source, T destination){
        if(!map.containsKey(source)){
            List<T> list = new LinkedList<>();
            list.add(destination);
            map.put(source, list);
        }
        else{
            List<T> list = map.get(source);
            list.add(destination);
            map.put(source, list);
        }
    }

    public void printGraph(){
        Iterator <T> it = map.keySet().iterator();
        while(it.hasNext()){
            T key = it.next();
            System.out.print(key+"->");
            List<T> list = map.get(key);
            for(int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+"->");
            }
            System.out.println();
        }
    }
}
public class GenericGraph {
    
    public static void main(String[] args) {

        Graph<Integer> g = new Graph<Integer>();

        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 5);
        g.addEdge(2, 4);
        g.addEdge(2, 0);
        g.addEdge(3, 2);
        g.addEdge(5, 2);
        g.addEdge(5, 4);

        g.printGraph();
    }
}
