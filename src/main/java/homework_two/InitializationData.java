package homework_two;

import java.util.*;

public class InitializationData {
    private Information information;

    public InitializationData() {
        information = new Information();
    }

    public Information fillTheData() {
        List<String> nicknames = new ArrayList<>();
//        nicknames.addAll(fillNicknamesList());

        Set<String> mail = new HashSet<>();
//        mail.addAll(fillNicknamesSet());

        Map<String, String> mailNicknames = new HashMap<>();
//        mailNicknames.putAll(fillEmailNicknameMap());

        for (int i = 0; i < 31; i++) {
            nicknames.add("nickname" + i);
            mail.add("nickname@gmail.com" + i);
            mailNicknames.put("nickname" + i + "@gmail.com", "nickname" + i);
        }

        String mailToFill = "nick@gmail.com";
        String nicknameToFill = "nick";

        for (int i = 0; i < 10; i++) {
            nicknames.add(nicknameToFill);
            mail.add(mailToFill);
            mailNicknames.put(mailToFill, nicknameToFill);
        }

        information.setNicknamesList(nicknames);
        information.setMailsSet(mail);
        information.setMailsNicknamesMap(mailNicknames);

        if (checkSizeEquality(information) == false) {
            correctSize(information.getNicknamesList());
        }
        return information;
    }

//    public List<String> fillNicknamesList() {
//        List<String> list = new ArrayList<>();
//
//        for (int i = 0; i < 30; i++) {
//            list.add("nickname" + i);
//        }
//        return list;
//    }
//
//    public Set<String> fillNicknamesSet() {
//        Set<String> set = new HashSet<>();
//
//        for (int i = 0; i < 30; i++) {
//            set.add("nickname@gmail.com" + i);
//        }
//        return set;
//    }
//
//    public Map<String, String> fillEmailNicknameMap() {
//        Map<String, String> map = new HashMap<>();
//
//        for (int i = 0; i < 30; i++) {
//            map.put("nickname" + i + "@gmail.com", "nickname" + i);
//        }
//        return map;
//    }

    private List<String> correctSize(List<String> list) {
        Set<String> uniqueNicknameSet = new HashSet<>(list);
        list.clear();
        list.addAll(uniqueNicknameSet);
        return list;
    }

    private boolean checkSizeEquality(Information information) {
        if (information.getNicknamesList().size() == information.getMailsSet().size()
                && information.getMailsSet().size() == information.getMailsNicknamesMap().size()) {
            return true;
        }
        return false;
    }
}
