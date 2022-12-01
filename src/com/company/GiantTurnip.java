package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class GiantTurnip {
    public static void main(String[] args) {
        FairyTale fairyTale= new FairyTale();
        fairyTale.tell();


    }
}
class Personage implements Comparable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Personage(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    private int strength;


    @Override
    public int compareTo(Object o) {

        return -this.getStrength()-((Personage)o).getStrength();
    }
}

class FairyTale{
    private  Queue<Personage> queue = new PriorityQueue<>();
    public FairyTale(){
        queue.add(new Personage("turnip",25)); //30
        queue.add(new Personage("old man",10));
        queue.add(new Personage("mouse",1));
        queue.add(new Personage("old woman",7));
        queue.add(new Personage("grand daughter",5));
        queue.add(new Personage("dog",3));
        queue.add(new Personage("cat",2));
    }

    public  void tell(){
        int sum = 0;
        Personage prev= queue.poll();
        int strength= prev.getStrength();
        Personage next = null;
        while (!queue.isEmpty()){
            next=queue.poll();
            sum+=next.getStrength();
            System.out.println("The "+next.getName()+ " took hold of the " + prev.getName() );
            prev= next;

        }
        if (sum>=strength)
            System.out.println("They pulled and pulled - and finally out came the turnip");
        else System.out.println("They pulled ann pulled. But still they could not put the turnip");
        // System.out.println(turnip.getName());

    }
}
