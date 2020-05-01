package creational.design.pattern.Factory;

public class MainClass {
    public static void main(String args[]){
        AlgorithmInterface algorithmInterface= AlgorithmFactory.createAlgorithm(AlgorithmFactory.SHORTEST_PATH);
        algorithmInterface.solve();
    }
}
