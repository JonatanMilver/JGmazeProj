package algorithms.search;

public abstract class ASearchingAlgorithm implements ISearchingAlgorithm {

    private String algo_name;
    private int visitedNode;

    public ASearchingAlgorithm(String algo_name) {
        this.algo_name = algo_name;
        this.visitedNode = 0;
    }

    public String getName() {
        return algo_name;
    }

    public int getVisitedNode() {
        return visitedNode;
    }

    public void setVisitedNode(int visitedNode) {
        this.visitedNode = visitedNode;
    }

    public void increaseVisited(){
        this.visitedNode++;
    }
}