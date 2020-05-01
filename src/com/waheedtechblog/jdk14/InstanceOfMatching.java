package com.waheedtechblog.jdk14;

/**
 * Improvement in Pattern Variable.
 * This is Preview feature means it will be disable bydefault
 * <p>
 * Note: Enable preview feature to run it. Check README to enable it.
 * <p>
 * Abdul Waheed
 */
public class InstanceOfMatching {

    public static void main(String[] args) {
        InstanceOfMatching matching = new InstanceOfMatching();
        matching.InstanceOfOperatorBeforeJDK14("Instance Operator : Before JDK 14");
        matching.InstanceOfOperatorWithJDK14("Instance Operator : With JDK 14");
    }

    /**
     * InstanceOf Operator behaviour before JDK 14
     *
     * @param message
     */
    public void InstanceOfOperatorBeforeJDK14(Object message) {

        // Check whether message is type of String
        if (!(message instanceof String)) {
            throw new IllegalArgumentException();
        } else {
            //if String, then cast it to String and print the message
            System.out.println(message);
        }
    }

    public void InstanceOfOperatorWithJDK14(Object message) {
        // Will check whether message is instanceOf String Object
        //if yes then assign it variable str else will skip it.
        // Developer doesn't need to worry about typecast here
        if (message instanceof String str) {
            System.out.println(str);
        }
    }


}
