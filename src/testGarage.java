public class testGarage {
    public static void main(String[] args) {
        GarageCar myGarage = new GarageCar();
        Car myCar1 = new Car("Ford", 200,"X777AM", "Mustang", 2, false); //Задание 2: удобавление номера машинам
        myGarage.addCar(myCar1);
        myGarage.addCar(new Car("Lada", 140, "Kalina","B104KO", 4, false)); //Задание 2: удобавление номера машинам

        Truck myTuck = new Truck("Dove", 160, "DTS","O000OO", 700, true); //Задание 2: удобавление номера машинам
        myGarage.addCar(myTuck);
        myGarage.printGarage();
        if (myGarage.findCar(myCar1)){
            System.out.println("Да");
            myGarage.removeCar(myTuck); //Задание 1: удаление машины из гаража
        }
    }
}
