public class Account {
    private double balance;

    public Account() {
        this.balance = 0; // Saldo inicial
    }

    public double getBalance() {
        return balance;
    }

    public void depositAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("L'import ha de ser positiu.");
        }
        balance += amount;
        System.out.println("S'ha dipositat: " + amount + "€ | Nou saldo: " + balance + "€");
    }

    public void withdrawAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("L'import ha de ser positiu.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Saldo insuficient per retirar " + amount + "€");
        }
        balance -= amount;
        System.out.println("S'ha retirat: " + amount + "€ | Nou saldo: " + balance + "€");
    }
}
