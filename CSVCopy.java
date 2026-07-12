import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVCopy {
    public static void main(String[] args) {
        String fileSumber = "C:\\Users\\aimst\\OneDrive\\kuliah\\semester 4\\Pemrograman Berorientasi Objek\\pbos11\\students.csv";
        String fileTujuan = "C:\\Users\\aimst\\OneDrive\\kuliah\\semester 4\\Pemrograman Berorientasi Objek\\pbos11\\students_copy.csv";
        String baris;

        try (BufferedReader br = new BufferedReader(new FileReader(fileSumber));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileTujuan))) {

            while ((baris = br.readLine()) != null) {
                bw.write(baris);
                bw.newLine();
            }
            
            System.out.println("Sukses! File berhasil disalin dari " + fileSumber + " ke " + fileTujuan);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyalin file.");
            e.printStackTrace();
        }
    }
}