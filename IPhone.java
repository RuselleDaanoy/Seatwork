public class IPhone implements PhoneCall, TextMessage, Browser, Image{
    @Override
    public void browseWeb(String url) {
        System.out.println(url);
    }

    @Override
    public void takePicture() {
        System.out.println();
    }

    @Override
    public void makeCall(String number) {
        System.out.println(number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println(number + ", " + message);
    }
}