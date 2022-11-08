package creationals.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int generation = 12;
        Iphone obj = null;
        // Don't do this in the same method:
        if(11 == generation) obj = new Iphone11();
        else  obj = new Iphone12();

        // Do this instead
        obj = IphoneFactory.getInstance(11);
        System.out.println(obj);
    }
}
