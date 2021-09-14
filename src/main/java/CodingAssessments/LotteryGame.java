package CodingAssessments;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.ArrayList;


public class LotteryGame {
    public static void main(String[] args) {
        String[] group1 = {"Deniz", "Can", " Shirin", "Dovlet"};
        String[] group2 = {"Mirlan", "Aigul", "Mavluda", "Nurlan"};
        String[] group3 = {"Asel", "Togzhan", "Ilyas", "Ajara", "Adina","Izat"};
        String[] group4 = {"Aika", "Alex", "Ruslan", "Ermek","Sarynjy"};

        ArrayList<String[]> allGroups = new ArrayList();
        allGroups.add(group1);
        allGroups.add(group2);
        allGroups.add(group3);
        allGroups.add(group4);

        Random ran = new Random();
        ArrayList<String> winnersFromGroup = new ArrayList();

        int num = 1234567810;
        String numbers = ""+num;
        int count = 1;
        String [] arr = numbers.split(",");
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].equals(count++)){
                System.out.print("GOOD");
            }else{
                arr[i].equals(count);
                System.out.print(arr.toString());
            }
        }

        String winner = "";
        for(String[] groups: allGroups) {
            int randomGroupIndex = ran.nextInt(groups.length);
            winner = groups[randomGroupIndex];
            winnersFromGroup.add(winner);
        }
        System.out.println(winnersFromGroup);

        winner = winnersFromGroup.get(ran.nextInt(allGroups.size()));
        System.out.println(winner);

        JLabel label = new JLabel("Winner: " + winner);
        label.setFont(new Font("Arial", Font.BOLD, 25));
        UIManager.put("OptionPane.minimumSize",new Dimension(300, 300));
        JOptionPane.showMessageDialog(null, label, "Lottery Game", JOptionPane.DEFAULT_OPTION);


    }
}
