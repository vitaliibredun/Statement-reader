import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MonthlyReport monthlyReport = null;
        YearlyReport yearlyReport = null;

        while (true) {
            printMenu();
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                monthlyReport = FileMonthProcess.constractReport();
                System.out.println("Месячные отчёты загружены");

            } else if (userInput == 2) {
                yearlyReport = FileYearProcess.constractReport();
                System.out.println("Годовой отчёт загружен");

            } else if (userInput == 3) {
                // try / catch ещё не проходили, но решил попробовать
                try {
                    if (FileMonthProcess.constractReport() != null && FileYearProcess.constractReport() != null) {

                        if (yearlyReport.checkJanuaryProfit() != monthlyReport.januaryProfit()) {
                            System.out.println("Обнаружено несоответствие данных: категория доходы, месяц январь");
                        }
                        if (yearlyReport.checkFebruaryProfit() != monthlyReport.februaryProfit()) {
                            System.out.println("Обнаружено несоответствие данных: категория доходы, месяц февраль");
                        }
                        if (yearlyReport.checkMarchProfit() != monthlyReport.marchProfit()) {
                            System.out.println("Обнаружено несоответствие данных: категория доходы, месяц март");
                        }
                        if (yearlyReport.checkJanuaryCosts() != monthlyReport.januaryCosts()) {
                            System.out.println("Обнаружено несоответствие данных: категория расходы, месяц январь");
                        }
                        if (yearlyReport.checkFebruaryCosts() != monthlyReport.februaryCosts()) {
                            System.out.println("Обнаружено несоответствие данных: категория расходы, месяц февраль");
                        }
                        if (yearlyReport.checkMarchCosts() != monthlyReport.marchCosts()) {
                            System.out.println("Обнаружено несоответствие данных: категория расходы, месяц март");
                        }
                        System.out.println("Ошибок не обнаружено, данные по отчётам верны");
                    }

                } catch (NullPointerException exp) {
                    System.out.println("Отчёты не загружены, загрузите отчёты командами 1 и 2");
                }

            } else if (userInput == 4) {
                monthlyReport.printJanuaryReport();
                monthlyReport.printJanuaryMaxCosts();
                monthlyReport.printFebruaryReport();
                monthlyReport.printFebruaryMaxCosts();
                monthlyReport.printMarchReport();
                monthlyReport.printMarchMaxCosts();

            } else if (userInput == 5) {
                yearlyReport.printYearlyProfitByMonth();
                yearlyReport.printYearlyAverageCosts();
                yearlyReport.printYearlyAverageProfit();

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

