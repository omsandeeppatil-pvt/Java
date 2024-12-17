interface Vehicle {
        void start();
        }

        class Car implements Vehicle {
            public void start() {
                    System.out.println("Car starts with a key.");
                        }
                        }

                        class Bike implements Vehicle {
                            public void start() {
                                    System.out.println("Bike starts with a kick.");
                                        }
                                        }

                                        public class InterfaceExample {
                                            public static void main(String[] args) {
                                                    Vehicle car = new Car();
                                                            car.start();

                                                                    Vehicle bike = new Bike();
                                                                            bike.start();
                                                                                }
                                                                                }
        