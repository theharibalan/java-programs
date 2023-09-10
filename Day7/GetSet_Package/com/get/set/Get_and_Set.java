package com.get.set;
public class Get_and_Set {
    String name;
    int accno;
    private String Pwd;

//    This is for name
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

//    This for account no
    public int getAccno(){
        return accno;
    }
    public void setAccno(int accno){
        this.accno = accno; // (this)-It can only used when we access subclass to main class
    }
//    This for password
    public String getPwd(){
        return Pwd;
    }
    public void setPwd(String pwd) {
        Pwd = pwd;
    }

}
