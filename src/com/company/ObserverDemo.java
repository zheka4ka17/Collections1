package com.company;

import java.util.Observable;
import java.util.Observer;

//наблюдатель
public class ObserverDemo {
    public static void main(String[] args) {
Child child=new Child();
Mother mother = new Mother(child);
child.addObserver(mother);
child.make();
    }
}

class Child extends Observable{


    public void make(){
        setChanged();
        notifyObservers();
    }

}

class Mother implements Observer{
    private Child child;

    public Mother(Child child) {
        this.child = child;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o==child)
            System.out.println("mother is observing");

    }
}
