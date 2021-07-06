package homework_one;

import java.io.IOException;

public interface Service {

    boolean check(Entity entity) throws IOException;

    void writeUserData(Entity entity) throws IOException;

}
