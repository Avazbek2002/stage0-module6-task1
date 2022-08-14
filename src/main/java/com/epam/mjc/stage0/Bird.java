package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird () {
        super();
        super.setColor("blue");
        super.setNumberOfPaws(2);
        super.setHasFur(false);
    }

    @Override
    public void getDescription () {
        System.out.println("This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.");
    }
}
