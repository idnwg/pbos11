import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\aimst\\OneDrive\\kuliah\\semester 4\\Pemrograman Berorientasi Objek\\pbos11\\students.csv";
        String line;
        String csvSplitBy = ",";
        
        int indeks = 0;
        int jumlahBaris = 0;

        System.out.println("NIM, NAMA, UMUR, PRODI");
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            
            while ((line = br.readLine()) != null) {
                jumlahBaris++;
                indeks++;
                
                if (indeks > 1) {
                    String[] student = line.split(csvSplitBy);
                    if (student.length == 4) { 
                        System.out.println(student[0] + ", " + student[1] + ", " + student[2] + ", " + student[3]);
                    }
                }
            }
            System.out.println("---------------------------------");
            System.out.println("Total jumlah baris dalam file: " + jumlahBaris);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}