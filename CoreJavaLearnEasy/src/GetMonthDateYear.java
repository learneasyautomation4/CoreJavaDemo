import java.text.SimpleDateFormat;
import java.util.Date;

public class GetMonthDateYear {
    public static void main(String[] args) {
        String dateText = "Sep 23, 2022 09:28:41";
        String[] dateArray = dateText.split("\\s+");
        String formattedDate = "";
        for (int i = 0; i < dateArray.length - 1; i++) {
            formattedDate = formattedDate.concat(dateArray[i]).concat(" ");
        }
        System.out.println(formattedDate);
        System.out.println(getTimestamp());
    }

    public static String getTimestamp() {
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
        Date date = new Date();
        return (formatter.format(date));
    }
}