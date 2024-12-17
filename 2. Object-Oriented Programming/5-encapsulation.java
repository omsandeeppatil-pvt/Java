// Encapsulation example
class Employee {
    // Private variables
        private String name;
            private int id;

                // Getter for name
                    public String getName() {
                            return name;
                                }

                                    // Setter for name
                                        public void setName(String name) {
                                                this.name = name;
                                                    }

                                                        // Getter for id
                                                            public int getId() {
                                                                    return id;
                                                                        }

                                                                            // Setter for id
                                                                                public void setId(int id) {
                                                                                        this.id = id;
                                                                                            }
                                                                                            }

                                                                                            public class Encapsulation {
                                                                                                public static void main(String[] args) {
                                                                                                        Employee emp = new Employee();

                                                                                                                // Setting values using setters
                                                                                                                        emp.setName("Alice");
                                                                                                                                emp.setId(101);

                                                                                                                                        // Getting values using getters
                                                                                                                                                System.out.println("Employee Name: " + emp.getName());
                                                                                                                                                        System.out.println("Employee ID: " + emp.getId());
                                                                                                                                                            }
                                                                                                                                                            }
                                                                                                                                                            