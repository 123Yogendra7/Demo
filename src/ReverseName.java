import javafx.util.Builder;

import java.util.Locale;

public class ReverseName {

    public static void main(String[] args) {
      String str = "yogendra yadav";
        char[] chArr = str.toCharArray();
        for (int i = chArr.length - 1; i >= 0; i--) {
            System.out.print(chArr[i]);
            System.out.print(str);
        }
    }
}