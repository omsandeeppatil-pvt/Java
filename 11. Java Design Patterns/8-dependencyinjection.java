// Service Interface
interface MessageService {
    void sendMessage(String message);
}

// Concrete Service
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

// Consumer
class MyApplication {
    private MessageService service;

    public MyApplication(MessageService service) {
        this.service = service;
    }

    public void processMessage(String message) {
        service.sendMessage(message);
    }
}

public class DependencyInjection {
    public static void main(String[] args) {
        MessageService service = new EmailService();
        MyApplication app = new MyApplication(service);

        app.processMessage("Hello, Dependency Injection!");
    }
}
