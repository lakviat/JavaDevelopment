package CodingAssessments;

public class DuplicatesString {
    public static void main(String[] args) {

        //THIS ALLOWS TO FIND A DUPLICATES IN A STRING
        String str = "I'm am am learning java java";
        String[] str2;
        String total = "";
        str2 = str.split(" ");
        for (int i = 0; i <str2.length ; i++) {
            boolean duplciate = false;
            for (int j = 0; j <str2.length ; j++) {
                if(i != j && str2[i].equals(str2[j])){
                    duplciate = true;
                    break;
                }
            }
            if(duplciate == true){
                System.out.println("THIS ARE DUPLICATES : " + str2[i]);
            }
        }


    }
}
