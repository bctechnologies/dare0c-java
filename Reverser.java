import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

public class Reverser {

    private Writer writer;

    public Reverser(Writer writer) {
        this.writer = writer;
    }

    public void reverse(Reader reader)
    throws IOException {
        // Insert code between here ...

        // ... and here!
    }

    public static void main(String[] args) {
        try {
            try (StringWriter writer = new StringWriter()) {
                Reverser reverser = new Reverser(writer);
                try (Reader reader = new BufferedReader(new FileReader("sample.txt"))) {
                    reverser.reverse(reader);
                }
                writer.flush();
                String result = writer.toString();
                if ("zyxwvutsrqponmlkjihgfedcba".equals(result)) {
                    System.out.println("OK");
                    return;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("FAILED!");
        System.exit(1);
    }

}
