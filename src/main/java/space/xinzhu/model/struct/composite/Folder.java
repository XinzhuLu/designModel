package space.xinzhu.model.struct.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/29
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Folder extends Node{

    private List<Node> childrenNodes = new ArrayList<>();

    public Folder(String name){
        super(name);
    }

    @Override
    protected void add(Node child) {
        childrenNodes.add(child);
    }

    @Override
    protected void tree(int space) {
        super.tree(space);
        space++;
        for (Node node : childrenNodes){
            node.tree(space);
        }
    }
}
