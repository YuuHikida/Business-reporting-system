package com.example.demo;
import java.util.Random;
public class Cleric {
    String name="";
     int hp = 0;
     final int maxHp=50;
     int mp=0;
     public void setMp(int mp){
         this.mp=mp;
     }
     public Cleric (String name,int hp,int mp)
     {
         this.name=name;
         this.hp=hp;
         this.mp=mp;

     }

   final int maxMp=10;

   void selfAid()
    {
        this.mp -=5;
        this.hp += maxHp;
    }
    public int pray(int sec)
    {

        //理論回復 secは5固定 ランダム数は0~2まで つまり 5,6,7
        int recover = new Random().nextInt(3)+sec;

        //回復計算
        int actuallyRecovery = Math.min(this.maxMp-this.mp,recover);
        this.mp += actuallyRecovery;
        System.out.println("MPが"+actuallyRecovery+"回復した");
        return actuallyRecovery;

 }

}
