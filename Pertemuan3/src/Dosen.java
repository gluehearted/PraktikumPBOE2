public class Dosen {
    /********** ATRIBUT **********/
    private String nip;
    private String nama;
    private String prodi;

    // konstruktor tanpa parameter
    public Dosen (){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }
    
    // konstruktor dengan parameter
    public Dosen (String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // selektor
    String getNipDosen(){
        return this.nip;
    }

    String getNamaDosen(){
        return this.nama;
    }

    String getProdiDosen(){
        return this.prodi;
    }

    // mutator
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setprodi(String prodi){
        this.prodi = prodi;
    }
}
