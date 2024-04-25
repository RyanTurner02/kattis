import java.io.*;

public class fjoldibokstafa {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            int counter = 0;

            for (int i = 0; i < s.length(); i++) {
                char curr = s.charAt(i);

                if (curr >= 'a' && curr <= 'z' || curr >= 'A' && curr <= 'Z') {
                    counter++;
                }
            }
            System.out.println(counter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
