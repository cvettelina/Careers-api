package api.application.request;

public enum Degree {

    No_Education(0), Certificate(1), Diploma(2), Associate(3), Bachelor(4), Engeneer(5), Master(6), Doctor(7);

    private int value;

    private Degree(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static Degree fromInt(int value) {
        for (Degree current : Degree.values()) {
            if (current.value == value) {
                return current;
            }
        }
        return null;
    }
}
