import java.util.*;

public class Desk extends Card{

    List<String> desk = new ArrayList<>();

    public Desk(String[] type, int[] number) {
        super(type, number);
        for (int i = 0; i < type.length; i++) {
            for (int j = 0; j < number.length; j++) {
                desk.add(type[i] + " " + number[j]);
            }
        }
    }

    public void shuffleDesk(){
        Collections.shuffle(desk);
        printDesk();
    }
    public void printDesk(){
        for (int i = 0; i < desk.size(); i++) {
            System.out.println(desk.get(i));
        }
    }
    public void upsideDown(){
         for (int i = 0; i < desk.size(); i++) {
             System.out.println(desk.get(i));
             i++;
             System.out.println("Upside Down");
         }

    }

}
