package day4.excercises;

import java.io.*;

public class ChangeFile {
    public static void main(String[] args) throws IOException {
        ChangeFile file = new ChangeFile();
        String a = file.changeFile();
        file.writeTextToFile(a);
    }

    private void writeTextToFile(String tekst) throws FileNotFoundException {
        File file = new File("nowyPlik.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print(tekst);
        printWriter.flush();
        printWriter.close();
    }

    private String changeFile() throws IOException {
        File file = new File("plik.txt");
        StringBuilder result = new StringBuilder();
        if (file.exists()) {
            InputStream is = new FileInputStream(file); //tworzy strumień
            InputStreamReader isr = new InputStreamReader(is); //czyta strumień
            BufferedReader reader = new BufferedReader(isr); //wczytuje do pamięci plik
            while (reader.ready()) { //czy jest następna linia , zwraca boolean
                String s = reader.readLine(); //odczytuje całą linię, zwraca stringa
                s = s.toUpperCase();//metoda klasy string
                result.append(s).append(reader.ready() ? "\r\n" : "");
//metoda append z klasy StringBuilder, dodaje do obiektu inny obiekt
            }
        }


        return result.toString();
    }

    void foo( String a, int[] b) {

    }

void ff() {
        int[] b = new int[2];
         foo("",b );
}

}
