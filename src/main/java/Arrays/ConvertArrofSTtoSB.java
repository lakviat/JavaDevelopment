package Arrays;
import java.util.StringJoiner;
import java.util.List;
public class ConvertArrofSTtoSB {
    public static void main(String[] args) {
        int size = 3;
        StringBuilder newst = new StringBuilder();
        String [] arr = {"Hello", "How", "is", "going"};
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length() <= size) {
                newst.append(arr[i] + "<br>");

            }
            }
        System.out.println(newst);



            }

        }


