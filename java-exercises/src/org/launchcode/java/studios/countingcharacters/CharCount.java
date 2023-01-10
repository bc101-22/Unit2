package studios.ch03;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args){
        String text = "";
        try {
//            System.out.println(System.getProperty("user.dir"));
            File file = new File("src/exercises/ch03/string");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                text = reader.nextLine();
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        text = text.toUpperCase();
        char[] charactersInString = text.toCharArray();
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i < charactersInString.length; i++) {
            char currKey = charactersInString[i];
            if(Character.isLetter(currKey)){
                if(count.containsKey(currKey)) {
                    int currValue = count.get(currKey);
                    count.put(currKey, currValue+1);
                }
                else {
                    count.put(currKey, 1);
                }
            }
        }

        for(Map.Entry<Character, Integer> entry : count.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
