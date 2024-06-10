package org.telusko;

public class Alien {

    private int age;
    public void coding()
    {
        System.out.println("Coding Started");
    }

    public void printAge()
    {
        System.out.println("The current age is :" + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
