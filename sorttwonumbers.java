import java.util.*;
import java.io.*;

public class sorttwonumbers {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] ab = br.readLine().split(" ");
            int a = Integer.valueOf(ab[0]);
            int b = Integer.valueOf(ab[1]);

            if(a > b) {
                System.out.println(b + " " + a);
            } else {
                System.out.println(a + " " + b);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
