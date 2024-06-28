package encapsulation;

public class Tree {

    private double heightFt;
    private double trunkDiameter;
    private TreeType treeType;

    public Tree(double heightFt, double trunkDiameter, TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    public double getHeightFt(){
        return heightFt;
    }

    public double getTrunkDiameter() {
        return trunkDiameter;
    }

    void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }

    void announceTallTree(){
        if (this.heightFt > 100){
            System.out.println("That is a tall" + this.treeType + "tree");
        }
    }
}
