import java.io.*;
import java.util.*;

public class Task1 {
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

        System.out.println("Size of collection: " + employees.size());

        System.out.println("\n Way 1: Standard for loop");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee " + i + ": " + employees.get(i));
        }

        System.out.println("\nWay 2: For-each loop");
        for (String emp : employees) {
            System.out.println(emp);
        }

        System.out.println("\nWay 3: Iterator interface");
        Iterator<String> it = employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}