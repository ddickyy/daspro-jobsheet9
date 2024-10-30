import java.util.Scanner;

public class TugasJobsheet9_3 {

    public static void main(String[] args) {
        
        String menu [] = {"Nasi Goreng", "Mie ayam", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Daftar Menu Makanan:");
        
        for (String makanan : menu) {
            System.out.println(makanan);
        }
        System.out.print("Masukkan nama makanan yang dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println(cari + " tersedia di menu");
        } else {
            System.out.println(cari + " tidak ada di menu");

        }
    }
}