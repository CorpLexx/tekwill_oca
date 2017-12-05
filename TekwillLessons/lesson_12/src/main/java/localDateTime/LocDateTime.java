package localDateTime.localDateTime;

import java.time.format.DateTimeFormatter;
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
    }
}
