package homework_one;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AdminService extends AbstractService implements Service{
    public void writeUserData(Entity entity) throws IOException {
        File file = new File(getFilePath());
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        fileWriter.write(entity.toString());
        fileWriter.close();
    }
}
