package space.xinzhu.model.action.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public abstract class ChatRoom {

    private String name;
    List<User> users = new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }



    protected void register(User user){
        this.users.add(user);
        //System.out.print("welcome【");
        //System.out.print(user.getName());
        //System.out.println("】come in");
    }

    protected void deregister(User user){
        users.remove(user);
    }

    public void sendMsg(User fromWhom , String msg){
        users.stream().forEach(toWhom -> toWhom.listen(fromWhom , msg));
    }

    protected abstract void sendMsg(User from , User to , String msg);

    protected abstract String processMsg(User from , User to , String msg);
}
