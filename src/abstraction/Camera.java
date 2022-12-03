package abstraction;

public interface Camera {

    void takesPhoto();
    void recordVideo();

    public default void method1(){ // this is default method
        System.out.println("This is a default method");
    }

    public static  void method2(){
        System.out.println("This is a static method");
    }



}
