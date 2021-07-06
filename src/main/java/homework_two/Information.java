package homework_two;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Information {

    private List<String> nicknamesList;
    private Set<String> mailsSet;
    private Map<String, String> mailsNicknamesMap;

    public List<String> getNicknamesList() {
        return nicknamesList;
    }

    public void setNicknamesList(List<String> nicknamesList) {
        this.nicknamesList = nicknamesList;
    }

    public Set<String> getMailsSet() {
        return mailsSet;
    }

    public void setMailsSet(Set<String> mailsSet) {
        this.mailsSet = mailsSet;
    }

    public Map<String, String> getMailsNicknamesMap() {
        return mailsNicknamesMap;
    }

    public void setMailsNicknamesMap(Map<String, String> mailsNicknamesMap) {
        this.mailsNicknamesMap = mailsNicknamesMap;
    }
}
