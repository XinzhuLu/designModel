package space.xinzhu.model.action.strategy;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Addition implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
