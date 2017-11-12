package mojeex;

import com.sun.xml.internal.fastinfoset.util.CharArray;

/**
 * Created by DD on 2017-11-11.
 */
public class Ex2 {

    public static void main(String[] args) {
        String Str = new String("Welcome to Tutorialspoint.com");

        System.out.print("Return Value :" );
        System.out.println(Str.toCharArray() );

        char[] a = Str.toCharArray();
        System.out.println(a);

    }


}
