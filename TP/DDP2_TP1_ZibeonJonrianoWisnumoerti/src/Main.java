import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("\n  ____             _                 _____         _ _       \r\n" +
                " |  _ \\           | |               |  __ \\       | (_)      \r\n" +
                " | |_) |_   _ _ __| |__   __ _ _ __ | |__) |__  __| |_  __ _ \r\n" +
                " |  _ <| | | | '__| '_ \\ / _` | '_ \\|  ___/ _ \\/ _` | |/ _` |\r\n" +
                " | |_) | |_| | |  | | | | (_| | | | | |  |  __/ (_| | | (_| |\r\n" +
                " |____/ \\__,_|_|  |_| |_|\\__,_|_| |_|_|   \\___|\\__,_|_|\\__,_|\r\n" +
                "                                                             \r\n" +
                "                                                             ");
        System.out.println("=============================================================");
        System.out.println("============== Selamat datang di Burhanpedia! ===============");
        System.out.println("=============================================================");


        System.out.print("Masukkan stok awal: ");
        int stokSaatIni = scanner.nextInt();

        System.out.print("Masukan harga barang: ");
        int hargaBarang = scanner.nextInt();

        System.out.print("Masukkan saldo awal: ");
        int saldoSaatIni = scanner.nextInt();

        while (true) {
            System.out.println();
            System.out.println("Pilih menu");
            System.out.println("1. Penjual");
            System.out.println("2. Pembeli");
            System.out.println("3. Hari selanjutnya");
            System.out.println("4. Keluar");
            System.out.print("Perintah : ");
            int perintah = scanner.nextInt();

            switch (perintah) {
                case 1:
                    penjual(stokSaatIni, hargaBarang);
                    break;
                case 2:
//                pembeli(stokSaatIni, saldoSaatIni);
                    break;
                case 3:
//                hariSelanjutnya();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu yang anda masukkan salah!");
            }
        }
    }


    private static void penjual(int stokSaatIni, int hargaBarang) {
        while (true){
            System.out.println();
            System.out.println("===== MENU PENJUAL =====");
            System.out.println("1. Cek Stok");
            System.out.println("2. Cek Harga Barang");
            System.out.println("3. Tambah Stok");
            System.out.println("4. Ubah Harga Barang");
            System.out.println("5. Generate Voucher");
            System.out.println("6. Kirim Barang");
            System.out.println("7. Lihat Laporan Pendapatan");
            System.out.println("8. Kembali Ke Menu Utama");
            System.out.println();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Perintah : ");
            int perintah = scanner.nextInt();
            System.out.println("==============================");
            System.out.println("Stok saat ini: " + stokSaatIni);
            System.out.println("==============================");
        }
    }
}

