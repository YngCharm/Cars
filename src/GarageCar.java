import java.util.ArrayList;

public class GarageCar {
    private ArrayList<Auto> masCar = new ArrayList<>();

    public GarageCar() {

    }

    public void addCar(Auto m){
        masCar.add(m);
    }
    public void removeCar(Auto d){ //Задание 1: удаление машин из гаража
        if (masCar.contains(d)){
            masCar.remove(d);
        }
        System.out.println("\t" + masCar);
    }
    public Boolean findCar(Auto m){
        return masCar.contains(m);
    }
    public GarageCar(ArrayList <Auto> n){
        masCar = n;
    }
    public void printGarage(){
        System.out.println("В гараже: ");
        for (Auto a: masCar){
            System.out.println("\t" + a.toString());
        }
    }
}
