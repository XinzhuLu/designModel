package space.xinzhu.model.action.strategy;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/08
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class Calculator {

/*    public int add(int a , int b){
        return a+b;
    }

    public int sub(int a , int b){
        return a-b;
    }*/
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getResult(int a , int b){
        return this.strategy.calculate(a, b);
    }
}
