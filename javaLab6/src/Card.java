public class Card {
    private String[] type;
    private int[] number;


    public Card(String[] type, int[] number) {
        this.type = type;
        this.number = number;
    }


    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }
}
