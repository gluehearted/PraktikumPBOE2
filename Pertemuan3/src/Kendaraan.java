public class Kendaraan {
    //atribut
    private String noPlat;
    private String jenis;

    //KONSTRUKTOR tanpa
    public Kendaraan(){
        this.noPlat = " ";
        this.jenis = " ";
    }

    //konstruktor Pakai
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis; 
    }

    //selektor
    public String getnoPlat() {
        return this.noPlat;
    }

    public String getjenis() {
        return this.jenis;
    }

    //MUTATOR
    public void setNoPlat(String plat) {
        this.noPlat = plat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

}
