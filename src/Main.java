import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        while (true) {
            printMenu();
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                manager.readFileMonthReport();
                System.out.println("Месячные отчёты загружены");

            } else if (userInput == 2) {
                manager.readFileYearlyReport();
                System.out.println("Годовой отчёт загружен");

            } else if (userInput == 3) {
                manager.checkReports();

            } else if (userInput == 4) {
                manager.printMonthlyReport();

            } else if (userInput == 5) {
                manager.printYearlyReport();

            } else if (userInput == 0) {
                System.out.println("Выход из программы");
                break;

            } else {
                System.out.println("Такой команды пока не существует");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Какую команду выполнить?");
        System.out.println("1 - Считать все месячные отчёты");
        System.out.println("2 - Считать годовой отчёт");
        System.out.println("3 - Сверить отчёты");
        System.out.println("4 - Вывести информацию о всех месячных отчётах");
        System.out.println("5 - Вывести информацию о годовом отчёте");
        System.out.println("0 - Выйти из программы");
    }
}

