package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class FileWritersApp {

    public static void main(String[] args) {
        File fd = new File("C:/tmp/file-writer4.txt");
        try {
            fileWriter("C:/tmp/file-writer4.txt"); // αν είχα τον fileWriter File θα περνούσα το fd.
            bufferedWriter(fd);
        } catch (IOException e) { // propagate το IO exeption.
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο λάθος συνέβη.");
        }

        try {
            PrintStream ps = new PrintStream("C:/tmp/test.txt", StandardCharsets.UTF_8);
            sayHello(ps);
            sayHello(System.out); // είναι τύπου printstream.
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο λάθος συνέβη.");
        }
    }

    public static void fileWriter(String file) throws IOException { // δέχεται στην 1η παράμετρο και String και File.
        try (FileWriter fw = new FileWriter(file, true)) {      // true is append, θα έχανα τα παλια περιεχόμενα
            fw.write("paliomalakare"); // βασική λειτουργία η write.
            fw.flush(); // αυτό γιατί έτσι το θέλει.
        }
        catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e); // αρκεί να έχεις ενα string και όλα γίνονται string.
            throw e;
        }
    }

    public static void bufferedWriter(File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("kai poutanasgie!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    public static void printStream(String file) throws IOException { // ακριβώς το ίδιο αν βάλω PrintWriter.
//        try (PrintStream ps = new PrintStream(file, StandardCharsets.UTF_8)) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(file, true), false, StandardCharsets.UTF_8)) {   // 2η παράμετρος το false.. true is append.
            ps.println("Printing with print stream");
            ps.flush();
        } catch (IOException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    /**
     *
     * @param ps
     */
    public static void sayHello(PrintStream ps) {
        ps.println("Hello CF!");
    }

}