package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TestClass {
    public static void main(String[] args) {
        String[] days = {"monday","saturday","tuesday","sunday","friday"};
        MyList<String> daysList = new MyList();
        daysList.addAll(Arrays.asList(days));
        daysList.updateIf(s -> s.equals("friday"), v -> v + " Black");
        System.out.println(daysList);
        daysList.displayIf(s -> s.length() > 7);
    }
}

class MyList<E> extends ArrayList<E> {

    public void updateIf(Predicate<E> predicate, UnaryOperator<E> operator){
       for (int i = 0; i < size(); i++){
           if (predicate.test(get(i))){
               E out = operator.apply(get(i));
               set(i, out);
           }
       }

    }

    public void displayIf(Predicate<E> predicate){
        for (int i = 0; i < size(); i++){
            if (predicate.test(get(i))){
                System.out.println(get(i));
            }
        }
    }
}