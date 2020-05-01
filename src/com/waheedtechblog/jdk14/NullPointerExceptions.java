package com.waheedtechblog.jdk14;

/**
 * Improved the description of NullPointerExceptions by telling which variable was null.
 * <p>
 * Add -XX:+ShowCodeDetailsInExceptionMessages option to enable this feature.
 * https://openjdk.java.net/jeps/358
 *
 * @Author AbdulWaheed18@gmail.com
 */
public class NullPointerExceptions {

    public static void main(String[] args) {
    NullPointerExceptions exceptions = new NullPointerExceptions();
    //exceptions.NullExceptionBeforeJDK14();
    exceptions.NullExceptionWithJDK14();
    }

    public void NullExceptionBeforeJDK14(){
        String message = null;
        System.out.println("Message: " + message.length());
        // Above line will throw Exception as
       /* Exception in thread "main" java.lang.NullPointerException
        at com.waheedtechblog.jdk14.NullPointerExceptions.NullExceptionBeforeJDK14(NullPointerExceptions.java:21)
        at com.waheedtechblog.jdk14.NullPointerExceptions.main(NullPointerExceptions.java:15)*/
    }

    public void NullExceptionWithJDK14(){
        // Pass -XX:+ShowCodeDetailsInExceptionMessages as VM arguments to enable this feature.
        String message = null;
        System.out.println("Message: " + message.length());
        /**
         * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "message" is null
         * 	at com.waheedtechblog.jdk14.NullPointerExceptions.NullExceptionWithJDK14(NullPointerExceptions.java:30)
         * 	at com.waheedtechblog.jdk14.NullPointerExceptions.main(NullPointerExceptions.java:16)
         */
    }
}
