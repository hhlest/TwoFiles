import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class MyFileCreator implements FilePathConstants {

    public static void createFile(String[] inputOne, String[] inputTwo) {
        HashMap<String, String> checkDuplication = new HashMap<>();
        try (PrintWriter pw = new PrintWriter(PATH_FILE3)) {

            for (int i = 0; i < inputOne.length; i++) {
                for (int j = 0; j < inputTwo.length; j++) {
                    if (inputOne[i].equals(inputTwo[j]) && !checkDuplication.containsKey(inputOne[i])) {
                        checkDuplication.put(inputOne[i], inputOne[i]);
                        pw.println(inputTwo[j]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
