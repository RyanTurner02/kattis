import java.util.*;
import java.io.*;

public class kikiboba {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            HashMap<Character, Integer> freq = new HashMap<>();
            freq.put('b', 0);
            freq.put('k', 0);

            for(int i = 0; i < s.length(); i++) {
                char curr = s.charAt(i);

                if(freq.get(curr) == null) {
                    freq.put(curr, 1);
                } else {
                    freq.put(curr, freq.get(curr) + 1);
                }
            }

            int numB = freq.get('b');
            int numK = freq.get('k');

            if(numB > numK) {
                System.out.println("boba");
            } else if(numB == numK) {
                if(numB == 0 && numK == 0) {
                    System.out.println("none");
                } else {
                    System.out.println("boki");
                }
            } else {
                System.out.println("kiki");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
