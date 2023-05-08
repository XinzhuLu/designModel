package space.xinzhu.model.action.chainOfResponsibility;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Staff extends Approver{

    //private String name;

/*    public Staff(String name) {
        this.name = name;
    }

    public boolean approve(int amount){
        if (amount <= 1000){
            System.out.println("审核通过。【专员：" + name + "】");
            return true;
        }else {
            System.out.println("无权审批，请找上级。【专员：" + name + "】");
            return  false;
        }
    }*/


    public Staff(String name){
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 1000){
            System.out.println("审核通过。【专员：" + name + "】");
        }else {
            System.out.println("无权审批，请找上级。【专员：" + name + "】");
            this.nextApprover.approve(amount);
        }
    }
}
