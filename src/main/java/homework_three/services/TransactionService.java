package homework_three.services;

import homework_three.entities.Client;
import homework_three.exeptions.UserExpectedError;
import homework_three.utils.Helper;

public class TransactionService {
    public void transferOfMoney(Client client, String clientAccountID) throws UserExpectedError {
        Helper helper = new Helper();
        helper.checkAccountIdEquality(client.getClientAccountID(), clientAccountID);
    }
}

