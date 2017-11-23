public class Main {
    public static void main (String [] args) {

        System.out.println("In livada avem urmatoare fructe:");
        System.out.println("--------------------------------");

        Fruct mar = new Fruct("Mar", "Rosie", 25.6, 145);
        Fruct cireasa = new Fruct("Cireasa", "Alba", 1.5, 12);
        Fruct apricot = new Fruct("Apricot", "Galbena", 45, 670);

        System.out.println(mar);
        System.out.println(cireasa);
        System.out.println(apricot);
    }
}