/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : 
 * Tanggal      : 
 */

public class Titik {
    /**************** ATRIBUT ******************/
    private double absis;
    private double ordinat;
    static int CounterTitik = 0;

    /**************** METHOD ******************/
    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        CounterTitik++;
    }

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public static int getCounterTitik() {
        return CounterTitik;
    }

    void printCounterTitik() {
        System.out.println(CounterTitik);
    }

    // Mengembalikan nilai absis
    private double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // getKuadran(): integer
    int getKuadran() {
        if (getAbsis() > 0 && getOrdinat() > 0) return 1;
        else if (getAbsis() < 0 && getOrdinat() > 0) return 2;
        else if (getAbsis() < 0 && getOrdinat() < 0) return 3;
        else if (getAbsis() > 0 && getOrdinat() < 0) return 4;
        return 0;
    }

    // getRefleksiX(): Titik
    Titik getRefleksiX(){
        Titik T1 = new Titik();
        T1.setOrdinat(-1*ordinat);
        T1.setAbsis(absis);
        return T1;
    }

    // getJarakPusat(): real
    double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }
    // getJarak(Titik T): real
    // refleksiX(): 
    // refleksiY(): 
    void refkeksiY(){
        absis = -absis;
    }

    // getRefleksiY(): Titik
    Titik getRefleksiY(){
        Titik T1 = new Titik();
        T1.setOrdinat(ordinat);
        T1.setAbsis(-1 * absis);
        return T1;
    }

    double getJarak(Titik T) {
        double x = Math.pow(T.absis - this.absis, 2);
        double y = Math.pow(T.ordinat - this.ordinat, 2);

        return Math.pow(x + y, 0.5);
    }

    void refleksiX(){
        ordinat= -ordinat;
    }

} // end class Titik