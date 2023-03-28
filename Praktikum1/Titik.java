// Titik.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas Titik 
class Titik{
    public static int counterTitik;
    public double absis;
    public double ordinat;

    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    Titik(double a, double o) {
        absis = a;
        ordinat = o;
        counterTitik++;
    }
    public void setAbsis(double a) {
        absis = a ;
    }

    public void setOrdinat(double o) {
        ordinat = o;
    }
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }
    public double getCounterTitik() {
        return counterTitik;
    }
    
}