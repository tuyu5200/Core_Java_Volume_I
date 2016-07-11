package MyInterfaceTest;

/**
 * 方法用途：
 * Created by Tuyu on 2016/7/11 17:41 .
 */
public class setNameAndSchoolImpl implements setName, setSchool {

    @Override
    public String setSchool(String school) {
            return school;
    }

    @Override
    public String setName(String name) {
        return name;
    }
}
