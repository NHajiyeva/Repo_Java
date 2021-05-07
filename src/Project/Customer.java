package Project;

import java.util.Scanner;

public class Customer {
    private static String customersName;
    private static String customersSsn;
    private static String customersAddress;
    int customerAccountNumber;
    static String[] accountTypes = new String[]{"checking", "savings"};
    private static String[] editDetails = new String[]{"name", "address"};
    private static double checkingAccountbalance = 0;
    private static double savingsAccountbalance = 0;


    public void createCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you name");
        this.customersName = input.next();
        System.out.println("Please enter you address");
        this.customersAddress = input.next();
        System.out.println("Please enter your ssn");
        this.customersSsn = input.next();
        System.out.println("Congratulations you just created new account!");
    }

    public void createAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Please enter what type of account you would like to create");
        String userInput = input.next();

        for (int i = 0; i < accountTypes.length; ++i) {
            if (accountTypes[i].equalsIgnoreCase(userInput)) {
                ++customerAccountNumber;
                System.out.println("You successfully created " + userInput + " account, your account number is --> " + customerAccountNumber);
                break;
            } else {
                System.out.println("Please enter valid account type");
                break;
            }
        }
    }

    public void editDetails() {

        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to edit?");
        String userInput = input.next();


        if (userInput.equalsIgnoreCase("name")) {
            System.out.println("Please enter new name");
            String userUpdatedName = input.next();
            customersName = userUpdatedName;
            System.out.println("You successfully updated your name to --> " + customersName);
        } else if (userInput.equalsIgnoreCase("address")) {
            System.out.println("Please enter new address");
            String userUpdatedAddress = input.next();
            customersAddress = userUpdatedAddress;
            System.out.println("You successfully updated your address to --> " + customersAddress);
        } else {
            System.out.println("Incorrect request");
        }
    }


    public void showAccountBalance() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n Please enter account number to see the balance.");
        int usersInputNumber = userInput.nextInt();
        if (usersInputNumber == this.customerAccountNumber) {
            System.out.println("\n Account number " + this.customerAccountNumber + "\n Account balance " + this.checkingAccountbalance);
        } else {
            System.out.println("\n No account found by entered number, please try again.");
        }
    }

    public void makeDeposit() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n Please enter account number to make a deposit. ");
        int usersInputNumber = userInput.nextInt();
        if (usersInputNumber == this.customerAccountNumber) {
            System.out.println("Please enter deposit amount. ");
            int enteredAmount = userInput.nextInt();
            if (enteredAmount > 0) {
                this.checkingAccountbalance = checkingAccountbalance + enteredAmount;
                System.out.println("\n Your updated balance is " + checkingAccountbalance);
            } else {
                System.out.println("PLease enter valid amount");
            }
        } else {
            System.out.println("Please enter valid account number");
        }
    }

    public void makeWithdrawal() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n Please enter account number to make a withdrawal. ");
        int usersInputNumber = userInput.nextInt();
        if (usersInputNumber == this.customerAccountNumber) {
            System.out.println("Please enter withdrawal amount. ");
            int enteredAmount = userInput.nextInt();
            if (enteredAmount <= checkingAccountbalance) {
                this.checkingAccountbalance = checkingAccountbalance - enteredAmount;
                System.out.println("\n Your updated balance is " + checkingAccountbalance);
            } else {
                System.out.println("Please enter valid amount");
            }
        } else {
            System.out.println("Please enter valid account number");
        }
    }
}
