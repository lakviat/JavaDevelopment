package CodingAssessments;

public class CountNumberOfElements {
    public static void main(String[] args) {

        String [] element = {"a", "b", "a", "c", "b"};
        char [] seperateelemt = new char[element.length];

        String newStirng = element.toString();
        int count = 0;
        for (int i = 0; i <newStirng.length() ; i++) {
            for (int j = i; j <newStirng.length() ; j++) {
                if (newStirng.indexOf(i) == newStirng.indexOf(j))
                    count ++;
                System.out.println(count);
                break;

            }
        }

    }
}
