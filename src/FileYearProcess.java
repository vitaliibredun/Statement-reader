public class FileYearProcess {
    public static YearlyReport constractReport() {
        Reader reader = new Reader();
        YearlyReport report = new YearlyReport();

        String contentOfFile = reader.readFileContent("resources/y.2021.csv");

        String[] lines = contentOfFile.split(System.lineSeparator());

        for (int i = 1; i < lines.length; i++) {
            String[] content = lines[i].split(",");

            int month = Integer.valueOf(content[0]);
            int amount = Integer.valueOf(content[1]);
            boolean isExpense = Boolean.valueOf(content[2]);

            YearlyRecord ourRecord = new YearlyRecord(month, amount, isExpense);

            report.addRecord(ourRecord);
        }
        return report;
    }
}
