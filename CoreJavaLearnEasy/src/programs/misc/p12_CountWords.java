package programs.misc;

import java.util.HashMap;
import java.util.Scanner;

public class p12_CountWords {
    public static void main(String[] args) {
//        String str = "is is is";
//        String[] split = str.split(" ");
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        for(int i=0; i<split.length; i++){
//            if(map.containsKey(split[i])){
//                int count = map.get(split[i]);
//                map.put(split[i], count + 1);
//            }else {
//                map.put(split[i], 1);
//            }
//        }
//        System.out.println(map);

//        String str="This This is is";
//        String[] split=str.split(" ");
//        HashMap<String, Integer> map = new HashMap<String, Integer> ();
//        for(int i=0; i< split.length; i++){
//            if(map.containsKey(split[i])){
//                int count=map.get(split[i]);
//                map.put(split[i], count+1);
//            }else {
//                map.put(split[i], 1);
//            }
//        }
//        System.out.println(map);

        String str = "The quick brown fox jumps over the lazy dog";
        int count=1;

        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);



}}
