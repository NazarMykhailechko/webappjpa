import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIpAddress {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress InetAddress = java.net.InetAddress.getLocalHost();
        System.out.println(InetAddress);
        System.out.println(System.getenv("username"));
    }

}
