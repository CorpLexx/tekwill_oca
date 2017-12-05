package manipulate_data;

public class Main {
    public static void main(String[] args) {
        String custName = "John Smith";
        int spaceIdx = custName.indexOf(" ");
        String firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);

        StringBuilder sb = new StringBuilder(firstName);
        sb.append(custName.substring(spaceIdx));
        System.out.println(sb);

        long longValue = 5_000_000_000L;
        float floatValue = 3.4F;
        char charValue = 'A';
        System.out.println(longValue);
        int intValue = (int)longValue;
        System.out.println(intValue);
    }
}
