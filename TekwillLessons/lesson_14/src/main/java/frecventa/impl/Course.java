package frecventa.impl;

import java.util.ArrayList;
import java.util.List;


public class Course {
    private Group group;
    private int numbreOfLessons;
    private List<Lesson> listOfLessons;

    public Course(Group group, int i) {
        this.group = group;
        this.numbreOfLessons = i;
    }

    public void start(){
        listOfLessons = new ArrayList<>();
        for (int i = 0; i < numbreOfLessons; i++){
            Lesson lesson = new Lesson(group);
            lesson.start();
            listOfLessons.add(lesson);
        }
    }

    public void printLessons() {
        for (Lesson lesson : listOfLessons){
            lesson.print();
        }
    }

    public void printPresence() {
    }
}
