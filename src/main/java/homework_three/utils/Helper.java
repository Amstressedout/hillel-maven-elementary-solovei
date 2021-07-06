package homework_three.utils;

import homework_three.exeptions.UserExpectedError;
import homework_three.exeptions.WrongFieldException;
import homework_three.exeptions.WrongSumException;

public class Helper {

    public void checkClientAccountID(String clientAccountID) throws WrongFieldException {
        if (clientAccountID.length() == 10) {
            throw new WrongFieldException("Incorrect client Account Id length: "
                    + clientAccountID.length());
        }
    }

    public void checkSum(double sum) throws WrongSumException {
        if (sum > 1000) {
            throw new WrongSumException("Incorrect sum: " + sum);
        }
    }

    public void checkAccountIdEquality(String clientAccountIDSend, String clientAccountIDAccept) throws UserExpectedError {
        if (clientAccountIDSend.equals(clientAccountIDAccept)) {
            throw new UserExpectedError("Account Id Who Sends should not match Account Id who accepts.\n" + "Transaction failed.");
        }
    }
}
