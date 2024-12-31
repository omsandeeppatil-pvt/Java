class Singleton {
    // Private static instance of the class
    private static Singleton instance;

    // Private constructor to restrict instantiation
    private Singleton() {
        System.out.println("Singleton Instance Created!");
    }

    // Public static method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Verify both references point to the same object
        System.out.println("Are both instances same? " + (s1 == s2));
    }
}
