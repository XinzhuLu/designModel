package space.xinzhu.model.action.interpreter;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {
        People p3 = new People("zhangsan");
        People p4 = new People("lisi");

        p3.connect(p4);
        p4.connect(p3);

        p3.talk("good morning");
        p4.talk("hello");

        ChatRoom chatRoom = new ChatRoom("designModel");
        User u3 = new User("zhangsan");
        User u4 = new User("lisi");
        User u5 = new User("wangwu");

        u3.login(chatRoom);
        u4.login(chatRoom);

        u3.talk("hi");
        u4.talk("hihi");

        u5.login(chatRoom);
        u5.talk("hello");
    }

}
