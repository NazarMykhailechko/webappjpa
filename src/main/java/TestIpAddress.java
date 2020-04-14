import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIpAddress {

    public static void main(String[] args) throws IOException {

        String str = "25.7%";
        System.out.println(str.substring(0,str.indexOf("%")));
//        InetAddress InetAddress = java.net.InetAddress.getLocalHost();
//        System.out.println(InetAddress);
//        System.out.println(System.getenv("username"));
//        System.out.println(System.getenv());
//
//        Runtime r = Runtime.getRuntime();
//        Process p = r.exec("whoami");
//        BufferedReader rr = new BufferedReader(new InputStreamReader(p.getInputStream()));
//        System.out.println(rr.readLine());
//
//        System.out.println(System.getProperty("user.name"));
    }

}
