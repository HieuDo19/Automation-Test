package lab_06;

import java.util.HashMap;
import java.util.Map;

public class Lab06_1 {
    public static Map<String, Integer> extractTime(String s) {
        Map<String, Integer> time = new HashMap<>();
        int endHrs = s.indexOf(" hrs");
        int startMinutes = s.indexOf("d ");
        int endMinutes = s.indexOf(" minutes");
        String minutes = s.substring(startMinutes + 2, endMinutes);
        String hours = s.substring(0, endHrs);
        time.put("hours", Integer.valueOf(hours));
        time.put("minutes", Integer.valueOf(minutes));
        return time;
    }

    public static int calculateMinutes(String s) {
        Map<String, Integer> time = extractTime(s);
        return time.get("hours") * 60 + time.get("minutes");
    }

    public static void main(String[] args) {
        String test = "12 hrs and 55 minutes";
        System.out.println(calculateMinutes(test));
    }
}
