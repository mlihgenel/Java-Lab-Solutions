import javax.swing.text.View;
import java.util.Random;

public class Virus {

    private String gen;
    private int virusCod;
    private boolean parents;

    public Virus(String gen, int virusCod, boolean parents) {
        this.gen = gen;
        this.virusCod = virusCod;
        this.parents = parents;
    }

    public Virus(String gen, int virusCod) {
        this.gen = gen;
        this.virusCod = virusCod;
    }

    public void compareDNA(Virus gen) {
       if (gen.getGen().equals(this.gen)) {
           System.out.println("Virus " + gen.getVirusCod() + " is the same as " + gen.getGen());
       }
       else{
           System.out.println("Virus " + gen.getVirusCod() + " is not the same as " + gen.getGen());
       }
    }
    public String findMother(){
        if(this.parents){
            return "This virus has parents ";
        }
        else
            return "This virus has not parents ";
    }
    public void mutation(){
        char[] gens = {'A', 'C', 'G', 'T'};
        Random rand = new Random();
        int choseLetter = rand.nextInt(4);
        int choseLetterOriginal = rand.nextInt(gens.length);
        char mutatedGen = gens[choseLetter];

        char toChangeGen = this.gen.charAt(choseLetterOriginal);
        String mutation ;
        if(mutatedGen != toChangeGen){
            mutation = this.gen.replace(mutatedGen, toChangeGen);
            System.out.println(mutation);
        }
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getVirusCod() {
        return virusCod;
    }

    public void setVirusCod(int virusCod) {
        this.virusCod = virusCod;
    }

    public boolean isParents() {
        return parents;
    }

    public void setParents(boolean parents) {
        this.parents = parents;
    }
}
