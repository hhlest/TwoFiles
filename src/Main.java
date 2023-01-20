import java.io.*;

public class Main implements FilePathConstants {
    public static void main(String[] args) {
        try {
            FileReader file1 = new FileReader(PATH_FILE1);
            FileReader file2 = new FileReader(PATH_FILE2);
            MyFileCreator.createFile(MyFileReader.readInputFile(file1), MyFileReader.readInputFile(file2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
