package homework_one;

import java.io.IOException;

public class UserService extends AbstractService implements Service{
    private static final String Message = "Not available for this method.";

    @Override
    public void writeUserData(Entity entity) throws IOException {
        System.out.println(Message);
    }
}
