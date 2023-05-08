package space.xinzhu.model.action.chainOfResponsibility;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class CFO extends Approver {

    public CFO(String name){
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 10000){
            System.out.println("审核通过。【总监：" + name + "】");
        }else {
            System.out.println("驳回申请。【总监：" + name + "】");
        }
    }

/*    private String name;

    public CFO(String name) {
        this.name = name;
    }

    public boolean approve(int amount){
        if (amount <= 10000){
            System.out.println("审核通过。【总监：" + name + "】");
            return true;
        }else {
            System.out.println("驳回申请。【总监：" + name + "】");
            return  false;
        }
    }*/
}
