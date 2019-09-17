package Arrays;

public class Practice06_SplitMethod2 {
    public static void main(String[] args) {
        String results = "About 1,110,000,000 results (0.73 seconds) ";
        resultTime(results);
        System.out.println(resultTime(results));
    }
        public static String resultTime (String str ){

        String [] splitArr = str.split("\\(");
        String secondPart = splitArr[1];  // 0.74 seconds)
        String wopSecondPart = secondPart.replaceAll("\\)","");


        return wopSecondPart;



        }
}
