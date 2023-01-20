import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

    public static String[] readInputFile(FileReader fr) {
        String[] result = null;
        try (BufferedReader br = new BufferedReader(fr)) {
            String strLine;
            String strAllLines = "";
            while ((strLine = br.readLine()) != null) {
                strAllLines+=strLine;
                strAllLines+=" ";
            }
            result = strAllLines.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
