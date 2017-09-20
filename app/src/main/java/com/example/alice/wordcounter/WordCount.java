package com.example.alice.wordcounter;

import android.text.Editable;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.example.alice.wordcounter.R.id.text;

/**
 * Created by alice on 18/09/2017.
 */

public abstract class WordCount {
    public HashMap<String, Integer> wordsByCount;
//    public Scanner counter;

    public WordCount (String textToCount) {
//        this.wordsByCount = new HashMap<>();
    }

    public static String count(String text) {
        String[] textToCount = text.trim().split(" ");
        Map<String, Integer> wordsByCount = new HashMap<>();
        for (String word: textToCount) {
            Integer count = wordsByCount.get(word);
            count = (count == null) ? 1 : ++count;
            wordsByCount.put(word, count);
        }
        return wordsByCount.toString();
    }

//    public void count (String text) {
//        Scanner count = new Scanner(text);
//        Map<String, Integer> counts = new HashMap<>();
//        while(count.hasNext()) {
//            String word = count.next();
//            if( !counts.containsKey(word) ){
//            counts.put(word, 1);
//            }
//            else
//                counts.put(word, counts.get(word) +1 );
//        }
//    }

}