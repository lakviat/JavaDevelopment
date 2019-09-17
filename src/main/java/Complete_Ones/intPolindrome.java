package Complete_Ones;

public class intPolindrome {
    public static void main(String[] args) {
        String name[] = {"aibek", "nur", "hel"};
        for (int i = 0; i <name.length/2 ; i++) {
            String temp ="";
            temp = name[i];
            name[i] = name[name.length-1-i];
            name[name.length-1-i] = temp;

        }
        System.out.println(name.toString());
    }
}


