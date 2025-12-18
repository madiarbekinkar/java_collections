import java.io.*;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Set<String> employees = new TreeSet<>();
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

        for (String emp : employees) {
            System.out.println(emp);
        }
    }
}