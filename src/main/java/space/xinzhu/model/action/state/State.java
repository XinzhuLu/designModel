package space.xinzhu.model.action.state;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public interface State {

    void switchToGreen(TrafficLight trafficLight);
    void switchToYellow(TrafficLight trafficLight);
    void switchToRed(TrafficLight trafficLight);
}
