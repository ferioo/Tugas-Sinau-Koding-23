package Java;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Buku buku = new Buku();
    }

    private Date convertStringToDate(String date){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.parse(date);
        } catch (ParseException e){
            e.printStackTrace();
            return null;
        }
    }

    private String convertDateToString(Date date){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            return dateFormat.format(date);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
