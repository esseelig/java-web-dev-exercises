package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Count {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Character, Integer> characterCount = new HashMap<>();
//        Scanner input;
//        String userInputText;
//        String fileName = "test.txt";

        File file = new File("src/org/launchcode/java/studios/countingcharacters/test.txt");
        String txt;
//        String txt = "";
        Scanner sc=new Scanner(file);
        sc.useDelimiter("\\Z");
        txt = sc.next();





//        input = new Scanner(System.in);
//        System.out.println("Please enter some text, and I will count everything in it!:");
//        userInputText = input.nextLine();
//        input.close();

//        String hiddenFiguresQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

//        char[] hiddenFiguresQuoteArray = hiddenFiguresQuote.toCharArray();
//        char[] userInputTextArray = userInputText.toUpperCase().replaceAll(
//                "[^A-Z]", "").toCharArray();

        char[] userInputTextArray = txt.toUpperCase().replaceAll(
                "[^A-Z]", "").toCharArray();





//        ArrayList<String> hiddenFiguresQuoteArray = new ArrayList<>();




//        System.out.println(hiddenFiguresQuote);
//
//        for (char c : hiddenFiguresQuoteArray) {
//            if(characterCount.containsKey(c)) {
//                characterCount.put(c, characterCount.get(c) + 1);
//            } else characterCount.put(c, 1);
//
////            System.out.println(c);
//        }
//
//        for (Map.Entry<Character, Integer> countEachChar : characterCount.entrySet()) {
//            System.out.println(countEachChar.getKey() + ": " + countEachChar.getValue());
//        }

        for (char c : userInputTextArray) {
            if(characterCount.containsKey(c)) {
                characterCount.put(c, characterCount.get(c) + 1);
            } else characterCount.put(c, 1);

//            System.out.println(c);
        }

        for (Map.Entry<Character, Integer> countEachChar : characterCount.entrySet()) {
            System.out.println(countEachChar.getKey() + ": " + countEachChar.getValue());
        }



        //        System.out.println(characterCount);

    }
}
