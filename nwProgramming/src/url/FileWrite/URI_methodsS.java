package url.FileWrite;
import java.net.*;

public class URI_methodsS {
    public static void main(String[] args) {
        String uri = "https://www.youtube.com";
        String uriRelative = "language/../java";
        String query = "https://www.youtube.com?q=searchquery "+"address = ktm";

        URI uriBase = new URI(uri);
        URI uri = uriBase.create(uriRelative);
        System.out.println("Base URI is "+uri.toString());
    }
}
