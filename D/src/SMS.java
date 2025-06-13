public class SMS implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS : "+message);
    }
}
