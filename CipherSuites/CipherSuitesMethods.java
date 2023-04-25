import javax.net.ssl.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;


public class CipherSuitesMethods {
    public static void main(String[] args) throws IOException {
        try {
            Socket so = new Socket();
            SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket ss = (SSLSocket) ssf.createSocket();
            ss.connect(new InetSocketAddress("www.youtube.com", 443));
            System.out.println(ss.getEnabledCipherSuites());
            System.out.println(ss.getSupportedCipherSuites());
            System.out.println(ss.getRemoteSocketAddress());
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

