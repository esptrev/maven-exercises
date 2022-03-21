package maventest;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        /// if given array list of strings produce a singel string from all elements with a
        //// given delimiter seperating individual strins
        /// ["the", "quick", "brown","fox"]  the,quick,brown,fox

        String [] words = {"the", "quick", "brown","fox","dog"};
        ArrayList<String> wordArray = new ArrayList<>(Arrays.asList(words));
        System.out.println(wordArray);
        String joinedWords = joinWords(wordArray, " ");

        joinedWords = Joiner.on(" ").join(wordArray);
        System.out.printf("%s\n\t", joinedWords);


    }

    private static String joinWords(ArrayList<String> words, String delimiter){
        String result = "";
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            result += word;
        }
        return result;
    }

}
