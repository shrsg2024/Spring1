package org.telusko;

public class Alien {

    private int age;

    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void coding()
    {
        System.out.println("Coding Started");
        laptop.compiling();
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
