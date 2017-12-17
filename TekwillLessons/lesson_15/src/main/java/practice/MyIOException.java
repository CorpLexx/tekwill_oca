package practice;

import java.io.File;
import java.io.IOException;

public class MyIOException {
    public static void main(String[] args) {

        MyIOException testClass = new MyIOException();

        try { testClass.testCheckedException();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    public void testCheckedException() throws IOException{
        File testFile = new File("//testFile.txt");
        testFile.createNewFile();
        System.out.println("testFile exists:" + testFile.exists());
        int[] intArray = new int[5];
        intArray[5] = 27;
    }
}
