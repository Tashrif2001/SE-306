package labTask;
import java.io.File;

public class FIledemo {
    public void analyzePath(String path) {
        File name = new File(path);

        if (name.exists()) {
            if (name.isDirectory()) {
                String dir[] = name.list();
                System.out.println("\n\nDirectory contents:\n");

                for (String dirName : dir)
                    System.out.printf("%s\n", dirName);
            }
            System.out.println(
                    name.getName() + "\n" +
                            (name.isFile() ? "is a file" : "is not a file") + "\n" +
                            (name.isDirectory() ? "is a directory" : "is not a directory") + "\n" +
                            name.getPath() + "\n" +
                            (name.isAbsolute() ? "is absolute path" : "is not absolute path") + "\n" +
                            "Absolute path: " + name.getAbsoluteFile() + "\n" +
                            "Last modified: " + name.lastModified() + "\n" +
                            name.getParent() + "\n"
            );
        } else {
            System.out.printf("%s %s", path, "does not exist.");
        }
    }
}