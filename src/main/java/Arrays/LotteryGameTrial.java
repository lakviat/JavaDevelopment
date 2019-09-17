package Arrays;

import java.util.ArrayList;
import java.util.Random;

public class LotteryGameTrial {
    public static void main(String[] args) {
        String [] group1 = {"one", "two", "trhree"};
        String [] group2 = {"four","five","six"};

        ArrayList<String []> allgroups = new ArrayList();
        Random ran = new Random();
        allgroups.add(group1);
        allgroups.add(group2);
        ArrayList<String> newone = new ArrayList();
        String wins = "";
        for(String [] each : allgroups){
            int randomindex = ran.nextInt(each.length);
            wins = each[randomindex];
            newone.add(wins);

            wins = newone.get(ran.nextInt(allgroups.size()));
            System.out.println(wins);
        }

        }

    }

