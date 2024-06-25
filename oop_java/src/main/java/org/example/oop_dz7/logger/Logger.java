package org.example.oop_dz7.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static final String LOG_FILE_PATH = "log.txt";

    public static void log(String message) {
        System.out.println("LOG: " + message);
        writeToFile("LOG: " + message);
    }

    public static void logResult(String result) {
        writeToFile("RESULT: " + result);
    }

    private static void writeToFile(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE_PATH, true)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timestamp = dateFormat.format(new Date());

            writer.write("[" + timestamp + "] " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
