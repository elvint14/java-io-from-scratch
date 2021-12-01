package az.et.lesson00;

import java.io.*;

public class SimpleBufferCopyingApp {
    public static void main(String[] args) throws IOException {
        File source = new File("/home/elvin/Prog/IdeaProjects/study/java-io-zero-to-advanced/src/main/java/az/et/lesson00/second.txt");
        File destination = new File("/home/elvin/Prog/IdeaProjects/study/java-io-zero-to-advanced/src/main/java/az/et/lesson00/second_copy.txt");
        copy(source, destination);
    }

    public static void copy(File source, File destination) throws IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(source));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
    }
}