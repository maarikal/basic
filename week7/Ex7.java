package week7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("------Exercise 7.1 and 7.2 -----");
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

        System.out.println(dictionary.amountOfWords());

        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());


        System.out.println("-----Exercise 7.3------");
        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }

        System.out.println("-----Exercise 7.4------");
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();


    }
}
