package tugas.js.pkg10;

import java.util.Scanner;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */

public class Tugas2_SKS {
    String nama,semester;
    int nim;
    double nilai ;

    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nama anda\t : ");
        nama=input.nextLine();
        System.out.println("masukkan nim anda\t: ");
        nim=input.nextInt();
        System.out.println("masukkan semester sekarang\t: ");
        semester=input.nextLine();
        System.out.println("IP semester ini\t: ");
        nilai=input.nextDouble();
    }

    public void hitung(){
        if (nilai >= 3.5 ) {
            System.out.println("Anda berhak mengontrak 24 SKS pada Semester V ");
        }
    
        else if (nilai >= 3 && nilai < 3.5) {
            System.out.println("Anda berhak mengontrak 22 SKS pada Semester V");
        }
    
        else if (nilai >= 2.5 && nilai < 3) {
            System.out.println("Anda berhak mengontrak 20 SKS pada Semester V");
        }
    
        else if (nilai >= 2 && nilai < 2.5) {
            System.out.println("Anda berhak mengontrak 18 SKS pada Semester V");
        }
    
        else {
            System.out.println("Anda berhak mengontrak 15 SKS pada Semester V");
        }
    
        } 
}
