
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyData {

    public static void info() {
        var bioData = "Jan Maria Janowski, 12345";
        System.out.println(bioData);

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
        String formateDateTime = ldt.format(dtf);
        System.out.println(formateDateTime);

        String uname = System.getProperty("user.name");
        System.out.println(uname);

        String osname = System.getProperty("os.arch");
        System.out.println(osname);

        try {
            String ipAddress = InetAddress.getLocalHost().getHostAddress();
            System.out.println(ipAddress);
        } catch (UnknownHostException e) {
          System.err.println(e.getMessage());
        }
    }
;
}
