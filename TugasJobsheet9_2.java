import java.util.Scanner;

public class TugasJobsheet9_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        String[] pesanan = new String[100];
        double[] harga = new double[100];

    
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

       
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i+1) + ": ");
            pesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i+1) + ": ");
            harga[i] = sc.nextDouble();
            sc.nextLine();
        }

      
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += harga[i];
        }

        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i+1)+ ". " + pesanan[i] + "= Rp" + harga[i]);
        }

        System.out.println("Total Biaya: Rp" +totalBiaya);
    }
}