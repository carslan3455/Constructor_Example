package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q1 {
    public static void main(String[] args) {
        LocalDate date1= LocalDate.now();
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("date1:"+date1.format(format1));
    }
}
/*
date1:22 09 2021
date1:22/09/2021
date1:22.09.2021
date1:22 September 2021
 */