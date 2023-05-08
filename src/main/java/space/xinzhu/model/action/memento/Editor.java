package space.xinzhu.model.action.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Editor {

    private Doc doc;

    private List<History> historyRecords;
    private int historyPosition = -1;

    public Editor(Doc doc) {
        System.out.println("<<<<打开文档" + doc.getTitle());
        this.doc = doc;

        historyRecords = new ArrayList<>();
        backup();

        show();
    }

    public void append(String txt){
        System.out.println("<<<<插入操作");
        doc.setBody(doc.getBody() + txt);

        backup();

        show();
    }

    public void delete(){
        System.out.println("<<<<删除操作");
        doc.setBody("");

        backup();

        show();
    }

    public void save(){
        System.out.println("<<<<存盘操作");
    }


    private void show(){
        System.out.println(doc.getBody());
        System.out.println("文档结束>>>>>");
    }

    private void backup(){
        historyRecords.add(doc.createHistory());
        historyPosition++;
    }

    public void undo(){
        System.out.println(">>>>撤销操作");
        if (historyPosition == 0){
            return;
        }
        historyPosition--;
        History history = historyRecords.get(historyPosition);
        doc.restoreHistory(history);
        show();
    }

    public void redo(){}
}
