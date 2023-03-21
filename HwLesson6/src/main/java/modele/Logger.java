package modele;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    public static void logData(String msg) {

        try (FileWriter file = new FileWriter("D:\\My education\\ООП Java (семинары)\\OOPJavaHomeWork\\HwLesson6\\Log.log", true)) {
            Date currentTime = new Date();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTime + ": " + msg + "\n");
            file.append(sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}