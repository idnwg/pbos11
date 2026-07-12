import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\aimst\\OneDrive\\kuliah\\semester 4\\Pemrograman Berorientasi Objek\\pbos11\\new_students.csv";
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {
            System.out.print("Berapa banyak data mahasiswa yang ingin ditambahkan? ");
            int jumlahData = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < jumlahData; i++) {
                System.out.println("\nMasukkan Data ke-" + (i + 1) + ":");
                
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                
                System.out.print("Umur: ");
                String umur = scanner.nextLine();
                
                System.out.print("Prodi: ");
                String prodi = scanner.nextLine();

                String barisData = nim + "," + nama + "," + umur + "," + prodi;
                
                bw.write(barisData);
                bw.newLine();
            }
            
            System.out.println("\nData berhasil disimpan ke dalam file " + csvFile);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}