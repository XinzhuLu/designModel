package space.xinzhu.model.action.templateMethod;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) {
        //Mammal mammal = new Whale();
        //mammal.live();
        //mammal = new Human();
        //mammal.live();

        PM pm = new HRProject();
        pm.kickoff();

        pm = new APIProject();
        pm.kickoff();
    }
}
