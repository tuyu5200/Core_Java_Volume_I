package commonSign.superTypeBound;

/**
 * Program is use
 * Version: 2016/7/16
 * Author: Tuyu
 */
public class Pair<T> {
    private T min;
    private T max;

    public Pair(T min, T max) {
        this.min = min;
        this.max = max;
    }

    public Pair() {

    }

    public T getMin() {
        return min;
    }

    public void setMin(T min) {
        this.min = min;
    }

    public T getMax() {
        return max;
    }

    public void setMax(T max) {
        this.max = max;
    }

    /**
     * 将工资最高和最低的经理放在一个对象中
     * @param managers 经理集合
     * @return 对象
     */
    // TODO: 2016/7/16 感觉有点问题
    public static Pair<? super Manager> minAndMaxBouns(Manager[] managers) {
        if (managers == null || managers.length == 0) {
            return null;
        }
        Manager min = managers[0];
        Manager max = managers[0];
        for (Manager manager : managers) {
            if (min.getBouns() > manager.getBouns()) {
                min = manager;
            }
            if (max.getBouns() < manager.getBouns()) {
                max = manager;
            }
        }
        return new Pair<>(min, max);
    }
}
