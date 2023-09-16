public class Car extends Auto {
    private String model;
    private int numDoors;
    private boolean fullTime;


    public Car() {
        super();
        model = "";
        numDoors = 4;
        fullTime = false;
    }


    public Car(String firma, int speed, String num, String name, int n, Boolean f) {
        super(firma, speed, num);
        model = name;
        numDoors = n;
        fullTime = f;

    }

    public void setModel(String name) {
        model = name;
    }

    public String getModel() {
        return model;
    }

    public void setNumDoors(int n) {
        numDoors = n;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setFullTime(Boolean b) {
        fullTime = b;
    }

    public Boolean isFullTime() {
        return fullTime;
    }

    public String toString() {
        return getFirm() + " " + getMaxSpeed() + " " + model + " " + numDoors + " " + fullTime;
    }
}
