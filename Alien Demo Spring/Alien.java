package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  // by default spring follow the singleton, so if i will not add @Scope(value = "prototype") then by default it will create the object
//@Scope(value = "prototype")  // the moment i add this, then it will not create the object or instance by default, so now when i call getBean then the object will be create
public class Alien {
    private int aid;
    private String aname;
    private String tech;
    // using @Autowired we will get connected with the object created by the spring framework
    @Autowired  // as Alien class is dependent on the Laptop class, so actually we have to establish the connection between Alien and Laptop Class Object
    // default name of object of Laptop class is laptop(all in lower case) in spring container and object name of class Alien is alien in th spring container

    // we can also search Laptop class object by its name , by using the
    // annotation @Qualifier
    // @Qualifier("laptop") // because default object name of Laptop class  is laptop(all in lower case), further we can also change its default name using
    // @Component("the name we want to give"), do this in Laptop class
    @Qualifier("lap1")
    private Laptop laptop;

    public Alien() {
        System.out.println("Object Created...");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    public void show(){
        System.out.println("in show...");
        laptop.compile();
    }

}
