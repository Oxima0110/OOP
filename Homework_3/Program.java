package Homework_3;

import Homework_3.UserList.UserName;
import Homework_3.UserList.UserNumber;

public class Program {
    public static void main(String[] args) {
        UserList<UserName> userList = new UserList<>();
        userList.add(new UserName("Vasia"));
        userList.add(new UserName("Oleg"));
        userList.add(new UserName("Sasha"));

        for (UserName user : userList) {
            System.out.println(user);
        }


        UserList<UserNumber> userList2 = new UserList<>();
        userList2.add(new UserNumber(456328));
        userList2.add(new UserNumber(246957));
        userList2.add(new UserNumber(258964));

        for (UserNumber user : userList2) {
            System.out.println(user);
        }
    }
}
