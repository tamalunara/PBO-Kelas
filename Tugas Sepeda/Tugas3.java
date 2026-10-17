package tugas3;

import java.util.Scanner;

public class Tugas3 {

    static class Sepeda {
        String merk;
        int jarakTempuh;

        public Sepeda(String m) {
            merk = m; 
            jarakTempuh = 0; 
        }

        public void Maju() {
            jarakTempuh += 10;
            System.out.println("- Bergerak Maju 10 Km");
            System.out.println("- Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
        }

        public void Mundur() {
            jarakTempuh -= 5;
            System.out.println("- Bergerak Mundur 5 Km");
            System.out.println("- Object Sepeda " + merk + ", Jarak tempuh " + jarakTempuh + " Km");
        }

        public void berhenti() {
            System.out.println("- Berhenti");
            System.out.println("- Jarak tempuh terakhir sepeda " + merk + " adalah " + jarakTempuh + " Km");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Object Merk Sepeda: ");
        String merk = scanner.nextLine();

        Sepeda sepeda = new Sepeda(merk);
        System.out.println("- Object " + merk + " dibuat, jarak tempuh awal 0 km");

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("Maju (1)");
            System.out.println("Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Keluar (0)");

            System.out.print("Pilihan : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    sepeda.Maju();
                    break;
                case 2:
                    sepeda.Mundur();
                    break;
                case 3:
                    sepeda.berhenti();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}