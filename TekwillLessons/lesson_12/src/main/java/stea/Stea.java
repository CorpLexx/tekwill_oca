package stea;

public class Stea {
    private int numarulDePlanete;
    private float[] masaPlanetei;
    private String[] numelePlanetei;
    private double masa;
    private String nume;
    private static int numarulDeStele;

    Stea(){
        numarulDeStele++;
    }

    Stea(int numarulDePlanete, float[] masaPlanetei, String[] numelePlanetei, double masa, String nume){
        this.numarulDePlanete = numarulDePlanete;
        this.masaPlanetei = masaPlanetei;
        this.numelePlanetei = numelePlanetei;
        this.masa = masa;
        this.nume = nume;
        numarulDeStele++;
    }

    public double masaTotalaAPlanetelor(){
        double total = 0;
        for( float masaUneiPlanetei : this.masaPlanetei) {
            total += masaUneiPlanetei;
        }
        return total;
    }

    public boolean equals(Stea steaua){
        if (masaTotalaAPlanetelor() == steaua.masaTotalaAPlanetelor()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esteMaiMare(Stea steaua){
        return masaTotalaAPlanetelor() > steaua.masaTotalaAPlanetelor();
    }

    public static void gauraNeagra(Stea stea1, Stea stea2){
        if (stea1.esteMaiMare(stea2)){
            stea1.masa += stea2.masa;
            stea1.masa += stea1.masaTotalaAPlanetelor();
            stea1.masa += stea2.masaTotalaAPlanetelor();
            stea2.masa = 0;
            stea2.numarulDePlanete = 0;
        } else {
            stea2.masa += stea1.masa;
            stea2.masa += stea2.masaTotalaAPlanetelor();
            stea2.masa += stea1.masaTotalaAPlanetelor();
            stea1.masa = 0;
            stea1.numarulDePlanete = 0;

        }
        for(int i = 0; i < stea1.masaPlanetei.length; i++) {
            stea1.masaPlanetei[i] = 0;
        }
        for(int i = 0; i < stea2.masaPlanetei.length; i++) {
            stea2.masaPlanetei[i] = 0;
        }
    }

    public void setNumarulDePlanete(int numarulDePlanete) {
        this.numarulDePlanete = numarulDePlanete;
    }

    public void setMasaPlanetei(float[] masaPlanetei) {
        this.masaPlanetei = masaPlanetei;
    }

    public void setNumelePlanetei(String[] numelePlanetei) {
        this.numelePlanetei = numelePlanetei;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public static void setNumarulDeStele(int numarulDeStele) {
        Stea.numarulDeStele = numarulDeStele;
    }

    public int getNumarulDePlanete() {
        return numarulDePlanete;
    }

    public float[] getMasaPlanetei() {
        return masaPlanetei;
    }

    public String[] getNumelePlanetei() {
        return numelePlanetei;
    }

    public double getMasa() {
        return masa;
    }

    public String getNume() {
        return nume;
    }

    public static int getNumarulDeStele() {
        return numarulDeStele;
    }

    public String toString(){
        return "Numele stelei: " + this.nume +
                " are masa: " + this.masa+ " kg. "+
                "si contine " + numarulDePlanete + " planete. "+
                "In total sunt " + Stea.numarulDeStele + " stele";
    }
}