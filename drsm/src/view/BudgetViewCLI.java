import java.util.Scanner;

/**
 *
 * @author Mattafire
 */
public class BudgetViewCLI {

    public BudgetViewCLI() {
    }
    //all data must be string
    //account 0-Name 1-Budget ammount 2-balance 3-is rollover account 4-all transactions
    public void accountView(String[][] accounts) {
        System.out.println("ACCT# |     Account Name     | Account Budget | Account Balance | Is Rollover");
        System.out.println("------|----------------------|----------------|-----------------|------------");
        for (int i = 0; i < accounts.length; i++) {
            // 5          20                      15                       15                       5
            //Account #  Account name          Account budget          account balance          is rollover
            //System.out.print(i + " " + accounts[i][0] + " " + accounts[i][1] + " " + accounts[i][2]+ " "+ " "+accounts[i][3]); //);
            //Account #
            if (i < 10) {
                System.out.print("  " + i + "   | ");
            } else if (i > 9 && i < 100) {
                System.out.print(" " + i + "   | ");
            }
            //Account name
            if (accounts[i][0].length() < 20) {
                System.out.print(accounts[i][0]);
                for (int l = accounts[i][0].length(); l < 20; l++) {
                    System.out.print(" ");
                }
            } else {
                for (int l = 0; l < 20; l++) {
                    System.out.print(accounts[i][0].charAt(l));
                }
            }
            System.out.print(" | $");
            //Account budget
            if (accounts[i][1].length() < 13) {
                System.out.print(accounts[i][1]);
                for (int l = accounts[i][1].length(); l < 13; l++) {
                    System.out.print(" ");
                }
            } else {
                for (int l = 0; l < 13; l++) {
                    System.out.print(accounts[i][1].charAt(l));
                }
            }
            System.out.print(" | $");
            //Account budget
            if (accounts[i][2].length() < 14) {
                System.out.print(accounts[i][2]);
                for (int l = accounts[i][2].length(); l < 14; l++) {
                    System.out.print(" ");
                }
            } else {
                for (int l = 0; l < 14; l++) {
                    System.out.print(accounts[i][2].charAt(l));
                }
            }
            System.out.print(" | ");
            //is rollover
            if (accounts[i][3].length() < 6) {
                System.out.print(accounts[i][3]);
                for (int l = accounts[i][3].length(); l < 6; l++) {
                    System.out.print(" ");
                }
            } else {
                for (int l = 0; l < 6; l++) {
                    System.out.print(accounts[i][3].charAt(l));
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public String menu() {
        System.out.println("Please choose and option:");
        System.out.println("1: New Account");
        System.out.println("2: Edit Account");
        System.out.println("3: View Accounts");
        System.out.println("4: Quit");
        System.out.print(">>");
        Scanner input = new Scanner(System.in);
        String userIn = input.next();
        return userIn;
    }

    //account 0-Name 1-Budget ammount 2-balance 3-is rollover account 4-all transactions
    public void viewAccount(String[] account) {
        System.out.println("1 Name: " + account[0]);
        System.out.println("2 Budget: $" + account[1]);
        System.out.println("3 Balance: $" + account[2]);
        System.out.println("4 Rollover: " + account[3]);
        System.out.println("5 Transactions");
        System.out.println("6 none");
    }

    public String editAccount() {
        System.out.print("Please choose an Account number:");
        return getUserInput();
    }

    public String editAccountChoice() {
        System.out.print("Please choose an account detail to edit:");
        return getUserInput();
    }

    public String getName() {
        System.out.print("Please enter a new Account name:");
        return getUserInput();
    }

    public String getBudget() {
        System.out.print("Please entera new Account budget:");
        return getUserInput();
    }

    public String getRollover() {
        System.out.print("Please enter if Account ballance will rolloever (Y/N):");
        return getUserInput();
    }

    public String getExpenseCost() {
        System.out.print("Please enter Expence cost: $");
        return getUserInput();
    }

    public String getExpenseDate() {
        System.out.print("Please enter Expence date:");
        return getUserInput();
    }

    public String getExpenseLocation() {
        System.out.print("Please enter where the Expence occured:");
        return getUserInput();
    }

    private String getUserInput() {
        Scanner input = new Scanner(System.in);
        String userIn = input.nextLine();
        return userIn;
    }
}
