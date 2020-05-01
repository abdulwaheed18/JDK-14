package com.waheedtechblog.jdk14;

/**
 * The Switch Expressions is a preview feature in Java 12 and Java 13,
 * it becomes a standard language feature, it means from Java 14 and onward,
 * we can use this Switch Expressions without specifying the --enable-preview option.
 * <p>
 * https://openjdk.java.net/jeps/361
 *
 * @Author AbdulWaheed18@gmail.com
 */
public class SwitchExpressions {

    public static void main(String[] args) {

        SwitchExpressions expressions = new SwitchExpressions();
        expressions.switchExample("II");
    }

    /**
     * Since 12,13 All were parts of Preview feature but now with JDK 14
     * Below switch are part of Standard JDK
     *
     * @param number
     */
    public void switchExample(String number) {
        //can pass String as case type
        //it can returns value
        int numericValue = switch (number) {
            case "one", "1", "I" -> 1; // return value via ->
            case "two", "2", "II" -> 2;
            case "three", "3", "III" -> {
                yield 3; // returns via yield keyword
            }
            default -> -1;
        };
        System.out.println("Value: " + numericValue);
    }
}
