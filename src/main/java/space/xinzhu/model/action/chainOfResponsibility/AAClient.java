package space.xinzhu.model.action.chainOfResponsibility;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {
        int amount = 10001;

/*        Staff staff = new Staff("张飞");

        if (!staff.approve(amount)){
            Manager manager = new Manager("关羽");
            if (!manager.approve(amount)){
                CFO cfo = new CFO("刘备");
                cfo.approve(amount);
            }
        }*/

        Approver fightJohn = new Staff("张飞");
        fightJohn.setNextApprover(new Manager("关羽")).setNextApprover(new CFO("刘备"));

        fightJohn.approve(1000);
        fightJohn.approve(4000);
        fightJohn.approve(10000);
        fightJohn.approve(10001);
    }
}
