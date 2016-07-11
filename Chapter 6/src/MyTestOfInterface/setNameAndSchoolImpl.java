package MyTestOfInterface;

/**
 * 方法用途： 接口的扩展
 * Created by Tuyu on 2016/7/11 17:41 .
 */
public class setNameAndSchoolImpl implements setName, setSchool {

    private String uname;

    public String getUname() {
        return uname;
    }

    @Override
    public String setSchool(String school) {
            return school;
    }

    @Override
    public void setName(String name) {
        uname=name;
    }
}
