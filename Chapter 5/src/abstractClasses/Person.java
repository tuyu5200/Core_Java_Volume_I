package abstractClasses;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/11 16:12 .
 */
public abstract class Person {
    private String name;

    public abstract String Description();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
