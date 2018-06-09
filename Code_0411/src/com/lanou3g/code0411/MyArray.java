package com.lanou3g.code0411;

/*
         动态数组扩容
*/

// 用起来和数组差不多 一个啥都能放的容器
//并且还不需要指定初始长度
//能随着 里面内容多少 变大变小

import com.lanou3g.code0411.exceptions.IndexOutException;

//现在的问题是
//使用Object类型啥都能放
//如果 我们能够在创建myArray的时候就能确定
//这个数组可以放的元素类型 那么在取出元素时
//就不会产生类型转换异常了
public class MyArray<E> {
    private Object[] datas;  //用来放元素的数组
    private int count = 0;     //当前数组中已经存放的元素个数

    public MyArray() {
        //我们上来就定义一个能放10个元素的数组
        //之所以取10,是因为随便想的
        datas = new Object[10];
    }

    public void put(E object) {
        //放元素
        datas[count] = object;
        count++;
        //放满了怎么办
        if (count == datas.length) {
            //放满了  创建一个新数组,是原来数组长度的2倍
            Object[] newArr = new Object[datas.length * 2];
            //把旧数组中的所有元素放到新数组中
            for (int i = 0; i < datas.length; i++) {
                newArr[i] = datas[i];
            }
            //把datas 赋值成新的大数组
            datas = newArr;
        }
    }

    public E get(int index) {
        //根据下标 取元素
        //认为用户都很聪明 不会取超出范围的元素
        if (index < 0 || index >= count) {
            //如果索引超出了我们支持的范围
            //那么我们就让程序崩溃 并给出确切的错误信息
            throw new IndexOutException(count - 1, index);
        }
        return (E) datas[index];
    }

    public void remove(int index) {
        //根据下标 删除元素
    }

    //用来确定有多少元素
    public int size() {
        return count;
    }
}