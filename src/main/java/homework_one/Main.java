package homework_one;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "C:/Users/solov/IdeaProjects/hillel-maven-elementary-solovei/src/main/resources/File.txt";

        Admin admin = new Admin();
        admin.setName("Michael");
        admin.setSurname("Kebede");
        admin.setAge(26);
        admin.setMail("michaelkebede01@gmail.com");
        admin.setPassword("kebede634512");

        User user = new User();
        user.setName("Sonya");
        user.setSurname("Lisovskaya");
        user.setAge(19);
        user.setMail("sonyalisovskaya11221@gmail.com");
        user.setPassword("s1o2n3y4a5");

        UserService userService = new UserService();
        userService.setFilePath(filePath);

        AdminService adminService = new AdminService();
        adminService.setFilePath(filePath);

        userService.writeUserData(user);
        adminService.writeUserData(admin);
        adminService.writeUserData(user);

        System.out.println(userService.check(admin));
        System.out.println(adminService.check(user));
    }
}
