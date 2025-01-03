import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Service Interface
interface MessageService {
    void sendMessage(String message);
}

// Service Implementation
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent with message: " + message);
    }
}

// Client Class
class NotificationClient {
    private MessageService messageService;

    // Constructor Injection
    public NotificationClient(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}

public class IoCAndDIExample {
    public static void main(String[] args) {
        // Load Spring Configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Get Bean and Use It
        NotificationClient client = context.getBean("notificationClient", NotificationClient.class);
        client.notifyUser("Hello from IoC and DI!");
    }
}
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Service Interface
interface MessageService {
    void sendMessage(String message);
}

// Service Implementation
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent with message: " + message);
    }
}

// Client Class
class NotificationClient {
    private MessageService messageService;

    // Constructor Injection
    public NotificationClient(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}

public class IoCAndDIExample {
    public static void main(String[] args) {
        // Load Spring Configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Get Bean and Use It
        NotificationClient client = context.getBean("notificationClient", NotificationClient.class);
        client.notifyUser("Hello from IoC and DI!");
    }
}
