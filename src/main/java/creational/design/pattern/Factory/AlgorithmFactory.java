package creational.design.pattern.Factory;

public class AlgorithmFactory {
    public static final int SHORTEST_PATH = 0;
    public static final int SPANNING_TREE=1;

   public static AlgorithmInterface createAlgorithm(int type) {

       switch (type) {
           case SHORTEST_PATH:
              return new ShortestPathProblem();
           case SPANNING_TREE:
              return new SpanningTreeProblem();
           default:
               return null;
       }
   }
}
