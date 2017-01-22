package example;

/**
 * Created by openmaya on 22/01/2017.
 */
public class AnnotaTest {
    public static void main(String[] args) {
        try {
            String arg = "/Users/openmaya/Downloads/170121.무한도전.torrent";
            Reader in = new Reader(arg);
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
