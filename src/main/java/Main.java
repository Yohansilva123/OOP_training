public class Main {

    public static void main(String[] args){

       Tree oakTree =  new Tree(25,5,TreeType.OAK);
//       System.out.println(oakTree.treeType);
//       System.out.println(oakTree.heightFt);
       oakTree.grow();
       oakTree.announceTallTree();

//        System.out.println(oakTree.trunkDiameter);
//        System.out.println(oakTree.heightFt);

        Tree mapleTree = new Tree(110,10,TreeType.MAPLE);
        mapleTree.announceTallTree();
    }
}
