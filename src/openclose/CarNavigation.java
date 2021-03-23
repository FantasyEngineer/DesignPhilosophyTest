package openclose;

/**
 * 车辆导航类
 */
public class CarNavigation extends Car {

    private void navigate() {
        System.out.println("开始导航");
    }


    @Override
    public void run() {
        this.navigate();
        System.out.println("跟着导航行驶");
    }
}
