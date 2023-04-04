import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static javax.swing.UIManager.put;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        System.out.print("vertebrado ou invertebrado ? :");
        AN1 = sc.nextLine();
        System.out.print("ave, mamifero, inseto ou anelideo ? :");
        AN2 = sc.nextLine();
        System.out.print("carnivoro, onivoro, herbivaro ou hematofago ? :");
        AN3 = sc.nextLine();

        Map animais = new HashMap<String, String>() {{

            put("vertebrado ave carnivoro","aguia");

            put("vertebrado ave onivoro","pomba");

            put("vertebrado mamifero onivoro","homem");

            put("vertebrado mamifero herbivoro","vaca");

            put("invertebrado anelideo hematofago","sanguessuga");

            put("invertebrado anelideo onivoro","minhoca");

            put("invertebrado inseto hematofago","pulga");

            put("invertebrado inseto herbivoro","lagarta");

        }};

        String animal = AN1+ " " + AN2 + " " + AN3;

        System.out.println(animais.get(animal));

    }
}
