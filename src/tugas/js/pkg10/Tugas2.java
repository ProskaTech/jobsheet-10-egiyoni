package tugas.js.pkg10;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */

public class Tugas2 {
    public static void main(String[] args) {
    Tugas2_SKS mahasiswa = new Tugas2_SKS();

    mahasiswa.inputData();
    System.out.println("");
    System.out.println("======================");
    System.out.println("data mahasiswa ");
    System.out.println("nama mahasiswa : "+mahasiswa.nama);
    System.out.println("nim : "+mahasiswa.nim);
    System.out.println("semester : "+mahasiswa.semester);
    System.out.println("ip semester ini : "+mahasiswa.nilai);
    mahasiswa.hitung();
    }
    
}
