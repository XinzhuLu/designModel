package space.xinzhu.model.create.abstractFactory;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public interface AbstractFactory {

    LowClassUnit cteateLowClass();

    MidClassUnit cteateMidClass();

    HithClassUnit cteateHithClass();
}
