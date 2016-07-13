package MyTestOfInterface;

/**
 * 方法用途：扩展接口
 * Created by Tuyu on 2016/7/11 17:35 .
 */
public interface setSchool extends setName {
    String schoolName = "成都理工大学";  //接口中不能包含实例域或静态方法，但是可以包含常量
    String setSchool(String school);
}
