package Interface;

public class HondaAccordImplementation {
    public static void main(String[] args) {
        HondaAccord hd = new HondaAccord();
        hd.Accerlerates();
        hd.Drives();
        hd.Steers();

        Mercedes ms = new Mercedes();
        ms.Accerlerates();
        ms.Drives();
        ms.Steers();


        Vehicle ndn = new Mercedes();
        ndn.Accerlerates();
        ndn.Drives();
        ndn.Steers();


    }

}
