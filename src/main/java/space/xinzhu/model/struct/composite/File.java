package space.xinzhu.model.struct.composite;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/29
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class File extends Node{

    public File(String name){
        super(name);
    }

    @Override
    protected void add(Node child) {
        System.out.println("can't add.......");
    }

    @Override
    protected void tree(int space) {
        super.tree(space);
    }
}
