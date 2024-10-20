class BicycleDemo{

    int cadence=0;
    int speed=0;
    int gear=1;

    void changeCadence(int newValue){
        cadence=newValue;
    }
    void changeGear(int newValue){
        gear=newValue;

    }
    void speedUp(int increment){
        speed=speed+increment;

    }
    void applyBrakes(int decrement){
        speed=speed-decrement;

    }
    void printStates(){
        System.out.println("cadence: "+cadence + "speed: " + speed + " gear: " + gear);
    }

}
class  Bicycle{

    public static void main(String [] args){
     
        BicycleDemo b1=new BicycleDemo();
        BicycleDemo b2=new  BicycleDemo();

        b1.changeCadence(50);
        b1.speedUp(10);
        b1.changeGear(2);
        b1.printStates();

        b2.changeCadence(50);
        b2.speedUp(10);
        b2.changeGear(2);
        b2.changeCadence(40);
        b2.speedUp(10);
        b2.changeGear(3);
        b2.printStates();

        







    }

}