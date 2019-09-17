package Complete_Ones;

public class CombineTwoIntArrays {
    public static void main(String[] args) {
        int [] one = {10,20,30};
        int [] two = {10,20,30};

        int [] total = new int[one.length + two.length];

        int z = 0;
        for (int i = 0; i <one.length ; i++) {
            total[z] = one[i];
            z++;
        }
            for (int j = 0; j <two.length ; j++) {
                total[z] = two[j];
                z++;

            }


        }

    }

