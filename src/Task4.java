import java.io.*;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
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

        Collections.sort(employees);
        Collections.reverse(employees);

        for (String emp : employees) {
            System.out.println(emp);
        }
    }
}