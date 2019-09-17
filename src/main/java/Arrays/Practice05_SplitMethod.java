package Arrays;

public class Practice05_SplitMethod {
    public static void main(String[] args) {
    String results = "About 1,110,000,000 results (0.73 seconds) ";
        System.out.println(resultCount(results));


    }

        public static String resultCount(String str) {

            String [] strSplit = str.split(" ");

            String resultWithComma = strSplit[3];

            String resultWithOutComma = strSplit[1].replaceAll(",", "");

            return resultWithOutComma;

    }
}
