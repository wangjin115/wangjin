package com.wj.houserent.service;

import com.wj.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 0;//记录当前有多少个房屋信息 現在住宅情報を記録する
    private int idCounter = 0;//记录当前的id增长到哪个值了 現在のidの値を記録する

//    public HouseService(House[] houses) {
//        this.houses = houses;
//    }

    public HouseService(int size) {
        houses = new House[size];
    }

    //写一个find方法，返回House对象或者null
    //findメソッドを書いて、HouseオブジェクトかNULLを返す
    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }
    //这里增加了一个查找方法，是根据地址来查找
    //以下は、住所に基づいて、ルックアップ・メソッドの追加である。
    public void findByAddress(String findAddress) {
        int count =0;
        for (int i = 0; i < houseNums; i++) {
            if (houses[i].getAddress().equals(findAddress)) {
                count++;
            }
        }
        if (count==0){
            System.out.println("查找的房屋地址信息不存在");
            return;
        }
        House[] newHouses=new House[count];
        int newIndex=0;
        for (int i = 0; i < houseNums; i++) {
            if (houses[i].getAddress().equals(findAddress)) {
                newHouses[newIndex++] = houses[i];
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(newHouses[i]);

        }

    }

    public boolean del(int delId) {
        //使用index=-1这个思路，查找出想要删除的房屋
        //削除したい住宅を見つけるには、index=-1の考え方を使う。
        //如果index变了就说明找到了要删除的房屋，如果index还是-1，说明没有这个房屋就输出房屋编号不存在，删除失败
        //indexが変化すれば、削除する住宅が見つかったことを意味し、
        // indexが-1のままであれば、そのような住宅番号は存在しないことを意味するので、削除は失敗すると出力する。
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }

        //把要删除的这个位置的房子的后面的房子填到要删除的这个房子的位置，并且把最后一个房子信息设置为空
        //この位置に削除する住宅の後ろの住宅を記入し、最後の住宅の情報を空にする。
        //这时候返回true，说明删除房子信息成功了
        //今回はtrueを返して、住宅情報の削除が成功したことを示す

        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;
    }

    public boolean add(House newHouse) {
//    这里先用第一种方法写，就是先不考虑输多了要扩容的事
//    インプットを増やして容量を拡大することは、ここでは考えないことにしよう
//    判断是否可以继续添加
//    追加し続けられるかどうかを判断する
//        if (houseNums == houses.length) {
//            System.out.println("数组已满，不能再继续添加了。。。");
//            return false;
//        }

        //使用数组扩容的方法
//        配列の拡張方法を使用する

    if (houseNums==houses.length) {
            House[] newHouses = new House[houses.length + 1];
            for (int i = 0; i < houses.length; i++) {
                newHouses[i] = houses[i];
            }
         //  newHouses[houseNums++] = newHouse;
                houses = newHouses;

        }
    //这里也有两种写法，一个是把新增加的房屋加到数组最后以后再让原来的数组指向新数组
//        也可以是将让原来的数组指向新数组以后再将新增加的房屋加到数组的最后
//   ここでも2つの書き方があります。
//   1つは新しく追加された住宅を配列の末尾に追加して、元の配列が新しい配列を指すようにする方法です
//   また、新しい配列を指すようにした後、新しく追加された住宅を配列の最後に追加する方法もあります
  //  else{

//    把newHouse对象加入到这个houses这个数组里的现有元素的后面
//   newHouse オブジェクトを houses 配列の既存の要素の最後に追加します。

//    houses[houseNums]=newHouse;
//    houseNums++;
//    这两个可以合成一句，也就是在没有自增之前把新建的newHouse对象赋给没自增前houseNum这个下标的house元素
//    之后再自增，也就是做一个计数
//    これらの2つの文は1つの文にまとめることができ、
//    つまり、houseNumが自動増加する前に、新しく作成されたnewHouseオブジェクトをhouseNumが増加する前のhouse要素に割り当て、
//    その後に自動増加し、houseNumを増やしていく方法です。
        houses[houseNums++] = newHouse;
  //  }

//    需要设置一个id自增长的机制
//    IDの自動増加を設定する必要があります。
//    idCounter++;
//    newHouse.setId(idCounter);
//    这两句又可以就合成一句，这里相当于我先自增了，也就是现在idCounter是增大了1了
//    调用的是idCounter自增之后的setId
//  ここでは、実質的には私が最初に自己増加したと考えることができます。つまり、現在idCounterは1増加しています。
//  呼び出されるのは、idCounterが自己増加した後のsetIdです

        newHouse.setId(++idCounter);
        return true;
    }

    public House[] list() {
        return houses;
    }
}
