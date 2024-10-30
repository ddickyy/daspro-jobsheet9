import java.util.Scanner;

public class SearchNilai08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyak = sc.nextInt();
        int [] arrNilai = new int [banyak];

        for (int i = 0; i < banyak ; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) +": ");
            arrNilai [i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++){
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println("Nilai " + key + " ketemu di index ke-" + hasil);
                break;
            } 
        }
        if (hasil == 0) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

    }   
}