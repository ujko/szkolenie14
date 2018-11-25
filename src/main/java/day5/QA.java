package day5;

import java.util.Scanner;

public class QA {
private String[] tabela;

    private void setTableLength(){
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj wielkość tabeli");
        int tableLength = s.nextInt();
        tabela = new String[tableLength];

    }
}
