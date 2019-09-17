package Arrays;

public class ArrayBegining {
    public static void main(String[] args) {


    int [] numbers = new int [10];

    for(int roomNum = 0; roomNum < 10; roomNum++){
        numbers[roomNum] = 2;

        System.out.println(numbers[roomNum]);
    }
        for (int roomNum = 0; roomNum < 10 ; roomNum++) {
            System.out.println(roomNum);
            System.out.println("\t");
            System.out.println(numbers[roomNum]);
        }

    }



}
