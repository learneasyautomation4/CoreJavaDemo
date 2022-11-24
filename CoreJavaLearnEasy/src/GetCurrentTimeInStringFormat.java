import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentTimeInStringFormat {
    public static void main(String[] args) {
//        Date date=new Date();
//        long milliSeconds=date.getTime();
//        System.out.println("current time in milliseconds: " + milliSeconds);


//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }
}