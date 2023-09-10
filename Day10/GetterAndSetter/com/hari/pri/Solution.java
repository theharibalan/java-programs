package com.hari.pri;

class Pwd{
    private int pwd;

    //getter and setter are the solution for all access modifier
    public void setPwd(int x){ // 1
        this.pwd = x;
    }
    public int getPwd(){ //2
        return pwd;
    }

}
public class Solution {
    public static void main(String[] args) {
        Pwd p = new Pwd();
        p.setPwd(12345);
        System.out.println(p.getPwd());
    }
}
