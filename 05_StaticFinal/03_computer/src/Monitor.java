public class Monitor {

    private final TypeMonitor typeMonitor;
    private final int sizeScreen;
    private final int weight;

    public Monitor(TypeMonitor typeMonitor, int sizeScreen, int weight) {
        this.typeMonitor = typeMonitor;
        this.sizeScreen = sizeScreen;
        this.weight = weight;
    }

    public int getSizeScreen() {
        return sizeScreen;
    }

    public int getWeight() {
        return weight;
    }

    public TypeMonitor getTypeMonitor() {
        return typeMonitor;
    }

    public String toString() {
        return "\tMonitor: Type - " + typeMonitor +
                ", Size screen - " + sizeScreen +
                ", Weight - " + weight;
    }
}

