package Complete_Ones;

public class ParanthesisAlignment {


    public static void main(String[] args) {

        System.out.println(balancedOrNot("({[]}"));

    }
    public static boolean balancedOrNot(String str) {


        boolean isMatched=false;
        if(str.length()%2 !=0) {
            return false;
        }
        else {
            for(int i=0; i<str.length()/2; i++) {
                if(str.charAt(i)=='(' && str.charAt(str.length()-i-1)==')') {
                    isMatched=true;
                    continue;
                }
                else if(str.charAt(i)=='{' && str.charAt(str.length()-i-1)=='}') {
                    isMatched=true;
                    continue;
                }
                else if(str.charAt(i)=='[' && str.charAt(str.length()-i-1)==']') {
                    isMatched=true;
                    continue;
                }


                else {
                    isMatched=false;
                    break;

                }

            }

            return isMatched;

        }

    }


}
