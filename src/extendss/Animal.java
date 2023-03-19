package extendss;

/**
 * @author :guorui
 * @Date :2023/3/19 20:12
 */
public class Animal {
    private  String name;
    private String color;
    private int age;

    public void eat(){
        System.out.println("一只"+color+"的"+name+"正在吃饭");
    }


    public Animal() {
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName(String 泰哥) {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


}
