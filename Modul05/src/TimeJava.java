import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeJava {
    public static void main(String [] args){
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Sebelum menggunakan format : "+myDateObj);
        
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("Setelah menggunakan format : "+formattedDate);
    }
}
