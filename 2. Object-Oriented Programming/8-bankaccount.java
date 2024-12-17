class BankAccount {
        private double balance;

            public BankAccount(double initialBalance) {
                    this.balance = initialBalance;
                        }

                            public void deposit(double amount) {
                                    balance += amount;
                                            System.out.println("Deposited: " + amount);
                                                }

                                                    public void withdraw(double amount) {
                                                            if (balance >= amount) {
                                                                        balance -= amount;
                                                                                    System.out.println("Withdrawn: " + amount);
                                                                                            } else {
                                                                                                        System.out.println("Insufficient balance!");
                                                                                                                }
                                                                                                                    }

                                                                                                                        public void displayBalance() {
                                                                                                                                System.out.println("Current Balance: " + balance);
                                                                                                                                    }
                                                                                                                                    }

                                                                                                                                    public class BankAccountTest {
                                                                                                                                        public static void main(String[] args) {
                                                                                                                                                BankAccount account = new BankAccount(1000);
                                                                                                                                                        account.deposit(500);
                                                                                                                                                                account.withdraw(200);
                                                                                                                                                                        account.displayBalance();
                                                                                                                                                                            }
                                                                                                                                                                            }