import java.util.Arrays;

/**
 *  Lesson 7
 **/

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("a");
        p1.setSurname("b");

        // System.out.println(p1);

        String nameOfPerson1 = p1.getName();

        Person p2 = new Person("a", "b", 78);

        //  System.out.println(p2);
        int a = 5;
        int b = 5;

//        if (a == b) {
//            System.out.println("true");
//        } else {
//            System.out.println("false " + p1 +" " + p2);
//        }



        String hi1 = "HI";
        String hi2 = "HI";
        String[] ar1 = {"HI"};
        String[] ar2 = {"HI"};
        System.out.println(ar1);
        System.out.println(ar2);
        System.out.println(Arrays.equals(ar1, ar2));
        System.out.println(ar1==ar2);
        boolean rez = hi1 == hi2;
        System.out.println("equals: " + hi1.equals(hi2));
        System.out.println("==: " + rez);

        Om o1 = new Om();
        Om o2 = new Om();
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));

    }
}