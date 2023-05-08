package space.xinzhu.model.action.memento;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {
/*        Editor editor = new Editor(new Doc("<<TITLE>>"));

        editor.append("Cat 1");
        editor.append("\n 正文");

        editor.append("cat 2");

        editor.delete();*/

        Editor editor = new Editor(new Doc("<<TITLE>>"));

        editor.append("Cat 1");
        editor.append("\n 正文");

        editor.append("cat 2");

        editor.delete();

        editor.undo();
    }
}
