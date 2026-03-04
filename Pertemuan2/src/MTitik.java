/* Nama File    : MTitik.java
 * Deskripsi    : Main class untuk menjalankan class Titik
 * Pembuat      : 
 * Tanggal      : 
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(3,3); // Membuat objek titik T1 (0,0)
        Titik T2 = new Titik(3,5); // Membuat objek titik T2 (3,5)

        System.out.println("Jumlah objek titik yang telah dibuat: " + Titik.getCounterTitik());
        System.out.println("Jumlah objek titik yang telah dibuat: " + T2.getCounterTitik());

        System.out.println("\nRefleksi Y :");
        T1.refkeksiY();
        T1.printTitik();
        double JarakDariDuaTitik = T1.getJarak(T2);
        System.out.println("Jarak dari titik T1 dan T2 adalah: " + JarakDariDuaTitik);
        T2.refleksiX();
        System.out.println ("\nRefleksi X:");
        T2.printTitik();

        
        
    

    
        
        // T1.setAbsis(3);         // Mengubah absis T1 dengan nilai 3
        // T1.setOrdinat(4);       // Mengubah ordinat T1 dengan nilai 4
        // T1.printTitik();        // Mencetak koordinat T1 ke layar
        // T1.geser(3, 4);         // Menggeser T1 sejauh (3,4)
        // T1.printTitik();        // Menampilkan koordinat T1 setelah digeser

        // Titik T2 = T1;
        // T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        // T1.absis = 3;
        // T1.ordinat = 4;

        // T1.getAbsis();
        // T1.getOrdinat();

        // T1.setAbsis(0);
        // T1.setOrdinat(0);
        // T1.printTitik();

    }
}