

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(solution2("?ab??a"));
        System.out.println(solution2("bab??a"));
        System.out.println(solution2("?a?"));
    }

    public static String solution2(String value) {
        if(value == null || value.isBlank() || value.length() > 1000) {
            return "NO";
        }

        var valueArray = value.trim().toLowerCase(Locale.ROOT).split("");
        var isPalindrome = true;
        var si = "";
        var sf = "";

        for(var i = 0; i < valueArray.length; i++) {
            si = valueArray[i];
            sf = valueArray[valueArray.length - i - 1];

            if(si.equalsIgnoreCase("?") && sf.equalsIgnoreCase("?")) {
                si = "a";
                sf = "a";
            } else if(si.equalsIgnoreCase("?")) {
                si = sf;
            } else if(sf.equalsIgnoreCase("?")) {
                sf = si;
            } else if(!si.equalsIgnoreCase(sf)){
                isPalindrome = false;
                break;
            }

            valueArray[i] = si;
            valueArray[valueArray.length - i - 1] = sf;
        }


        return isPalindrome ? String.join("", valueArray) : "NO";
    }

    
}

/*
public static String solution1(String value) {
        if(value == null || value.isBlank() || value.length() > 1000) {
            return "NO";
        }

        var valueArray = value.trim().toLowerCase(Locale.ROOT).split("");
        var isPalindrome = true;

        for(var i = 0; i < valueArray.length; i++) {
            if(valueArray[i].equalsIgnoreCase("?")) {
                if(valueArray[valueArray.length - i - 1].equalsIgnoreCase("?")) {
                    valueArray[i] = "a";
                    valueArray[valueArray.length - i - 1] = "a";
                } else {
                    valueArray[i] = valueArray[valueArray.length - i - 1];
                }
            }else {
                if(valueArray[valueArray.length - i - 1].equalsIgnoreCase("?")) {
                    valueArray[valueArray.length - i - 1] = valueArray[i];
                } else if(!valueArray[i].equalsIgnoreCase(valueArray[valueArray.length - i - 1])) {
                    isPalindrome = false;
                    break;
                }
            }
        }

        return isPalindrome ? String.join("", valueArray) : "NO";
    }

*/