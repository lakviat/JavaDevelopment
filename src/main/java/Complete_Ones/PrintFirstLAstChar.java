package Complete_Ones;

public class PrintFirstLAstChar {
    public static void main(String[] args) {
        String [] names = {"Hello", "What", "Hi","NoWay"};
        for (int i = 0; i <names.length ; i++) {
            System.out.print(names[i].substring(0,1)+""+names[i].charAt(names[i].length() -1)+ " ");

        }
    }
}
