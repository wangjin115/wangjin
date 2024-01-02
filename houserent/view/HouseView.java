package com.wj.houserent.view;

import com.wj.houserent.domain.House;
import com.wj.houserent.service.HouseService;
import com.wj.houserent.utils.Utility;

import java.util.Scanner;

public class HouseView {
    private boolean loop = true;
    // Scanner scanner = new Scanner(System.in);
    private char key = ' ';
    private HouseService houseService = new HouseService(2);

    //   private HouseService houseService=new HouseService(new House[10]);
    //根据id修改房屋信息   idに基づいて住居情報を修正する
    public void updateHouse() {
        System.out.println("==========修改房屋信息==========");
        System.out.println("请输入待修改房屋的编号（-1退出）：");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("==========放弃修改房屋信息==========");
            return;
        }
        //根据输入的id查找对象   入力idに基づいてオブジェクトを検索する
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("修改的房屋id信息不存在");
            return;
        }
        System.out.println("姓名(" + house.getName() + ")：");
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            house.setName(name);
        }
        System.out.println("电话(" + house.getTel() + ")：");
        String tel = Utility.readString(12, "");
        if (!"".equals(tel)) {
            house.setTel(tel);
        }
        System.out.println("地址(" + house.getAddress() + ")：");
        String address = Utility.readString(16, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.println("月租(" + house.getRent() + ")：");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.println("状态（未出租/已出租）(" + house.getState() + ")：");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("==========修改房屋信息成功==========");
    }
    //根据输入的id查找对象   入力idに基づいてオブジェクトを検索する
    public void findHouse() {
        System.out.println("==========查找房屋信息==========");
        System.out.print("请输入你要查找的id：");
        int findId = Utility.readInt();
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
            System.out.println(house);
        } else {
            System.out.println("查找的房屋id信息不存在");
        }


    }
    //根据输入的地址查找房屋对象
//    住所を入力して住居オブジェクトを検索します
    public void findHouseByAddress() {
        System.out.println("==========查找房屋信息==========");
        System.out.print("请输入你要查找的地址：");
        String findAddress = Utility.readString(16);
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        houseService.findByAddress(findAddress);

    }


    //完成退出确认    終了確認
    public void exit() {
        System.out.print("是否退出房屋系统，请小心选择，");
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    //编写delHouse()接收输入的id，调用service的del方法
//    delHouse()を書いて、入力IDを受け取り、serviceクラスのdelメソッドを呼び出す
    public void delHouse() {
        System.out.println("==========添加房屋信息==========");
        System.out.println("请输入待删除房屋的编号（-1退出）：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("==========放弃删除房屋信息==========");
            return;
        }
        System.out.print("是否删除房屋，请小心选择，");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {//真的删除吗   本当に削除しているのですか？
            if (houseService.del(delId)) {
                System.out.println("==========删除房屋信息成功==========");
            } else {
                System.out.println("==========房屋编号不存在，删除失败==========");
            }
        } else {
            System.out.println("==========放弃删除房屋信息==========");

        }


    }
//添加房屋信息，首先通过用户输入，调用service中的add方法，如果添加成功显示添加成功
//    添加失败则显示添加失败
// 住宅情報を追加し、まず、ユーザー入力を通じて、serviceクラスのaddメソッドを呼び出し、
// 追加が成功した場合は追加成功を表示し、追加が失敗した場合は追加失敗を表示します。
    public void addHouse() {
        System.out.println("==========添加房屋信息==========");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String tel = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态（未出租/已出租）：");
        String state = Utility.readString(3);

        House newHouse = new House(0, name, tel, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("==========添加房屋成功==========");
        } else {
            System.out.println("==========添加房屋失败==========");

        }

    }
//显示房屋列表
//住宅リストを表示
    public void listHouses() {
        System.out.println("==========房屋列表==========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);

        }
        System.out.println("==========房屋列表显示完毕==========");
    }
//主页面  メインページ

    public void mainMenu() {

        do {
            System.out.println("----------房屋出租系统----------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 显 示 房 屋 信 息");
            System.out.println("\t\t\t6 退       出");
            System.out.println("请输入你的选择（1-6）：");
            // key = scanner.next();
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
//                    findHouseByAddress();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);

        System.out.println("--------退出了房屋出租系统--------");

    }
}

