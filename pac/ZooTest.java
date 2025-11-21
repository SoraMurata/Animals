//所属するパッケージを宣言
package pac;

//他のパッケージのクラスを利用する
import pac.zoo.TamaZoo;
import pac.zoo.animal.*; //animalの中にファイルを追加しても動くように

public class ZooTest {
    public static void main(String[] args) {
        //動物園をインスタンス化
        TamaZoo zoo = new TamaZoo();

        //動物園に動物を連れてくる
        zoo.addAnimal(new Lion("しょうじ"));

        zoo.addAnimal(new Dog("ピノ"));
        //動物にエサをあげる
        zoo.meal();
    }
}