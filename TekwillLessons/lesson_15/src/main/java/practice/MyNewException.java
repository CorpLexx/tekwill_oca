package practice;

import java.io.File;
import java.io.IOException;

public class MyNewException {

    public static void main(String[] args) {
        try {
            createFile("testFile.txt");
        } catch (IOException e) {
            System.out.println(e);
        } catch (SecurityException se){
            System.err.println(se.getMessage());
        } catch (ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }
    }

    public static void createFile(String fname) throws IOException {
        File f = new File(fname);
        System.out.println(fname + " exists? " + f.exists());
        f.createNewFile();
        System.out.println(fname + " exists? " + f.exists());
        int[] intArray = new int[5];
        intArray[5] = 27;
    }
}
