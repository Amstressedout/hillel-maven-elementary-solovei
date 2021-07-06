package homework_two;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        InitializationData initializationData = new InitializationData();
        Information information = initializationData.fillTheData();

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(22);
        listInteger.add(77);

        Information information1 = addString(listInteger, information);

        System.out.println("List nickname size : " + information1.getNicknamesList().size());
        System.out.println("Set mail size : " + information1.getMailsSet().size());
        System.out.println("Map mail-nickname size : " + information1.getMailsNicknamesMap().size());
    }

    private static Information addString(List<? extends Number> numbers, Information information) {
        List<String> nicknamesList1 = information.getNicknamesList();
        Set<String> mailSet1 = information.getMailsSet();
        Map<String, String> mailNicknameMap1 = information.getMailsNicknamesMap();

        for (int i = 0; i < numbers.size(); i++) {
            String nicknames = String.valueOf(numbers.get(i));

            nicknamesList1.add(nicknames);
            mailSet1.add(nicknames + "@mail.ua");
            mailNicknameMap1.put(nicknames + "@mail.ua", nicknames);

            Set<String> nicknameSet = new HashSet<>(nicknamesList1);
            nicknamesList1.clear();
            nicknameSet.addAll(nicknamesList1);
            nicknamesList1.addAll(nicknameSet);

        }
        return information;
    }
}
