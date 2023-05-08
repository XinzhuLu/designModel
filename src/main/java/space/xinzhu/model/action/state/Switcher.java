package space.xinzhu.model.action.state;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Switcher {

    private boolean state = false;

    public void switchOn(){

        if (state == false){

            state = true;
            System.out.println("OK...turn on");

        }else {
            System.out.println("ERROR");
        }
    }

    public void switchOff(){


        if (state == true){

            state = false;
            System.out.println("OH NO...turn off");

        }else {
            System.out.println("ERROR");
        }
    }
}
