public class ll {
    private double money;
    private int food;
    private int schoolSupplies;

    /** Create empty supplies manager (all zero). */
    public ll() {
        this.money = 0.0;
        this.food = 0;
        this.schoolSupplies = 0;
    }

    /** Create supplies manager with initial values. */
    public ll(double money, int food, int schoolSupplies) {
        this.money = Math.max(0.0, money);
        this.food = Math.max(0, food);
        this.schoolSupplies = Math.max(0, schoolSupplies);
    }

    /**
     * Modify the supplies for this character.
     *
     * Supported item names (case-insensitive): "food", "school"/"schoolsupplies"/"supplies", "money".
     * The amount may be positive (add) or negative (subtract). The operation will be rejected
     * (return false) if it would make the corresponding value negative; otherwise it applies and returns true.
     */
    public boolean supplies(String item, int amount) {
        if (item == null) return false;
        String key = item.trim().toLowerCase();
        switch (key) {
            case "food":
                if (amount < 0 && food + amount < 0) return false;
                food += amount;
                return true;
            case "school":
            case "schoolsupplies":
            case "supplies":
                if (amount < 0 && schoolSupplies + amount < 0) return false;
                schoolSupplies += amount;
                return true;
            case "money":
                // money stored as double, but we accept integer amounts (dollars)
                if (amount < 0 && money + amount < 0) return false;
                money += amount;
                return true;
            default:
                return false; // unknown item
        }
    }

    // Getters
    public double getMoney() { return money; }
    public int getFood() { return food; }
    public int getSchoolSupplies() { return schoolSupplies; }

    @Override
    public String toString() {
        return "ll{money=" + money + ", food=" + food + ", schoolSupplies=" + schoolSupplies + "}";
    }

    // Small manual test harness
    public static void main(String[] args) {
        ll s = new ll(100.0, 5, 3);
        System.out.println("Before: " + s);
        s.supplies("money", -30);
        s.supplies("food", -2);
        s.supplies("school", 1);
        System.out.println("After: " + s);
    }
}