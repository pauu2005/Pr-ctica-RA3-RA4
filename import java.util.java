import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        processDeposit(account, scanner);
        processWithdraw(account, scanner);
        showBalance(account);
    }

    private static void processDeposit(Account account, Scanner scanner) {
        System.out.println("Introdueix la quantitat a ingressar:");
        double amount = scanner.nextDouble();
        try {
            account.depositAmount(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void processWithdraw(Account account, Scanner scanner) {
        System.out.println("Introdueix la quantitat a retirar:");
        double amount = scanner.nextDouble();
        try {
            account.withdrawAmount(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void showBalance(Account account) {
        System.out.println("Saldo actual: " + account.getBalance() + "€");
    }
}
