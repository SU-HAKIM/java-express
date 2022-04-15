package com.hakim;

public class Main {
    private  String name;
    public Main(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        Main main=new Main("Hakim");
        changeName(main);
        System.out.println(getName(main));;
    }
    public void setName(String name){
        this.name=name;
    }

    private static void changeName(Main copyOfMain){
        copyOfMain.setName("Sadiul");
        System.out.println(copyOfMain.getName(copyOfMain));
    }

    public static String getName(Main ref){

        return ref.name;
    }
}
