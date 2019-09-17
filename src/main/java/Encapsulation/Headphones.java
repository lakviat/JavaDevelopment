package Encapsulation;

public class Headphones {

    String types;
    String soundQuality;
    int price;

    public String getTypes(){
        return types;
    }
    public void setTypes(String types){
        if(types.equals("ABC")){
            System.out.println("The data is matching");
        }
        this.types = types;
    }
    public String getSoundQuality(){
        return this.soundQuality;
    }
    public void setSoundQuality(String soundQuality){
        this.soundQuality = soundQuality;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}


