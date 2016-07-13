package testDemo.UseReflectionToChangeFields;

import java.lang.reflect.Field;

/**
 * Version: ${Date}
 * Author: Tuyu
 */
public class Students {
    private String name;
    private String sex;
    private int age;

    public Students() {
    }

    public Students(String name, String sex, int age) {

        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name: " + name + " ," + " sex: " + sex + ", age: " + age;
    }

    /**
     * 通过反射改变域中的数据
     * @param object 对象
     * @param string 要改变的值
     */
    public void changeFields(Object object, String string) throws NoSuchFieldException {
        //获得对应的class对象
        Class cl =object.getClass();
        //通过class对象调用getDclaredfield
        Field field=cl.getDeclaredField("name");
        //设置似有域的访问权限
        field.setAccessible(true);


        // TODO: 2016/7/13 通过反射将对象域完整显示出来
        //Field[] fields= cl.getDeclaredFields();
        //if (fields.length > 0) System.out.println(Arrays.toString(fields));

        try {
            //Object obj = field.get(object);

            System.out.println(field.get(object));
            field.set(object, string);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
