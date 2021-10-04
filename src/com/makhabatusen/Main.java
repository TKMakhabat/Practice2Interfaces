package com.makhabatusen;

import com.makhabatusen.instrument.Brass;
import com.makhabatusen.instrument.Percussion;
import com.makhabatusen.instrument.Stringed;
import com.makhabatusen.instrument.WoodWind;
import com.makhabatusen.person.Bulgarian;
import com.makhabatusen.person.Chinese;
import com.makhabatusen.person.European;
import com.makhabatusen.person.Person;

public class Main {

    public static void main(String[] args) {
        Bulgarian bulgarian = new Bulgarian("Галин");
        System.out.println(bulgarian.sayHello());

        European european = new European("John");
        System.out.println(european.sayHello());

        Chinese chinese = new Chinese("Yan");
        System.out.println(chinese.sayHello());

        System.out.println("_____");
        WoodWind woodWind = new WoodWind();
        woodWind.play();
        System.out.println(woodWind.what());

        System.out.println("_____");
        Brass brass = new Brass();
        brass.play();
        brass.adjust();

        System.out.println("_____");
        Stringed stringed = new Stringed();
        stringed.play();
        stringed.adjust();
        stringed.what();


        System.out.println("_____");
        Percussion percussion = new Percussion();
        percussion.adjust();
        percussion.play();
        percussion.what();
    }
}
