package space.xinzhu.model.action.chainOfResponsibility;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Manager extends Approver{

/*    private String name;
    public Manager(String name) {
        this.name = name;
    }
    public boolean approve(int amount){
        if (amount <= 5000){
            System.out.println("审核通过。【经理：" + name + "】");
            return true;
        }else {
            System.out.println("无权审批，请找上级。【经理：" + name + "】");
            return  false;
        }
    }*/
    public Manager(String name){
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 5000){
            System.out.println("审核通过。【经理：" + name + "】");
        }else {
            System.out.println("无权审批，请找上级。【经理：" + name + "】");
            this.nextApprover.approve(amount);
        }
    }

}
