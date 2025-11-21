//所属するパッケージを宣言
package pac.zoo.animal;

//抽象クラス
public abstract class AbstractAnimal {
    
    private String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    //抽象メソッド
    public abstract void eat();

    //動物によって変える
    public void sleep() {
        System.out.println("横たわってすやすや眠ります");
    }

    public String getName() {
        return name;
    }
}