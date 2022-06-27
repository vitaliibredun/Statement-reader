import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Reader {
    public String readFileContent(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException exception) {
            System.out.println("Невозможно прочитать файл с отчётом. " +
                    "Возможно, файл не находится в нужной директории.");
            return null;
        }
    }
}
