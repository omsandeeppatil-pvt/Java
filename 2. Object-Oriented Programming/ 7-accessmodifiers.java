class AccessModifiers {
        public int publicVar = 1;
            private int privateVar = 2;
                protected int protectedVar = 3;
                    int defaultVar = 4;

                        void display() {
                                System.out.println("Public: " + publicVar);
                                        System.out.println("Private: " + privateVar);
                                                System.out.println("Protected: " + protectedVar);
                                                        System.out.println("Default: " + defaultVar);
                                                            }
                                                            }

                                                            public class AccessModifiersTest {
                                                                public static void main(String[] args) {
                                                                        AccessModifiers obj = new AccessModifiers();
                                                                                obj.display();

                                                                                        System.out.println("Accessing public variable: " + obj.publicVar);
                                                                                                // Private variable cannot be accessed outside the class
                                                                                                    }
                                                                                                    }

