public class Main {
    public static void main(String[] args) {

    String[] type = {"King","Jack","Queen","Ace"};
    int[] number ={2,3,4,5,6,7,8,9,10};

    Desk desk = new Desk(type,number);
    desk.printDesk();
    desk.shuffleDesk();
        System.out.println("--------");
    desk.printDesk();
        System.out.println("-------------------");
        desk.upsideDown();
    }
}