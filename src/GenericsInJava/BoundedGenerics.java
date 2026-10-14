package GenericsInJava;

import java.util.Map;

public class BoundedGenerics<T extends Number> {
    private T num;

    public BoundedGenerics(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

}

//class BoundedGenerics2<T implements Map> {
//    private T num;
//
//    public BoundedGenerics2(T num) {
//        this.num = num;
//    }
//
//    public T getNum() {
//        return num;
//    }
//
//    public void setNum(T num) {
//        this.num = num;
//    }
//
//}

class BoundedGenericsTest{

    public static void main(String[] args) {
        BoundedGenerics<Integer> intObj = new BoundedGenerics<>(10);
        System.out.println("Integer value: " + intObj.getNum());

        BoundedGenerics<Double> doubleObj = new BoundedGenerics<>(20.5);
        System.out.println("Double value: " + doubleObj.getNum());

//        BoundedGenerics<String> stringObj = new BoundedGenerics<>("Hello");//This will give compile time error because String is not a subclass of Number

        // The following line would cause a compile-time error because String is not a subclass of Number
        // BoundedGenerics<String> stringObj = new BoundedGenerics<>("Hello");
    }
}
