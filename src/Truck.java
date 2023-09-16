import java.util.Scanner;

public class Truck extends Auto {
    private String model;
    private int power;
    private boolean trailer;

    public Truck() {
        super();
        model = "";
        power = 0;
        trailer = false;
    }

    public Truck(String firma, int speed,String num, String name, int n, boolean f) {
        super(firma, speed, num);
        model = name;
        power = n;
        trailer = f;
    }

    public void SetModel(String name) {
        model = name;
    }

    public String getModel() {
        return model;
    }

    public void setPower(int n) {
        power = n;
    }

    public int getPower() {
        return power;
    }

    public void setTrailer(Boolean b) {
        trailer = b;
    }

    public Boolean isTrailer() {
        return trailer;
    }

    public void setAllInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фирму-производитель грузового авто: ");
        String nazv = in.next();
        setFirm(nazv);
        System.out.println("Введите максимальную скорость грузового авто: ");
        int s = in.nextInt();
        setMaxSpeed(s);
        System.out.println("Введите модель грузового авто: ");
        model = in.next();
        System.out.println("Введите мощность грузового авто: ");
        power = in.nextInt();
        System.out.println("Введите признак прицепа грузового авто (true/false): ");
        trailer = in.nextBoolean();
        System.out.println();
    }
    public String toString(){
        return "\n\tГрузовик" + "\n\t" + "Фирма: " + getFirm() + "\n\t" + "Максимальная скорость: " + getMaxSpeed() + "\n\t" + "Модель: " + model + "\n\t" + "Мощность: " + power + "\n\t" + "Признак прицепа: " + trailer + "\n";
    }

}
