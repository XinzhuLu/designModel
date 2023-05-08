package space.xinzhu.model.action.state;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class TrafficLight {

    //String state = "red";

/*    public void switchToGreen(){
        if (state.equals("green")){
            System.out.println("ERROR!!!It is green");
        }else if(state.equals("red")){
            System.out.println("ERROR!!!Red can not be green");
        }else if(state.equals("yellow")){
            state = "green";
            System.out.println("OK...green 60s");
        }
    }

    public void switchToYellow(){
        if (state.equals("green")){
            System.out.println("ERROR!!!It is green");
        }else if(state.equals("red")){
            System.out.println("ERROR!!!Red can not be green");
        }else if(state.equals("yellow")){
            state = "green";
            System.out.println("OK...green 60s");
        }
    }

    public void switchToRed(){
        if (state.equals("green")){
            System.out.println("ERROR!!!It is green");
        }else if(state.equals("red")){
            System.out.println("ERROR!!!Red can not be green");
        }else if(state.equals("yellow")){
            state = "green";
            System.out.println("OK...green 60s");
        }
    }*/

    State state = new Red();

    public void setState(State state){
        this.state = state;
    }

    public void switchToGreen(){
        state.switchToGreen(this);
    }

    public void switchToYellow(){
        state.switchToYellow(this);
    }
    public void switchToRed(){
        state.switchToRed(this);
    }
}
