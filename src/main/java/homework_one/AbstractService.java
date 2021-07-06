package homework_one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public abstract class AbstractService {
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public boolean check(Entity entity) throws IOException {

        File file = new File(getFilePath());
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String mail = entity.getMail();
        while ((line = bufferedReader.readLine()) != null) {
            if (line == mail) {
                return true;
            } else {
                return false;
            }
        }
        fileReader.close();
        bufferedReader.close();
        return false;
    }
}
