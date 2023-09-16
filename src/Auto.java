public class Auto {
    private String firm;
    private int maxSpeed;
    private String stateNum;

    public Auto() {

    }

    public void setStateNum(String num) {
        stateNum = num;
    }
    public String getSateNum(){ //Задание 2: удобавление номера машинам
        return stateNum;
    }

    public void setFirm(String firma) {
        firm = firma;
    }

    public void setMaxSpeed(int speed) {
        maxSpeed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFirm() {
        return firm;
    }

    public Auto(String firm, int maxSpeed, String stateNum) {
        this.stateNum = stateNum;
        this.firm = firm;
        this.maxSpeed = maxSpeed;
    }
}
