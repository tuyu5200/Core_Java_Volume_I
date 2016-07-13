package abstractClasses;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/11 16:15 .
 */
public class Student extends Person {
    private String major;
    private String school;

    public Student(String name, String major, String school) {
        super(name);
        this.major = major;
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String Description() {
        String description="This is a student at "+school+" in "+major;
        return description;
    }

}
