/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package home_work.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        String[] days = {"monday","saturday","tuesday","sunday","friday"};

        // Convert the days array into an ArrayList
        List<String> daysList = new ArrayList<>(Arrays.asList(days));

        // Loop through the ArrayList, printing out "sunday" elements in 
        //   upper case (use toUpperCase() method of String class)
        for (String day : daysList){
            if (day.equals("sunday")){
                day = day.toUpperCase();
            }
            // Print all other days in lower case
            System.out.println(day);
        }

        // daysList.replaceAll(s -> s.substring(0, 3));
        daysList.replaceAll(s -> update(s));

        daysList.removeIf(s -> s.equals("6"));

        // Print out the ArrayList
        System.out.println(daysList);

    }

    static String update (String s){
        return s.length() + "";
    }
}
