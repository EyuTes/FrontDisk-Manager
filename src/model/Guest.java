package model;

import java.io.IOException;

/**
 * Created by zack on 2018-03-31.
 */
public class Guest {

    String name;
    String lastName;
    String address;


    public Guest(String name, String lastName, String address) throws IOException {
        this.name=name;
        this.lastName=lastName;
        this.address=address;

    }

    /**
     * Empty constructor.
     */
    public Guest (){

    }


    public String getName(){
        return name ;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress (){
        return address;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setLastName(String lastName ){
        this.lastName=lastName;
    }


}