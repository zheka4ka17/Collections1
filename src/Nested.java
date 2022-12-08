/*
В Java существуют 4 типа вложенных (nested) классов:
Статические вложенные классы
Внутренние классы
Локальные классы
Анонимные (безымянные) классы
 */
public class Nested {
    public static void main(String[] args) {
       Car car = new Car();
       //car.driver.go();
        System.out.println(car.isPlayerOn());
        Car.Player player = new Car.Player();
        //player.play();

        car.move();

        System.out.println(car.isPlayerOn());

    }
}


class Car {
    //Руль находится внутри автомобиля, поэтому private
    private  int wheelAngle = 0; //Angle of rotating
    private  boolean ignitionOn = false; //Key of ignition

    public boolean isPlayerOn() {
        return playerOn;
    }

    //Плейер
     public static boolean playerOn = false; //Car's player
    public Driver driver= new Driver();





    //Inner class (внутренний)
    public   class Driver{
        public  void go() {
            //Open the door, turn on the ignition, rotate the wheel
            playerOn = true;
            ignitionOn = true;
            wheelAngle = 30;
        }
    }
    public static class Player{
        public void play(){
           Car.playerOn= true;
        }


    }



    public void move(){
        class Navigator{
            public void navigate(){
                System.out.println("Navigate");
            }
        }
        Navigator navigator = new Navigator();
        navigator.navigate();
    }

    }




