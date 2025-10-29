public class BadgerSimulator {
    // Player stats
    private String playerName;
    private double gpa;
    private int energy;
    private int credits;
    private int semester;
    private double money;
    
    // Game constants
    private static final double MAX_GPA = 4.0;
    private static final int MAX_ENERGY = 100;
    
    public BadgerSimulator(String name) {
        this.playerName = name;
        this.gpa = 3.0;        // Starting GPA
        this.energy = 100;     // Starting energy
        this.credits = 0;      // Starting credits
        this.semester = 1;     // Starting semester
        this.money = 1000.0;   // Starting money
    }
    
    // Basic game events
    public void study() {
        if (energy >= 10) {
            energy -= 10;
            gpa += 0.1;
            if (gpa > MAX_GPA) gpa = MAX_GPA;
        }
    }
    
    public void sleep() {
        energy += 30;
        if (energy > MAX_ENERGY) energy = MAX_ENERGY;
    }
    
    public void attendClass() {
        if (energy >= 5) {
            energy -= 5;
            credits += 1;
        }
    }
    
    public void workPartTime() {
        if (energy >= 15) {
            energy -= 15;
            money += 50;
        }
    }
    
    // Getter methods
    public double getGPA() { return gpa; }
    public int getEnergy() { return energy; }
    public int getCredits() { return credits; }
    public double getMoney() { return money; }
    public int getSemester() { return semester; }
}
git add.
git commit -m "Initial commit of BadgerSimulator class"
git push origin gavin