package CompositePattern;

public class Client {
    public static void operate() {
        FileComponent file1 = new FileLeaf("File1.txt", 100);
        FileComponent file2 = new FileLeaf("File2.txt", 150);
        FileComponent file3 = new FileLeaf("File3.txt", 200);

        DirectoryComposite dir1 = new DirectoryComposite("Directory1");
        DirectoryComposite dir2 = new DirectoryComposite("Directory2");

        dir1.addComponent(file1);
        dir1.addComponent(file2);
        dir2.addComponent(file3);
        dir2.addComponent(dir1);

        /*
        *
        * [ dir2
        *   [ file3
        *   [ dir1
         *      [ file1
         *      [ file2
        * */


        dir2.showProperty();
        System.out.println("Total size: " + dir2.totalSize());
    }
}


