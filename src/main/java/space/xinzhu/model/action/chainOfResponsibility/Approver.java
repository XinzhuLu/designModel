package space.xinzhu.model.action.chainOfResponsibility;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public abstract class Approver {

    protected String name;
    protected Approver nextApprover;

    public Approver(String name) {
        this.name = name;
    }

    protected Approver setNextApprover(Approver nextApprover){
        this.nextApprover=nextApprover;
        return this.nextApprover;
    }

    public abstract void approve(int amount);
}
