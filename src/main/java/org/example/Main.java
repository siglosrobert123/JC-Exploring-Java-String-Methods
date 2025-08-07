package org.example;

public class Main {
    public static void main(String[] args) {

        String greeting = "Hello, Cadets!";
        int length = greeting.length();
        System.out.println("The length of the string is: " + length);


        String message = "Keep learning!";
        char character = message.charAt(5);
        System.out.println("The character at index 5 is: " + character);

        String statement = "Java is powerful.";
        String part = statement.substring(5,7);
        System.out.println("The extracted substring is: " + part);

        String mixedCase = "This Is A Test";
        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        String sentence = "The quick brown fox jumps over the lazy dog.";
        int indexOfFox = sentence.indexOf("fox"); //16
        int indexOfZ = sentence.indexOf('z'); //37
        int indexOfCat = sentence.indexOf("cat"); //-1

        System.out.println("Index of 'fox': " + indexOfFox);
        System.out.println("Index of 'z': " + indexOfZ);
        System.out.println("Index of 'cat': " + indexOfCat);

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);


        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);

        String original = "I like cats. Cats are cute.";
        String replaced = original.replace("cats", "dogs");
        System.out.println("Original: " + original);
        System.out.println("Replaced: " + replaced);

        String padded = "   Lots of spaces   ";
        String trimmed = padded.trim();
        System.out.println("Padded String length: " + padded.length());
        System.out.println("Trimmed String: " + trimmed);
        System.out.println("Trimmed String length: " + trimmed.length());

    }
}