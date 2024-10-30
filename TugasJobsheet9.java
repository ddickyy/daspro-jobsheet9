import java.util.Scanner;
public class TugasJobsheet9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = 0;
        double total= 0, tertinggi = 0, terendah = 100;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyak_nilai = sc.nextInt();
        int nilai [] = new int [banyak_nilai];

        for (i = 0; i < banyak_nilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1) +": ");
            nilai [i] = sc.nextInt();
            total += nilai[i];
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            } if (nilai[i] < terendah) {
            terendah = nilai[i];
            }
        }   
        double rata2 = total/banyak_nilai;
       
        for (i=0; i<banyak_nilai;i++) {
        System.out.println("Nilai ke-" +(i+1) + ": " +nilai[i]);
        }
        System.out.println("Rata-rata nilai: "+rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}