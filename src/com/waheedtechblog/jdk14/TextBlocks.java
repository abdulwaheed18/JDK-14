package com.waheedtechblog.jdk14;

/**
 * Add text blocks to the Java language. A text block is a multi-line string literal that avoids the need for most escape sequences,
 * automatically formats the string in a predictable way, and gives the developer control over the format when desired.
 * This is a preview language feature in JDK 14.
 * <p>
 * https://openjdk.java.net/jeps/368
 * <p>
 * <p>
 * Note: Enable preview feature to run it. Check README to enable it.
 * <p>
 *
 * @Author AbdulWaheed18@gmail.com
 */
public class TextBlocks {

    public static void main(String[] args) {

        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";


        String htmlUsingJDK13 = """
                    <html>
                        <body>
                            <p>Hello, World</p>
                        </body>
                    </html>""";

        /**
         * \<end-of-line> suppresses the line termination.
         * \s is translated into a single space
         */
        String htmlUsingJDK14 = """
                    <html>
                        <body>\
                            <p>Hello, '\s' World</p>\
                        </body>
                    </html>""";

        System.out.println(html);
        System.out.println(htmlUsingJDK13);
        System.out.println(htmlUsingJDK14);

    }

}

/**
 * Output:
 * <html>
 *     <body>
 *         <p>Hello, world</p>
 *     </body>
 * </html>
 *
 * <html>
 *     <body>
 *         <p>Hello, World</p>
 *     </body>
 * </html>
 * <html>
 *     <body>        <p>Hello, ' ' World</p>    </body>
 * </html>
 */
