package enums;


import java.util.Scanner;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/12 11:45 .
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size :(SMALL, MEDIUM,LARGE)");
        String input = in.next();
            Size size = Enum.valueOf(Size.class, input.toUpperCase());
            System.out.println("size=" + size);
    }
}

enum Size{
    SMALL("S"),MEDIUN("M"), LARGE("L");

    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}