public class Tree {
    double heightFt;
    double trunkDiameter;
    TreeType treeType;

    Tree(double heightFt, double trunkDiameter, TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }
}