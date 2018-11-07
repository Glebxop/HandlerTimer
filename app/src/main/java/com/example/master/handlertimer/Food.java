package com.example.master.handlertimer;

public class Food {
   private String name;
   private String number;

   public static Food[] food=new Food[]{
           new Food("ONe","1"),
           new Food("Two","2"),
           new Food("THree","3"),
           new Food("Four","4"),
   };

    public Food(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
