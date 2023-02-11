package StringsInJava;
//Same as String But String are Mutable (Modifiable) in This Class.

//Constructor :
/* ****Consttructors in StringBufferClass****
StringBuffer()  ->  Create Empty String buffer with default size 16bit
StringBuffer( str ) -> Create String Buffer With Specified String
StringBuffer( capacity ) -> Create empty String Buffer of given size.
*/

import java.io.*;

public class StringBufferClassDemo {
    public static void main(String[] args) {

        StringBuffer strbuf = new StringBuffer();
        strbuf.insert(0, "Hello World!\n"); // String Buffer is empty we must use 0 as a first argument in insert method
        System.out.println(strbuf);

        strbuf.append("Osama Bin Azam"); // Append my name with strbuf. Append (Used to add text at the end of the
                                         // string)
        System.out.println(strbuf);

        System.out.println("\nThe Length of the Strbuf After append() is : " + strbuf.length()); // Printing the length
                                                                                                 // of String

        // replace() -> replace string in specified range

        strbuf.replace(1, 4, "Replace Method Used Here.");
        System.out.println("\n" + strbuf);
        // Deleting above string to make strbuf as hello world!
        strbuf.delete(1, 26);
        System.out.println("\n" + strbuf);

        // Again making original strbuf by adding ello using insert method.
        strbuf.insert(1, "ell");
        System.out.println("\n" + strbuf);

        strbuf.reverse(); // This method reverse the given string
        System.out.println("\n" + strbuf);

    }

}