//所属するパッケージを宣言
package pac.zoo.animal;

public class Dog extends AbstractAnimal {

    public Dog (String name) {
        super(name);
    }

    //アノテーション
    @Override
    public void eat() {
        System.out.println("犬の" + getName() + "はドッグフードをガシガシ食べます。");
    }
}