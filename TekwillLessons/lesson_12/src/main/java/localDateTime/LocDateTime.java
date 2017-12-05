package localDateTime;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;

public class LocDateTime {
    public static void main(String[] args) {

        String[] argumente = {"2007-12-03T10:15:30", "d-MMM-uuuu"};

        switch (argumente.length){
            case 1:
                java.time.LocalDateTime now = java.time.LocalDateTime.now();
                System.out.println(Arrays.toString(argumente));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(argumente[0]);
                System.out.println(now.format(formatter));
                break;
            case 2:
                java.time.LocalDateTime parse = java.time.LocalDateTime.parse(argumente[0]);
                System.out.println(Arrays.toString(argumente));
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(argumente[1]);
                System.out.println(parse.format(formatter2));
                break;
            default:
                System.err.println("Error args");
        }

        LocalDate myDate = LocalDate.now();
        JapaneseDate jDate = JapaneseDate.from(myDate);
        System.out.println("Date now is: " + myDate);
        System.out.println("Japanese date is: " + jDate);
        LocalDate myNewDate = LocalDate.of(2017, 12, 22);
        System.out.println(myNewDate);
        System.out.println(myDate.minusDays(10));
        String fDate = myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(fDate);

        for (int i = 0; i < 5; i++){
            System.out.print(i + 1 + " ");
            System.out.println(i);
        }

        Integer int1 = 1;
        Integer int2 = 1;
        System.out.println("hi".compareTo("Hi"));
        System.out.println(int1.compareTo(int2));
    }
}
