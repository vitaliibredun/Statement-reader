public class Manager {

    private MonthlyReport monthlyReport;
    private YearlyReport yearlyReport;

    public void readFileMonthReport() {
        monthlyReport = FileMonthProcess.constractReport();
    }

    public void readFileYearlyReport() {
        yearlyReport = FileYearProcess.constractReport();
    }

    public void checkReports() {
        if (monthlyReport == null || yearlyReport == null) {
            System.out.println("Отчёты не загружены, загрузите отчёты командами 1 и 2");
            return;
        }
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

    public void printMonthlyReport() {
        if (monthlyReport == null) {
            System.out.println("Отчёты не загружены, загрузите отчёты командой 1");
            return;
        }
        MonthlyReport monthlyReport = FileMonthProcess.constractReport();
        monthlyReport.printJanuaryReport();
        monthlyReport.printJanuaryMaxCosts();
        monthlyReport.printFebruaryReport();
        monthlyReport.printFebruaryMaxCosts();
        monthlyReport.printMarchReport();
        monthlyReport.printMarchMaxCosts();

    }

    public void printYearlyReport () {
        if (yearlyReport == null) {
            System.out.println("Отчёты не загружены, загрузите отчёты командой 2");
            return;
        }
        yearlyReport.printYearlyProfitByMonth();
        yearlyReport.printYearlyAverageCosts();
        yearlyReport.printYearlyAverageProfit();
    }
}


