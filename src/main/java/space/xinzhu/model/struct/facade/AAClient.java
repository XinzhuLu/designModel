package space.xinzhu.model.struct.facade;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public void eat(){
        System.out.println("开始用餐。。。");
    }

    public void wash(){
        System.out.println("wash........");
    }

    public static void main(String[] args) {

        VegVendor vegVendor = new VegVendor();
        vegVendor.purchase();
        Helper sister = new Helper();
        sister.cook();
        AAClient client = new AAClient();
        client.eat();
        client.wash();

        System.out.println("----------门面-----------");

        Facade facade = new Facade();
        facade.order();
    }
}
