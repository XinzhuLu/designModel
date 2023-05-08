package space.xinzhu.model.struct.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @description: ???
 * Created by 馨竹 on 2023/05/05
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class BlackListFilter implements InvocationHandler {

    private List<String> blackList = Arrays.asList("movie" , "game" , "music" , "novel");
    private Object origin;

    public BlackListFilter(Object origin) {
        this.origin = origin;
        System.out.println("開啓黑名單過濾功能");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String arg = args[0].toString();
        for (String keywork : blackList){

            if (arg.contains(keywork)){
                System.out.println("禁止訪問" + arg);
                return null;
            }
        }

        System.out.println("校驗通過，轉向實際業務");
        return method.invoke(origin , arg);
    }
}
