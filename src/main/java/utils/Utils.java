package utils;

import day5.Animal;

import java.io.*;

public class Utils {
    public static void writeTextToFile(String plik, String text) throws FileNotFoundException {
        File file = new File(plik);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(text);
        printWriter.flush();
        printWriter.close();
    }
    public static String readTextFromFile2(String plik) throws IOException {
        File file = new File(plik);
        StringBuilder result = new StringBuilder();
        if (file.exists()) {
            InputStream is = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            while (reader.ready()) {
                result.append(reader.readLine()).append(reader.ready() ? "\r\n" : "");
            }
            reader.close();
            isr.close();
            is.close();
        }
        return result.toString();
    }

    public static void writeObject(String plik, Object object) throws IOException {
        File file = new File(plik);
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.flush();
        objectOutputStream.close();
        outputStream.close();
    }

    public static  Object readObject(String plik) throws IOException, ClassNotFoundException {
        File file = new File(plik);
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return objectInputStream.readObject();
    }
}
