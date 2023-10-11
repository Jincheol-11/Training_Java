package com.mystudy.run.TrainingJava;

public class MakeTVLogic2 {
    public static void main(String[] args) {
        MakeTVLogic tvLogic= new MakeTVLogic();
        tvLogic.channel = 100;
        tvLogic.volume = 0;
        System.out.println("CH:"+tvLogic.channel+", VOL:"+ tvLogic.volume);
        tvLogic.channelDown();
        tvLogic.volumeDown();
        System.out.println("CH:"+tvLogic.channel+", VOL:"+ tvLogic.volume);
        tvLogic.volume = 100;
        tvLogic.channelUp();
        tvLogic.volumeUp();
        System.out.println("CH:"+tvLogic.channel+", VOL:"+ tvLogic.volume);
    }
}
