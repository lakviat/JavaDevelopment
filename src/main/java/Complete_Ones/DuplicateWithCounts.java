package Complete_Ones;

public class DuplicateWithCounts {
    public static void main(String[] args) {


        String str = "nazaralievccccdddd";
        String s = "";
        int dup = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (!(s.contains(str.charAt(i) + ""))) {
                        count++;
                    }

                }

            }
            if (count > 1) {
                s += str.charAt(i);
                System.out.println(str.charAt(i) + " :" + count++);
            }

        }
    }
}
