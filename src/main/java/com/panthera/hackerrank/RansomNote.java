/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Administrator
 */
public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        boolean isValid = true;

        Map<String, Long> mazMap = Arrays.stream(magazine)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> noteMap = Arrays.stream(note)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<String, Long> entry : noteMap.entrySet()) {
            if (mazMap.containsKey(entry.getKey())) {
                if (mazMap.get(entry.getKey()) != null &&  mazMap.get(entry.getKey()) >= entry.getValue()) {
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
            } else {
                isValid = false;
                break;
            }
        }

        System.out.println(isValid == true ? "Yes" : "No");

    }

    public static void main(String[] args) {
        String[] maz = new String("ive got a lovely bunch of coconuts").split(" ");
        String[] note = new String("ive got some coconuts").split(" ");
        checkMagazine(maz, note);

    }
} 
/*
 public static void main(String[] args) {
String magazineStr = "ive got a lovely bunch of coconuts";
String ransomNoteStr = "ive got some coconuts";
String[] magazine = magazineStr.split("\\s+");
String[] ransomNote = ransomNoteStr.split("\\s+");
String[] outputArray = new String[ransomNote.length];
Map<String,Integer> map = new LinkedHashMap<String,Integer>();

for(int i= 0; i < ransomNote.length ; i++){
for(int j=0 ; j< magazine.length ; j++){

if(ransomNote[i].equals(magazine[j]) ){
int maxValue = 0;
if(map.size() > 0 ){
maxValue = map.entrySet().stream().max(Comparator.comparing(e -> e.getValue())).get().getValue();
}
if(j >= maxValue){	
map.put(ransomNote[i],j);
}
}else{
outputArray[i] = ransomNote[i]; 
}
}
}
List<String> list = map.keySet().stream().collect(Collectors.toList()); 
String[] stringArray = list.toArray(new String[0]);
if(Arrays.equals(ransomNote, stringArray)){
System.out.println("YES");	
}else{
System.out.println("NO");
}

}

}

*/