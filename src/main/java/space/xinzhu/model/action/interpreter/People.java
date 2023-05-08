package space.xinzhu.model.action.interpreter;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class People {

    private String name;
    private People other;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void connect(People other){
        this.other=other;
    }

    public void talk(String msg){
        other.listen(msg);
    }

    public void listen(String msg){
        System.out.println(other.getName() + "对" + this.name + "说：" + msg);
    }
}
