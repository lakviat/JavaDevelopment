package Arrays.Overriding;

public class SoccerPlayer extends Human {
    int jerseyNumber;
    String name;



    @Override // is usually called --> annotation to make sure that we are overiding the method
    public void run (){
        System.out.println("Soccer player is running");
    }


    public void train() {
        System.out.println("Soccer player is training ");
    }
    public void bycicleKick(){
        System.out.println("Soccer player is bycicle kicking ");
    }
}
