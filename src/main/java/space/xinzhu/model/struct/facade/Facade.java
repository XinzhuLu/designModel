package space.xinzhu.model.struct.facade;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/29
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Facade {

    private VegVendor vegVendor;
    private Chef chef;
    private Waiter waiter;
    private Cleaner cleaner;

    public Facade(){
        this.vegVendor = new VegVendor();
        this.chef = new Chef();
        this.waiter = new Waiter();
        this.cleaner = new Cleaner();
    }

    public void order(){
        waiter.order();
        chef.cook();
        waiter.serve();
        cleaner.clean();
        cleaner.wash();
    }
}
