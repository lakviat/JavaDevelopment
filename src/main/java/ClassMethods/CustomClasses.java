package ClassMethods;

public class CustomClasses {


        private String name;
        private int yint;



        public String inserData (String name){
            return name = name;
        }
        public int insertData (int yint){
            return yint = yint;


        }

        public void setData (String name){
            this.name = name;
        }
        public String getData (){
            return this.name;

        }
        public void setData (int yint){
            this.yint = yint;
        }
        public int getData2 (){
            return this.yint;
        }
    public static void main(String[] args) {
        CustomClasses c = new CustomClasses();
        c.inserData("Hel");
        c.getData();
        c.insertData(10);
        c.getData();

        System.out.println(c.name);
        System.out.println(c.yint);
    }
}





