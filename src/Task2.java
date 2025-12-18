import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Set<String> employees = new HashSet<>();
        String fileName = "employees.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    employees.add(line.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Contents: " + employees);
        System.out.println("Contains 'Ivanov'? " + employees.contains("Ivanov"));
    }
}