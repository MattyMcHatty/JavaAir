public enum PlaneType {
    BOEING747(100, 5000),
    CONCORD(50, 3000),
    AIRBUS(70, 4000),
    TESTPLANE(3, 250);

    private final int capacity;
    private final double weightAllowance;

    PlaneType(int capacity, double weightAllowance){
        this.capacity = capacity;
        this.weightAllowance = weightAllowance;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeightAllowance() {
        return weightAllowance;
    }
}


