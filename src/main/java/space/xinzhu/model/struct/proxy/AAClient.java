package space.xinzhu.model.struct.proxy;

import java.lang.reflect.Proxy;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/11
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class AAClient {

    public static void main(String[] args) throws Exception {
        //Internet proxy = new RouterProxy();
        //proxy.httpAccess("www.movie.com");
        //proxy.httpAccess("www.game.com");
        //proxy.httpAccess("www.work.com");

        Internet internet = (Internet) Proxy.newProxyInstance(
                RouterProxy.class.getClassLoader(),
                RouterProxy.class.getInterfaces(),
                new BlackListFilter(new RouterProxy())
        );

        internet.httpAccess("www.movie.com");
        internet.httpAccess("www.game.com");
        internet.httpAccess("www.work.com");

        Intranet intranet = (Intranet) Proxy.newProxyInstance(
                Switch.class.getClassLoader(),
                Switch.class.getInterfaces(),
                new BlackListFilter(new Switch())
        );
        intranet.fileAccess("www.movie.com");
        intranet.fileAccess("www.game.com");
        intranet.fileAccess("www.work.com");
    }
}
