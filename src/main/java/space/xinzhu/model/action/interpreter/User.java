package space.xinzhu.model.action.interpreter;

import java.util.Objects;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class User {

    private String name;
    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void login(ChatRoom chatRoom){

        chatRoom.register(this);
        this.chatRoom = chatRoom;
    }

    public void logOut(){

        chatRoom.deregister(this);
        this.chatRoom = null;
    }

/*    public void talk(String msg){
        chatRoom.sendMsg(this , msg);
    }*/

    public void talk(String msg){
        if (Objects.isNull(chatRoom)){
            
        }
    }

    public void listen(User fromWhom ,String msg){
        System.out.println("【" + this.getName() + "的对话框】");
        System.out.println(fromWhom.getName() + "说" + msg);
    }
}
