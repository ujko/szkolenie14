package day8;

import javax.swing.*;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //swingMethod();
        //age();
        //printArgs(args);
//        parzystyPodzielny(args);

        String[][] dwuwymiarowa = {{"Ala", "ma", "kota"},{"Pójdzie", "w", "pięty", "oraz", "buty"}};
        label:
        for (int i = 0; i < dwuwymiarowa.length; i++) {
            String[] temp = dwuwymiarowa[i];
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j] + ", ");
                if(j == 1 && i == 0){
                    break label;
                }
            }
            System.out.println();
        }
    }

    private static void parzystyPodzielny(String[] args) {
        for(int i = 0; i < args.length; i++){
            if(i==0){
                continue;
            }
            if(i % 2 == 0){
                System.out.println("To jest parzysty element " + args[i]);
            }
            if(i % 3 == 0){
                System.out.println("To jest podzielne przez 3 " + args[i]);
            }

        }
    }

    private static void printArgs(String[] args) {
        String s = "";
        String aa = "";
        for(String string: args){
            s += aa + string;
            aa = ", ";
        }
        System.out.println(s);
    }

    private static void age() {
        System.out.println("Ile masz lat?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masz lat " + scanner.nextLine());
    }

    private static void swingMethod() {
        String text = JOptionPane.showInputDialog("tekst komunikatu");
        JOptionPane.showMessageDialog(null, text);
    }
}
