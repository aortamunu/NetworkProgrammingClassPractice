package url.FileWrite;
import java.net.*;

public class URI_Methods {
    public static void main(String[] args) {
        String uri_link = "https://user:password@example.com/search?q=dogs#results";
        String uri_link2 = "https://user:password@subdomain.example.com/path/to/page?category=books&sort=price#section-2";
        try{
            URI uri = URI.create(uri_link);
            URI uri2 = URI.create(uri_link2);
            System.out.println("Full URI:"+uri);
            System.out.println("URI Scheme: "+uri.getScheme());
            System.out.println("URI Authority: "+uri.getAuthority());
            System.out.println("URI Path: "+uri.getPath());
            System.out.println("URI Query: "+uri.getQuery());
            System.out.println("URI Fragments: "+uri.getFragment());
            System.out.println("parseServerAuthority(): "+uri.parseServerAuthority());
            System.out.println("normalize(): "+uri.normalize());
            URI baseURI = new URI("https://www.example.com/too/bar.html");
            URI imageURI = new URI("http://www.example.com/too/images/logo.png");
            URI relativeURI = baseURI.relativize(imageURI);
            System.out.println("Relative URI: "+relativeURI.toString());

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
