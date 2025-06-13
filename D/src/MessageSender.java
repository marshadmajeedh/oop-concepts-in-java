public class MessageSender {
    private MessageService[] messages;
    public MessageSender(MessageService[] messages) {
        this.messages = messages;
    }

    public void sendMessage(String message) {
        for (MessageService ms : messages) {
            ms.sendMessage(message);
        }
    }
}
