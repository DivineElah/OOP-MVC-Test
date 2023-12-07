package Helper;

import model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputHelper {
    private static Scanner sc = new Scanner(System.in);
    public static int intHelper(String message) {
        System.out.println(message);
        int value=0;
        try {
            value = Integer.parseInt(sc.nextLine());
            return value;
        } catch (Exception e) {
            System.out.println("Không hợp lệ! Hãy nhập lại!");
            return intHelper(message);
        }
    }

    public static String strHelper(String message, int minLenght, int maxLenght) {
        System.out.println(message);
        String str = sc.nextLine();
        if (str.trim().length()<minLenght || str.trim().length()>maxLenght) {
            System.out.println("Không hợp lệ! Hãy nhập lại!");
            return strHelper(message, minLenght, maxLenght);
        } else {
            return str;
        }
    }

    public static LocalDate lcDateHelper(String message) {
        System.out.println(message);
        System.out.println("Định dạng mặc định: dd/MM/yyyy.");
        String str = sc.nextLine();
        try {
            return LocalDate.parse(str.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (Exception e) {
            System.out.println("Không hợp lệ! Hãy nhập lại!");
            return lcDateHelper(message);
        }
    }

    public static double doubHelper(String message, int minLenght, int maxLenght) {
        System.out.println(message);
        System.out.println("(Phải nằm trong ["+ minLenght + ", " + maxLenght + "]).");
        String str = sc.nextLine();
        double doub = 0;
        try {
            doub = Double.parseDouble(str);
        } catch (Exception e) {
            System.out.println("Không hợp lệ, hãy nhập lại!");
            return doubHelper(message, minLenght, maxLenght);
        }
        if (doub<minLenght || doub>maxLenght) {
            System.out.println("Không hợp lệ, hãy nhập lại!");
            return doubHelper(message, minLenght, maxLenght);
        } else {
            return doub;
        }
    }

    public static boolean ynHelper(String message) {
        System.out.println(message);
        String str = sc.nextLine();
        char c = str.charAt(0);
        if (c == 'y') {
            return true;
        } else if (c == 'n') {
            return false;
        } else {
            System.out.println("Hãy nhập Y/N!");
            return ynHelper(message);
        }
    }

    public static Cat catHelper(String message) {
        System.out.println(message);
        int type = 0;
        try {
            type = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Loại mèo không hợp lệ! Hãy nhập lại");
            return catHelper(message);
        }
        switch (type) {
            case 1:
                return new ArabicCat();
            case 2:
                return new BritishLongHairCat();
            case 3:
                return new BritishShortHairCat();
            case 4:
                return new RussianCat();
            default:
                System.out.println("Không hợp lệ, xin hãy nhập lại!");
                return catHelper(message);
        }
//        type = type.trim();
//        if (type == "arab") {
//            return new ArabicCat();
//        } else if (type == "long hair") {
//            return new LongHairEnglandCat();
//        } else if (type == "short hair") {
//            return new ShortHairEnglandCat();
//        } else if (type == "russia") {
//            return new RussiaCat();
//        } else {
//            System.out.println("Loại mèo không hợp lệ! Hãy nhập lại");
//            return catHelper(message);
//        }
    }
}
