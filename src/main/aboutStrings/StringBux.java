package aboutStrings;

/**
 * This class explores various ways to concatenate or build Strings,
 * such as concatenation, StringBuffer, and StringBuilder.
 * In general, if a String is going to remain constant throughout the program, use
 * the String class object.
 * If a String can change and will only be used from one thread, then StringBuilder will work.
 * If a String can change and will be accessed from multiple threads, use a StringBuffer
 * because StringBuffer is synchronous so you have thread safety.
 * Credit to Geeks for Geeks https://www.geeksforgeeks.org/string-vs-stringbuilder-vs-stringbuffer-in-java/
 */
public class StringBux {

    /**
     * String concatenation.
     * String is immutable. Altering the value of String creates a new object.
     */
    public static String concatString(String str){
        return str = str + "is studying.";
    }

    /**
     * StringBuilder.
     * StringBuilder is mutable. The actual value is changed.
     * StringBuilder is not threadsafe. Use it in a single-threaded environment
     * or in a local variable where only one thread will be accessing a StringBuilder object.
     */
    public static StringBuilder strBldr(StringBuilder strBldr) {
        return strBldr.append("is getting better at programming.");
    }

    /**
     * StringBuffer.
     * StringBuffer is also mutable.
     * StringBuffer is threadsafe, only one thread can access the StringBuffer object at one time.
     */
    public static StringBuffer strBfr(StringBuffer strBuffer) {
        return strBuffer.append("loves running.");
    }


    public static void main(String[] args) {
        String str2 = "Mary ";
        System.out.println(concatString(str2));
        //////////////////////////////////////
        System.out.println();
        StringBuilder sb = new StringBuilder("Mary ");
        System.out.println(strBldr(sb));
        /////////////////////////////////
        System.out.println();
        StringBuffer stringBuffer = new StringBuffer("Mary ");
        System.out.println(strBfr(stringBuffer));
    }

}

