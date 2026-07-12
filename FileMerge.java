import java.io.*;

public class FileMerge {
    public static void main(String[] args) {
        String baseDir = "C:\\Users\\aimst\\OneDrive\\kuliah\\semester 4\\Pemrograman Berorientasi Objek\\pbos11\\";
        String[] files = {baseDir + "file1.txt", baseDir + "file2.txt"};
        String mergedFile = baseDir + "merge.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {
            for (String file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e) {
                    System.out.println("Gagal membaca file: " + file);
                    e.printStackTrace();
                }
            }
            System.out.println("File berhasil digabungkan menjadi merge.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}