package com.faum.faum_user;



public class User_Infromation {

    private String firstname,lastname;


    public User_Infromation(){

    }



    public User_Infromation(String fname,String lname){
        this.firstname = fname;
        this.lastname =lname;

    }




    public String getLastname() {
        return lastname;
    }
    public String getFirstname() {
        return firstname;
    }


}
