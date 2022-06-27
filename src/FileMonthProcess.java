import java.util.ArrayList;

public class FileMonthProcess {
    public static MonthlyReport constractReport() {
        Reader reader = new Reader();
        MonthlyReport report = new MonthlyReport();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            list.add(reader.readFileContent("resources/m.20210" + i + ".csv"));
        }

        String[] januaryString = list.get(0).split(System.lineSeparator());
        String[] februaryString = list.get(1).split(System.lineSeparator());
        String[] marchString = list.get(2).split(System.lineSeparator());

        for (int i = 1; i < januaryString.length; i++) {
            String[] stringSplit = januaryString[i].split(",");

            String itemName = stringSplit[0];
            boolean isExpense = Boolean.valueOf(stringSplit[1]);
            int quantity = Integer.valueOf(stringSplit[2]);
            int sumOfOne = Integer.valueOf(stringSplit[3]);

            MonthlyRecord ourRecord = new MonthlyRecord(itemName, isExpense, quantity, sumOfOne);

            report.addRecordToJanuary(ourRecord);
        }

        for (int i = 1; i < februaryString.length; i++) {
            String[] stringSplit = februaryString[i].split(",");

            String itemName = stringSplit[0];
            boolean isExpense = Boolean.valueOf(stringSplit[1]);
            int quantity = Integer.valueOf(stringSplit[2]);
            int sumOfOne = Integer.valueOf(stringSplit[3]);

            MonthlyRecord ourRecord = new MonthlyRecord(itemName, isExpense, quantity, sumOfOne);

            report.addRecordToFebruary(ourRecord);
        }

        for (int i = 1; i < marchString.length; i++) {
            String[] stringSplit = marchString[i].split(",");

            String itemName = stringSplit[0];
            boolean isExpense = Boolean.valueOf(stringSplit[1]);
            int quantity = Integer.valueOf(stringSplit[2]);
            int sumOfOne = Integer.valueOf(stringSplit[3]);

            MonthlyRecord ourRecord = new MonthlyRecord(itemName, isExpense, quantity, sumOfOne);

            report.addRecordToMarch(ourRecord);
        }
        return report;

    }
}
