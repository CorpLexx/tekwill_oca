// Class name
public class Fruct {

    // Class variables
    static int nrFructului;

    // Instance variables
    String tip;
    String culoare;
    double marime;
    int greutate;

    // Constructor
    public Fruct(String tipulFructului, String culoareaFructului,
                 double marimeaFructului, int greutateFructului){
        this.tip = tipulFructului;
        this.culoare = culoareaFructului;
        this.marime = marimeaFructului;
        this.greutate = greutateFructului;
    }

    // String representation of the object
    public String toString(){
        return "Fructul " + ++Fruct.nrFructului +
                "\n----------------------" +
                "\nTip: " + this.tip +
                "\nCuloarea: " + this.culoare +
                "\nMarimea: " + this.marime + "cm" +
                "\nGreutatea: " + this.greutate + "g\n";
    }
}