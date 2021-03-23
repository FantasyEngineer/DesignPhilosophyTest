package openclose;


/**
 * 例题：设计汽车Car，有start、run和stop方法，现在需要增加导航功能。
 * 开闭原则 的概念
 * 软件实体应当对扩展开放，对修改关闭
 */
public class Car {

    //要能开启
    public void start() {
        System.out.println("car start--");
    }

    //要能停止
    public void stop() {
        System.out.println("car stop--");
    }

    //要能跑
    //这里增加了新需求，需要增加导航功能。

    /**
     * 不使用开闭原则的解法
     * 在Car类中修改代码
     */

    public void run() {
        /**
         * //但是有些车可能不需要导航，调用了run方法可能会出现问题
         */
        System.out.println("car run--");
    }


    public static void main(String[] args) {
        //没有导航的汽车
        System.out.println("没有导航的汽车");
        Car car = new Car();
        car.start();
        car.run();
        car.stop();

        System.out.println("");
        //有导航的汽车
        System.out.println("有导航的汽车");
        CarNavigation carNavigation = new CarNavigation();
        carNavigation.start();
        carNavigation.run();
        carNavigation.stop();
    }


}
