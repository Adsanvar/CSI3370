package edu.oakland.solutions.homework;

public class Mixer{
    private Mixer m1;

    public Mixer(){
    }
    public Mixer(Mixer m){
        m1 = m;
    }

    public static void main(String[] args){
        Mixer m2 = new Mixer();
        Mixer m3 = new Mixer(m2);
        m3.go();
        Mixer m4 = m3.m1;
        m4.go();
        Mixer m5 = m4;
        m5.go();
    }

    void go()
    {
        System.out.println("hi ");
    }
}