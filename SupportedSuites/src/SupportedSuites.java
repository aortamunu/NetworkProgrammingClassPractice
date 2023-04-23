import javax.net.ssl.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
public class SupportedSuites {
    public static void main(String[] args) {
        try{
            Socket so = new Socket();
            SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket ss = (SSLSocket) ssf.createSocket("www.youtube.com", 443);
            String[] suites = ss.getSupportedCipherSuites();
            ss.getEnabledCipherSuites();
            ss.addHandshakeCompletedListener(
                    new myHandshake());
            ss.startHandshake();

            System.out.println("Connect to"+ss.getRemoteSocketAddress());
        }
        catch (Exception e){
            System.out.println("Error "+e);
        }
    }

    private static abstract class myHandshake implements HandshakeCompletedListener {
        public void handShakeCompleted(HandShakeCompletedEvent e)
        {
            System.out.println("Session Info"+e.getSession());
        }
    }
}
