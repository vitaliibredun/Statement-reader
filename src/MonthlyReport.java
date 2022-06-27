import java.util.ArrayList;

public class MonthlyReport {
    private  ArrayList<MonthlyRecord> januaryRecords;
    private  ArrayList<MonthlyRecord> februaryRecords;
    private  ArrayList<MonthlyRecord> marchRecords;

    public MonthlyReport() {
        this.januaryRecords = new ArrayList<>();
        this.februaryRecords = new ArrayList<>();
        this.marchRecords = new ArrayList<>();
    }


    public void addRecordToJanuary(MonthlyRecord record) {
        this.januaryRecords.add(record);
    }

    public void addRecordToFebruary(MonthlyRecord record) {
        this.februaryRecords.add(record);
    }

    public void addRecordToMarch(MonthlyRecord record) {
        this.marchRecords.add(record);
    }


    public int januaryProfit() {
        int sumProfit = 0;
        for (MonthlyRecord monthlyRecord : this.januaryRecords) {
            if (!monthlyRecord.isExpense) {
                int profit = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                sumProfit += profit;
            }
        }
        return sumProfit;
    }

    public int februaryProfit() {
        int sumProfit = 0;
        for (MonthlyRecord monthlyRecord : this.februaryRecords) {
            if (!monthlyRecord.isExpense) {
                int profit = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                sumProfit += profit;
            }
        }
        return sumProfit;
    }

    public int marchProfit() {
        int sumProfit = 0;
        for (MonthlyRecord monthlyRecord : this.marchRecords) {
            if (!monthlyRecord.isExpense) {
                int profit = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                sumProfit += profit;
            }
        }
        return sumProfit;
    }

    public int januaryCosts() {
        int sumCosts = 0;
        for (MonthlyRecord monthlyRecord : this.januaryRecords) {
            if (monthlyRecord.isExpense) {
                int costs = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                sumCosts += costs;
            }
        }
        return sumCosts;
    }

    public int februaryCosts() {
        int sumCosts = 0;
        for (MonthlyRecord monthlyRecord : this.februaryRecords) {
            if (monthlyRecord.isExpense) {
                int costs = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                sumCosts += costs;
            }
        }
        return sumCosts;
    }

    public int marchCosts() {
        int sumCosts = 0;
        for (MonthlyRecord monthlyRecord : this.marchRecords) {
            if (monthlyRecord.isExpense) {
                int costs = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                sumCosts += costs;
            }
        }
        return sumCosts;
    }

    public void printJanuaryReport() {
        System.out.println("Отчётный месяц: Январь");
        double maxUnit = 0;
        String itemName = null;
        for (MonthlyRecord monthlyRecord : this.januaryRecords) {
            if (!monthlyRecord.isExpense) {
                int max = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                if (max > maxUnit) {
                    maxUnit = max;
                    itemName = monthlyRecord.itemName;
                }
            }
        }
        System.out.println("Самый прибыльный товар: " + itemName + ", " + maxUnit + " рублей");
    }

    public void printFebruaryReport() {
        System.out.println("Отчётный месяц: Февраль");
        double maxUnit = 0;
        String itemName = null;
        for (MonthlyRecord monthlyRecord : this.februaryRecords) {
            if (!monthlyRecord.isExpense) {
                int max = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                if (max > maxUnit) {
                    maxUnit = max;
                    itemName = monthlyRecord.itemName;
                }
            }
        }
        System.out.println("Самый прибыльный товар: " + itemName + ", " + maxUnit + " рублей");
    }

    public void printMarchReport() {
        System.out.println("Отчётный месяц: Март");
        double maxUnit = 0;
        String itemName = null;
        for (MonthlyRecord monthlyRecord : this.marchRecords) {
            if (!monthlyRecord.isExpense) {
                int max = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                if (max > maxUnit) {
                    maxUnit = max;
                    itemName = monthlyRecord.itemName;
                }
            }
        }
        System.out.println("Самый прибыльный товар: " + itemName + ", " + maxUnit + " рублей");
    }

    public void printJanuaryMaxCosts() {
        double maxUnit = 0;
        String itemName = null;
        for (MonthlyRecord monthlyRecord : this.januaryRecords) {
            if (monthlyRecord.isExpense) {
                int max = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                if (max > maxUnit) {
                    maxUnit = max;
                    itemName = monthlyRecord.itemName;
                }
            }
        }
        System.out.println("Самая большая трата: " + itemName + ", " + maxUnit + " рублей");
    }

    public void printFebruaryMaxCosts() {
        double maxUnit = 0;
        String itemName = null;
        for (MonthlyRecord monthlyRecord : this.februaryRecords) {
            if (monthlyRecord.isExpense) {
                int max = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                if (max > maxUnit) {
                    maxUnit = max;
                    itemName = monthlyRecord.itemName;
                }
            }
        }
        System.out.println("Самая большая трата: " + itemName + ", " + maxUnit + " рублей");
    }

    public void printMarchMaxCosts() {
        double maxUnit = 0;
        String itemName = null;
        for (MonthlyRecord monthlyRecord : this.marchRecords) {
            if (monthlyRecord.isExpense) {
                int max = monthlyRecord.quantity * monthlyRecord.sumOfOne;
                if (max > maxUnit) {
                    maxUnit = max;
                    itemName = monthlyRecord.itemName;
                }
            }
        }
        System.out.println("Самая большая трата: " + itemName + ", " + maxUnit + " рублей");
    }
}
