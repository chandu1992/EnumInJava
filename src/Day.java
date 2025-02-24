package src;

import java.util.Arrays;

enum DayEnum{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class Day {

    public static void main(String[] args) {
        DayEnum today = DayEnum.WEDNESDAY;
        System.out.println(Arrays.stream(DayEnum.values()).toList());
        System.out.println("Today is: " + today); // Output: Today is: WEDNESDAY
    }
}
