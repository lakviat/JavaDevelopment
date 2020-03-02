package Arrays;

public class USCIS {

    public static String answer;

    public static void main(String[] args) {

        String asnwer = "";
        USCISRespond(answer);

    }

    public static String USCISRespond(String decision) {

        if (decision.equals("yes")) {
            answer = "Green Card";
        } else {
            answer = "No Place to go Stay in USA";
        }
        return answer;
    }

}
