public class Pulse {
    private String name;
    private String surname;
    private int birthYear;
    final int YEAR = 2024;

    public Pulse(String name,String surname,int birthYear){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public void heartRate(){
        int maxHeartRate;
        int upIndex,downIndex;
        maxHeartRate = (220 - (YEAR - this.birthYear));
        upIndex = maxHeartRate * 85/100;
        downIndex = maxHeartRate * 50/100;
        System.out.println("Your maximum heart rate is : " + maxHeartRate);
        System.out.println("Your ideal heart rate is between : " + downIndex + " and " + upIndex);


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
