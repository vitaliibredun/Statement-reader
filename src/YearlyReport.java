import java.util.ArrayList;

public class YearlyReport {
    private ArrayList<YearlyRecord> yearlyRecords;

    public YearlyReport() {
        this.yearlyRecords = new ArrayList<>();
    }

    public void addRecord(YearlyRecord record) {
        this.yearlyRecords.add(record);
    }

    public int checkJanuaryProfit() {
        int profit = 0;
        for (YearlyRecord yearlyRecord : this.yearlyRecords) {
            if (yearlyRecord.month == 1 && !yearlyRecord.isExpense) {
                profit = yearlyRecord.amount;
            }
        }
        return profit;
    }

    public int checkFebruaryProfit() {
        int profit = 0;
        for (YearlyRecord yearlyRecord : this.yearlyRecords) {
            if (yearlyRecord.month == 2 && !yearlyRecord.isExpense) {
                profit = yearlyRecord.amount;
            }
        }
        return profit;
    }

    public int checkMarchProfit() {
        int profit = 0;
        for (YearlyRecord yearlyRecord : this.yearlyRecords) {
            if (yearlyRecord.month == 3 && !yearlyRecord.isExpense) {
                profit = yearlyRecord.amount;
            }
        }
        return profit;
    }

    public int checkJanuaryCosts() {
        int costs = 0;
        for (YearlyRecord yearlyRecord : this.yearlyRecords) {
            if (yearlyRecord.month == 1 && yearlyRecord.isExpense) {
                costs = yearlyRecord.amount;
            }
        }
        return costs;
    }

    public int checkFebruaryCosts() {
        int costs = 0;
        for (YearlyRecord yearlyRecord : this.yearlyRecords) {
            if (yearlyRecord.month == 2 && yearlyRecord.isExpense) {
                costs = yearlyRecord.amount;
            }
        }
        return costs;
    }

    public int checkMarchCosts() {
        int costs = 0;
        for (YearlyRecord yearlyRecord : this.yearlyRecords) {
            if (yearlyRecord.month == 3 && yearlyRecord.isExpense) {
                costs = yearlyRecord.amount;
            }
        }
        return costs;
    }

    public void printYearlyProfitByMonth() {
        int profit = 0;
        int costs = 0;
        double result = 0;

        System.out.println("Отчётный год: 2021");
        System.out.println("Прибыль по каждому месяцу:");

        for (YearlyRecord yearlyRecord : this.yearlyRecords) {
            if (!yearlyRecord.isExpense) {
                profit = yearlyRecord.amount;
            }

            if (yearlyRecord.isExpense) {
                costs = yearlyRecord.amount;
                result = profit - costs;
                System.out.println(yearlyRecord.month+" месяц");
                System.out.println(result + " рублей");
            }
        }
    }

    public void printYearlyAverageCosts() {
        int sumOfCosts = 0;
        int sumOfMonth = 0;
        double result = 0;

        for (YearlyRecord yearlyRecord : this.yearlyRecords) {
            if (yearlyRecord.isExpense) {
                sumOfCosts += yearlyRecord.amount;
                sumOfMonth++;
            }
        }
        result = sumOfCosts / sumOfMonth;
        System.out.println("Средний расход за месяц: " + result + " рублей");
    }

    public void printYearlyAverageProfit() {
        int sumOfProfit = 0;
        int sumOfMonth = 0;
        double result = 0;

        for (YearlyRecord yearlyRecord : this.yearlyRecords) {
            if (!yearlyRecord.isExpense) {
                sumOfProfit += yearlyRecord.amount;
                sumOfMonth++;
            }
        }
        result = sumOfProfit / sumOfMonth;
        System.out.println("Средний доход за месяц: " + result + " рублей");
    }
}
