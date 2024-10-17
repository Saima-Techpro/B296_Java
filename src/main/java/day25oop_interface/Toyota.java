package day25oop_interface;

public class Toyota implements Brake, Engine, AirCond{
    // override the methods from Brake interface

    public void abs(){
        System.out.println("Toyota use ABS brake system.");
    }

    @Override // optional to use @Override
    public void esp(int a) {
        System.out.println("Toyota use ESP brake system.");
    }

    @Override
    public void run() {
        System.out.println("Toyota runs hybrid engine");
    }

    // override the methods from Engine interface
    @Override
    public void eco() {
        System.out.println("Toyota uses eco-friendly engine");
    }

    @Override
    public void turbo() {
        System.out.println("Turbo is embedded in Toyota eco-friendly engine");
    }


    // override the methods from AirCond interface

    @Override
    public void digital() {
        System.out.println("Toyota uses digital AC system");
    }


}
