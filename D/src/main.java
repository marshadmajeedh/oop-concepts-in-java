public class main {
    public static void main(String[] args) {

        MessageService[] msgService = {
                new Email(),
                new SMS()
        };

        MessageSender msgSender = new MessageSender(msgService);
        msgSender.sendMessage("Hey there this is the last principle");
    }
}
