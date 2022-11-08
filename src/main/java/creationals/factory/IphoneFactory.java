package creationals.factory;

public class IphoneFactory {

    public static Iphone getInstance(int generation){
        if(11 == generation) return new Iphone11();
        return new Iphone12();
    }
}
