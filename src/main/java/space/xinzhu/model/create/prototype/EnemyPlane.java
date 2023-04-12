package space.xinzhu.model.create.prototype;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/12
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class EnemyPlane implements Cloneable{

    //用于射杀对手的子弹，由于这是浅拷贝的指向对象，所以克隆体会指向同一颗子弹
    //private Bullet bullet = new Bullet();

    //想要克隆不同的子弹需要额外赋值
    private Bullet bullet;

    private int x;
    private int y = 0;

    @Override
    public EnemyPlane clone() throws CloneNotSupportedException{
        EnemyPlane clone = (EnemyPlane) super.clone();
        clone.setBullet(this.bullet.clone());
        return clone;
    }

    //开放set方法是为了克隆后有新值
    public void setX(int x) {
        this.x = x;
    }
    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    //构造时追加新子弹
    public EnemyPlane(Bullet bullet, int x) {
        this.bullet = bullet;
        this.x = x;
    }

    public EnemyPlane(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void fly(){
        y++;
    }




}
