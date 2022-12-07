package abstraction;

public class Nokia extends Phone implements Camera,WiFi{

    @Override
    public void call() {
        System.out.println("Nokia way of call");

    }

    @Override
    public void text() {
        System.out.println("Nokia way of text");

    }

    @Override
    public void takesPhoto() {

    }

    @Override
    public void recordVideo() {

    }

    @Override
    public void connectToWiFi() {

    }
}
