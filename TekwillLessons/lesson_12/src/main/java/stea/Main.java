package stea;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        float[] stea1_mases = {2f, 2f};
        float[] stea2_mases = {3f, 4f, 3f};
        float[] stea3_mases = {5f, 1f};
        float[] stea4_mases = {7f, 5f, 4f, 5f};
        float[] stea5_mases = {2f, 4f};

        String[] stea1_name = {"jupiter", "venus"};
        String[] stea2_name = {"sun", "mars", "earth"};
        String[] stea3_name = {"mercur", "saturn"};

        Stea stea1 = new Stea(2, stea1_mases, stea1_name, 102.1, "Pamint");
        Stea stea2 = new Stea(3, stea2_mases, stea2_name, 111.1, "Marte");
        Stea stea3 = new Stea(2, stea3_mases, stea3_name, 12.1, "Soare");

        ArrayList<Stea> stele = new ArrayList<>();
        stele.add(stea1);
        stele.add(stea2);
        stele.add(stea3);

        for(Stea stea : stele){
            System.out.println(stea);
        }


        System.out.println("Masa totala a tuturor planetelor stele " + stea1.getNume()+ " " +stea1.masaTotalaAPlanetelor());
        Stea.gauraNeagra(stea1, stea2);

        for(Stea stea : stele){
            System.out.println(stea);
        }

        System.out.println(stea2.getNume() + " este egala cu " + stea3.getNume() + ": " + stea2.equals(stea3));
    }
}
