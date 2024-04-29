public class BasicPhone implements PhoneCall, TextMessage {
    @Override
    public void makeCall(String number) {
        System.out.println(number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println(number + ", " + message);
    }
}
