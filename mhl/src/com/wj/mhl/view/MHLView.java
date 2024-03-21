package com.wj.mhl.view;

import com.wj.mhl.domain.*;
import com.wj.mhl.service.BillService;
import com.wj.mhl.service.DiningTableService;
import com.wj.mhl.service.EmployeeService;
import com.wj.mhl.service.MenuService;
import com.wj.mhl.utils.Utility;

import java.util.List;
import java.util.Map;

/**
 * @author wj
 * @version 1.0
 * 主界面
 */
public class MHLView {
    private boolean loop=true;
    private String key=""; //ユーザーの選択を受ける
    private EmployeeService employeeService = new EmployeeService();
    private DiningTableService diningTableService =new DiningTableService();
    private MenuService menuService=new MenuService();
    private BillService billService=new BillService();
    public static void main(String[] args) {
        new MHLView().mainMenu();
    }
    //すべての料理を表示する
    public void listMenu() {
        List<Menu> list= menuService.list();
        System.out.println("\n菜品编号\t\t菜品名\t\t类别\t\t价格");
        for (Menu menu : list) {
            System.out.println(menu);
        }
        System.out.println("==============显示完毕============");
    }
    //会計の完了
    public void payBill(){
        System.out.println("==============结账服务============");
        System.out.print("请选择要结账的餐桌编号(-1退出): ");
        int diningTableId = Utility.readInt();
        if (diningTableId == -1) {
            System.out.println("=============取消结账============");
            return;//代表结束payBill方法了//payBill メソッドが終了したことを意味する。
        }
        //テーブルが存在することを確認する
        DiningTable diningTable = diningTableService.getDiningTableById(diningTableId);
        if (diningTable == null) {
            System.out.println("=============结账的餐桌不存在============");
            return;
        }
        //テーブルに会計が必要な請求書があることを確認する。
        if (!billService.hasPayBillByDiningTableId(diningTableId)) {
            System.out.println("=============该餐位没有未结账账单============");
            return;
        }
        System.out.print("结账方式(现金/支付宝/微信)回车表示退出: ");
        String payMode = Utility.readString(20, "");//エンターキーを押すと、""を返す
        if ("".equals(payMode)) {
            System.out.println("=============取消结账============");
            return;
        }
        System.out.print("确认是否结账(Y/N): ");
        char key = Utility.readConfirmSelection();
        if (key == 'Y') { //会計

            //書いたメソッドを呼び出す
            if (billService.payBill(diningTableId, payMode)) {
                System.out.println("=============完成结账============");
            } else {
                System.out.println("=============结账失败============");
            }

        } else {
            System.out.println("=============取消结账============");
        }


    }
  //  請求情報を表示する
   public void listBill() {
//       List<Bill> bills = billService.list();
//       System.out.println("\n编号\t\t菜品号\t\t菜品量\t\t金额\t\t桌号\t\t日期\t\t\t\t\t\t\t状态");
//       for (Bill bill : bills) {
//            System.out.println(bill);
//       }
//       System.out.println("==============显示完毕============");
//
       List<MultiTableBean> multiTableBeans = billService.list2();
       System.out.println("\n编号\t\t菜品号\t\t菜品量\t\t金额\t\t桌号\t\t日期\t\t\t\t\t\t状态\t\t菜品名\t\t价格");
       for (MultiTableBean bill : multiTableBeans) {
           System.out.println(bill);
       }
       System.out.println("==============显示完毕============");
   }

    //オーダーを完成する
    public void orderMenu(){
    System.out.println("==============点餐服务============");
    System.out.print("请输入点餐的桌号(-1退出): ");
    int orderDiningTableId = Utility.readInt();
    if (orderDiningTableId == -1) {
        System.out.println("==============取消点餐============");
        return;
    }
    System.out.print("请输入点餐的菜品号(-1退出): ");
    int orderMenuId = Utility.readInt();
    if (orderMenuId == -1) {
        System.out.println("==============取消点餐============");
        return;
    }
    System.out.print("请输入点餐的菜品量(-1退出): ");
    int orderNums = Utility.readInt();
    if (orderNums == -1) {
        System.out.println("==============取消点餐============");
        return;
    }

    // テーブル番号が存在することを確認する。
    DiningTable diningTable = diningTableService.getDiningTableById(orderDiningTableId);
    if (diningTable == null) {
        System.out.println("==============餐桌号不存在============");
        return;
    }
    //商品番号を確認する
    Menu menu = menuService.getMenuById(orderMenuId);
    if (menu == null) {
        System.out.println("==============菜品号不存在============");
        return;
    }

    //オーダー
    if (billService.orderMenu(orderMenuId, orderNums, orderDiningTableId)) {
        System.out.println("==============点餐成功============");
    } else {
        System.out.println("==============点餐失败============");
    }
}
    //テーブルの予約完成
    public void orderDiningTable(){
        System.out.println("==============预定餐桌============");
        System.out.print("请选择要预定的餐桌编号(-1退出): ");
        int orderId = Utility.readInt();
        if (orderId == -1) {
            System.out.println("==============取消预订餐桌============");
            return;
        }
        System.out.print("确认是否预订(Y/N): ");
        char key = Utility.readConfirmSelection();
        if (key == 'Y') {//予約

            // orderId に対応する DiningTable オブジェクトを返す。
            // もし null ならば、そのオブジェクトが存在しないことを意味する。
            DiningTable diningTable = diningTableService.getDiningTableById(orderId);
            if (diningTable == null) {
                System.out.println("==============预订餐桌不存在============");
                return;
            }
            // テーブルのステータスが"空"かどうかを判断する。
            if (!("空".equals(diningTable.getState()))) {//このテーブルは現在「空」ではない。
                System.out.println("==============该餐桌已经预定或者就餐中============");
                return;

            }

            //予約情報を受け取る
            System.out.print("预定人的名字: ");
            String orderName = Utility.readString(50);
            System.out.print("预定人的电话: ");
            String orderTel = Utility.readString(50);
            // テーブルのステータスを更新する
            if (diningTableService.orderDiningTable(orderId, orderName, orderTel)) {
                System.out.println("==============预订餐桌成功============");
            } else {
                System.out.println("==============预订餐桌失败============");
            }

        } else {
            System.out.println("==============取消预订餐桌============");
        }

    }
    public boolean updateDiningTable(){
        System.out.print("请输入需要修改的餐桌编号：");
        int id = Utility.readInt();
        System.out.print("请输入需要餐桌状态：");
        String state = Utility.readString(10);
        System.out.print("预定人的名字: ");
        String orderName = Utility.readString(20, "");//エンターキーを押すと、nullを返す
        if ("".equals(orderName)) {
            System.out.println("null");
        }
        System.out.print("预定人的电话: ");
        String orderTel = Utility.readString(20, "");//エンターキーを押すと、nullを返す
        if ("".equals(orderTel)) {
            System.out.println("null");
        }

        return diningTableService.updateDiningTable(id,state,orderName,orderTel);

    }

