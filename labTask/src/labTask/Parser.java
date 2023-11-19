package labTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Parser {

    public static void inspectClass(String filePath, String className) {
        try {
            // Read the source code file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder code = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                code.append(line).append("\n");
            }
            reader.close();

            // Extract the package name and class name
            String packageName = extractPackageName(code.toString());
            String fullClassName = packageName + "." + className;

            // Load the class using reflection
            Class<?> clazz = Class.forName(fullClassName);

            // Print package name
            System.out.println("Package: " + packageName);

            // Print fields
            System.out.println("Fields:");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println(field.getName());
            }

            // Print methods
            System.out.println("Methods:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println(method.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String extractPackageName(String code) {
        String packageKeyword = "package ";
        int packageIndex = code.indexOf(packageKeyword);
        if (packageIndex != -1) {
            int endIndex = code.indexOf(";", packageIndex);
            return code.substring(packageIndex + packageKeyword.length(), endIndex).trim();
        }
        return "";
    }

    public static void main(String[] args) {
        // Replace with the path to your source code file and the class name
        String filePath = "Phone.java";
        String className = "Phone";

        inspectClass(filePath, className);
    }
}
