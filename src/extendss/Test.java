package extendss;

/**
 * @author :guorui
 * @Date :2023/3/19 20:25
 */
public class Test {
    public static void main(String[] args) {
        Animal a=new Animal("动物","白色",3);
        a.eat();
/*
Cat
 */
        Cat cat =new Cat();
        cat.setColor("白色");
        cat.setAge(5);
        cat.setName("胖虎");
        cat.catchMouse();
        /*
        tiger
         */
        Tiger tiger =new Tiger();
        tiger.setName("lisi");
        tiger.setAge(5);
        tiger.setColor("白色");
        tiger.hunt();



    }
}
