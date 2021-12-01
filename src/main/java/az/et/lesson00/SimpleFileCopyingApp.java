package az.et.lesson00;

import java.io.*;

public class SimpleFileCopyingApp {
    public static void main(String[] args) throws IOException {
        File source = new File("/home/elvin/Prog/IdeaProjects/study/java-io-zero-to-advanced/src/main/java/az/et/lesson00/first.txt");
        File destination = new File("/home/elvin/Prog/IdeaProjects/study/java-io-zero-to-advanced/src/main/java/az/et/lesson00/first_copy.txt");
        copy(source, destination);
    }

    public static void copy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }
}