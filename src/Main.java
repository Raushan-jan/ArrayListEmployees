import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возрост, пол, образования, должность, отдел) ");
            System.out.println("Введите фамилю");
            String surname = scan.nextLine();
            System.out.println("Введите имю");
            String name = scan.nextLine();
            System.out.println("Введите пол");
            String gender = scan.nextLine();
            System.out.println("Введите возрост");
            int age = scan.nextInt();
            scan.nextLine();
            System.out.println("Образование");
            String education = scan.nextLine();
            System.out.println("Должность");
            String position = scan.nextLine();
            System.out.println("Отдел");
            String department = scan.nextLine();
            Employee emp = new Employee(surname, name, age, gender, education, position, department);
            list.add(emp);
            System.out.println("Если хотите закончить ввод данных, введите end");
            String input = scan.nextLine();
            if (input.equals("end")) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("Список сотрудников\n" + list.get(i));
                }
                break;
            }
        }
    }
}