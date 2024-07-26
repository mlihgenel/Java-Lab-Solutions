import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Virus virus = new Virus("AGTC",1,true);
    Virus virus2 = new Virus("AGGC",2);

    virus.compareDNA(virus2);
    virus.mutation();
    virus.findMother();

    virus2.compareDNA(virus);
    virus2.mutation();
    virus2.findMother();


    }
}