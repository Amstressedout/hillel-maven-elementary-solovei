package homework_three;

import homework_three.entities.Client;
import homework_three.exeptions.UserExpectedError;
import homework_three.exeptions.WrongFieldException;
import homework_three.exeptions.WrongSumException;
import homework_three.services.TransactionService;
import homework_three.utils.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserExpectedError {
        Helper helper = new Helper();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Client Account ID : ");

        String accountIdWhoSends = scanner.next();
        String validAccountIdWhoSends =
                validateAccountIdLength(accountIdWhoSends, scanner, helper);

        System.out.println("Enter recipient client Account Id: ");
        String accountIdWhoAccepts = scanner.next();
        String validAccountIdWhoAccepts =
                validateAccountIdLength(accountIdWhoAccepts, scanner, helper);

        System.out.println("Enter sum of money transaction: ");
        double sum = scanner.nextDouble();
        double validSum = validateSumOfTransaction(sum, scanner, helper);
        scanner.close();

        System.out.println("Sum of transaction is " + validSum + "hrn. " +
                "Please wait for checking the client data ...");

        Client client = new Client();
        client.setClientAccountID(validAccountIdWhoSends);
        client.setSum(validSum);

        TransactionService service = new TransactionService();
        service.transferOfMoney(client, validAccountIdWhoAccepts);
        System.out.println("Money Transaction is successful!");
    }

    private static String validateAccountIdLength(String accountId, Scanner scanner, Helper help) {
        while (accountId.length() != 10) {
            try {
                help.checkClientAccountID(accountId);
            } catch (WrongFieldException e) {
                e.printStackTrace();
            }
            System.out.println("Account Id length should be 10.\n" +
                    "Enter Account Id again:");
            accountId = scanner.next();
        }
        return accountId;
    }

    private static Double validateSumOfTransaction(Double sum, Scanner sc, Helper help) {
        while (sum > 1000) {
            try {
                help.checkSum(sum);
            } catch (WrongSumException e) {
                e.printStackTrace();
            }
            System.out.println("Sum cannot be bigger than 1000.\n" +
                    "Enter Sum of transaction again: ");
            sum = sc.nextDouble();
        }
        return sum;
    }
}
