package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str={"ab","a"};

        System.out.println(Solution2.longestCommonPrefix(str));


    }
}
class  Solution2 {
    public static String longestCommonPrefix(String[] strs) {
        String str ="";
        String str3 ="";
        List<String> list = new ArrayList<>();
        if(strs.length!=1) {
            for (int i = 0; i < strs.length - 1; i++) {
                int a = Arrays.stream(strs).toList().get(i).length();
                int b = Arrays.stream(strs).toList().get(i + 1).length();
                int c = a > b ? b : a;
                for (int j = 0; j < c-1; j++) {
                    if (strs[i].charAt(j) == strs[i + 1].charAt(j) && strs[i].charAt(j+1) == strs[i + 1].charAt(j+1)) {
                        str += strs[i].charAt(j);
                        str += strs[i].charAt(j+1);
                    }else if(strs[i].charAt(j) == strs[i + 1].charAt(j)){
                        str += strs[i].charAt(j);
                        return str;
                    }
                }
                list.add(str);
                str = "";
            }
            if(list.size()==1){

                return list.get(0);
            }
            for (int i = 0; i < list.size() - 1; i++) {
                int a = list.get(i).length();
                int b = list.get(i + 1).length();
                int c = a > b ? b : a;
                for (int j = 0; j < c; j++) {
                    if (list.get(i).charAt(j) == list.get(i + 1).charAt(j)) {
                        str3 += list.get(i).charAt(j);
                    }
                }
            }
            return str3;
        }
        str = Arrays.stream(strs).toList().get(0);

        return str;
    }
}
