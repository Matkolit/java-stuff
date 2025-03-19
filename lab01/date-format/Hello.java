
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Hello {

    public static void main(String args[]) {
        Date now = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, d MMMM, yyyy", new Locale("us", "US"));
        System.out.println(formatter.format(now));

    }

}