 //すべてのテーブルのステータスを表示する
    public void listDiningTable() {
        List<DiningTable> list = diningTableService.list();
        System.out.println("\n餐桌编号\t\t餐桌状态");
        for (DiningTable diningTable : list) {
            System.out.println(diningTable);
        }
        System.out.println("==============显示完毕============");
    }
    public void mainMenu(){
        boolean returnToSecondMenu = false;
        while (loop){
            System.out.println("==========满汉楼(登录)==========");
            System.out.println("\t\t 1 登录满汉楼");
            System.out.println("\t\t 2 退出满汉楼");
            System.out.println("请输入你的选择：");
            key = Utility.readString(1);
            switch (key){
                case "1":
                    System.out.print("输入员工号: ");
                    String empId = Utility.readString(50);
                    System.out.print("输入密  码: ");
                    String pwd = Utility.readString(50);
                    Employee employee = employeeService.getEmployeeByIdAndPwd(empId, pwd);
                    //显示二级菜单, 这里二级菜单是循环操作，所以做成while
                    if (employee != null) {
                        System.out.println("===============登录成功[" + employee.getName() + "]================\n");

                        while (loop && !returnToSecondMenu) {
                            System.out.println("\n===============满汉楼(主菜单)================");
                            System.out.println("\t\t 1 餐桌状态");
                            System.out.println("\t\t 2 预定餐桌");
                            System.out.println("\t\t 3 菜单");
                            System.out.println("\t\t 4 点餐服务");
                            System.out.println("\t\t 5 查看账单");
                            System.out.println("\t\t 6 结账");
                            System.out.println("\t\t 9 返回登录页面");
                            System.out.println("\t\t 0 退出满汉楼");
                            System.out.print("请输入你的选择: ");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    while (loop && !returnToSecondMenu) {
                                        System.out.println("\n===============满汉楼(餐桌状态)================");
                                        System.out.println("\t\t 1 显示餐桌状态");
                                        System.out.println("\t\t 2 修改餐桌状态");
                                        System.out.println("\t\t 9 返回主菜单");
                                        System.out.println("\t\t 0 退出满汉楼");
                                        System.out.print("请输入你的选择: ");
                                        key = Utility.readString(1);
                                        switch (key) {
                                            case "1":
                                                listDiningTable();//テーブルのステータスを表示する
                                                break;
                                            case "2":
                                                updateDiningTable();
                                                break;
                                            case "9":
                                                returnToSecondMenu = true;
                                                break;
                                            case "0":
                                                loop = false;
                                                break;
                                            default:
                                                System.out.println("你的输入有误，请重新输入");
                                                break;
                                        }

                                    }
                                    returnToSecondMenu = false;
                                    break;
                                case "2":
                                     orderDiningTable();
                                    break;
                                case "3":
                                     listMenu();
                                    break;
                                case "4":
                                     orderMenu();
                                    break;
                                case "5":
                                     listBill();//显示所有账单
                                    break;
                                case "6":
                                    payBill();
                                    break;
                                case "9":
                                    returnToSecondMenu = true;
                                    break;
                                case "0":
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("你的输入有误，请重新输入");
                                    break;
                            }
                        }
                    }else {
                        System.out.println("===============登录失败================");
                    }
                    returnToSecondMenu = false;
                    break;
                case "2":
                    loop = false;//
                    break;
                default:
                    System.out.println("你输入有误，请重新输入");
            }
        }
        System.out.println("你退出了满汉楼系统~");
    }
}
