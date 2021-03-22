public enum PlaneType {
    BOEING747(539, 333000),
    BOEING777(550, 135000),
    AIRBUSA320(170, 83000),
    DASH8(37, 16000);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}