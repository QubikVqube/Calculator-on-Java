import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String stroka;
        Scanner in;
        while (true) {
            System.out.print("Введите выражение: ");
            in = new Scanner(System.in);
            stroka = in.nextLine();

            int num1 = 0, num2 = 0;
            String[] parts = stroka.split(" ");
            int summ;
            try {
                num1 = Integer.parseInt(parts[0]);
                num2 = Integer.parseInt(parts[2]);

            } catch (NumberFormatException e) {
                System.out.println("Не удалось получить число из: " + stroka);
                in.close();
                // break;
                return;
            }
            switch (parts[1]) {
                case "+": {
                    summ = num1 + num2;
                    System.out.printf("Результат сложения: %d\n", summ);
                    break;
                }
                case "-": {
                    summ = num1 - num2;
                    System.out.printf("Результат вычитания: %d\n", summ);
                    break;
                }
                case "*": {
                    summ = num1 * num2;
                    System.out.printf("Результат умножения: %d\n", summ);
                    break;
                }
                case "/": {
                    if (num2 == 0) {
                        System.out.print("Error! Деление на 0\n");
                        break;
                    }
                    summ = num1 / num2;
                    System.out.printf("Результат деления: %d\n", summ);
                    break;
                }

                default:
                    System.out.print("Error! Неправильный ввод знака!\n");
                    break;
            }
        }

    }
}