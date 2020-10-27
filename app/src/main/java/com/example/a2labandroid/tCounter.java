package com.example.a2labandroid;

public class tCounter {
    public static int getCharsCount(String text)
    {
        return text.length();
    }

    public static int getWordsCount(String text)
    {
        text = text.replace("\n", " ");
        String[] textString = text.split(" ");
        return textString.length;
    }

}
