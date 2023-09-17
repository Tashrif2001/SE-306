package fileIO;

import java.io.File;

public class FIleDemo {
	public void analyzePath(String path) {
		File name = new File(path);

		if (name.exists()) {
			System.out.printf("%s%s\n%s\ns%\n%s\n%s%s\n%s%s\\n%s%s\\n%s%s\\n%s%s", name.getName(), " exists",
					(name.isFile() ? "is a file" : "is not a file"),
					(name.isDirectory() ? "is a directory" : "is not a directory"),
					(name.isAbsolute() ? "is absolute path" : "is not absolute path"), name.lastModified(), "Length: ",
					name.length(), "Path: ", name.getPath(), "Absolute path: ", name.getAbsolutePath(), "Parent: ",
					name.getParent());
			if (name.isDirectory()) {
				String dir[] = name.list();
				System.out.println("\n\nDirectory contents:\n");

				for (String dirName : dir)
					System.out.printf("%s\n", dirName);
			}
		} else {
			System.out.printf("%s %s", path, "does not exist.");
		}
	}
}
