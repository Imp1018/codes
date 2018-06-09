package com.lanou3g.code0408.constructor;

/**
 *  * 构造方法使用场景2
 * 当一个对象 创建出来之后 大多数时候都要设置某些初始值
 * 那么我们可以吧这些属性 放到构造方法中去赋值 来简化代码
 * 这种使用方式 不要忘记 手动把无参构造方法补上
 * 否则 当不需要给初始值创建时,就没有办法使用无参的构造方法了
 */


public class Mouse {
    private String brand;
    private String color;
    private String way;    //   工作方式


    public Mouse() {}

    public Mouse(String brand, String color, String way) {
        this.brand = brand;
        this.color = color;
        this.way = way;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }
}
