package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Roma {
    public static void main(String[] args) {

        String Roma = "MCMXCIV";
        int sum = 0;
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        String[] a =  Roma.split("");
        for (int i = 0; i < a.length-1 ; i++) {
         if(map.get(a[i])<map.get(a[i+1])){
             sum -= map.get(a[i]);
         }else {
             sum += map.get(a[i]);
         }
        }
        sum += map.get(a[a.length - 1]);


    }
}
