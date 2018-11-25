package day4;

import java.io.*;

public class FileIO {
    private String txtFile = "plik.txt";

    private void writeTextToFile(String tekst) throws FileNotFoundException {
        File file = new File(txtFile);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(tekst);
        printWriter.flush();
        printWriter.close();
    }

    private void readTextFromFile() throws IOException {
        File file = new File(txtFile);
        if (file.exists()) {
            InputStream is = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
            reader.close();
            isr.close();
            is.close();
        }
    }

    private String readTextFromFile1() throws IOException {
        File file = new File(txtFile);
        String result = "";
        if (file.exists()) {
            InputStream is = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            while (reader.ready()) {
                result += reader.readLine();
                result += reader.ready() ? "\r\n" : "";
            }
            reader.close();
            isr.close();
            is.close();
        }
        return result;
    }

    private String readTextFromFile2() throws IOException {
        File file = new File(txtFile);
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

    public static void main(String[] args) throws IOException {
        FileIO fileIO = new FileIO();
//        fileIO.writeTextToFile("Ala ma kota");
//        fileIO.readTextFromFile();
        String result = fileIO.readTextFromFile2();
        System.out.print(result);
    }
}
