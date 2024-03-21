package com.wj.mhl.service;

import com.wj.mhl.dao.BillDAO;
import com.wj.mhl.dao.MultiTableDAO;
import com.wj.mhl.domain.Bill;
import com.wj.mhl.domain.MultiTableBean;

import java.util.List;
import java.util.UUID;

/**
 * @author wj
 * @version 1.0
 */
public class BillService {
    private BillDAO billDAO=new BillDAO();
    private MenuService menuService=new MenuService();
    private DiningTableService diningTableService=new DiningTableService();
    private MultiTableDAO multiTableDAO=new MultiTableDAO();
//ヒント
    //料理を注文するメソッドを書く
    //1. 請求書を作成する
    //2.対応するテーブルのステータスを更新する必要がある。
    //3.成功すればtrueを返し、そうではなければfalseを返す。
    public boolean orderMenu(int menuId,int nums,int diningTableId){
        String billID = UUID.randomUUID().toString();
//請求額を直接計算するよう要求し、請求書テーブルに請求書を生成する。
        int update = billDAO.update("insert into bill values(null,?,?,?,?,?,now(),'未结账')",
                billID,menuId,nums,menuService.getMenuById(menuId).getPrice()*nums,diningTableId);
        if (update <= 0) {
            return false;
        }
        // 対応するテーブルのステータスを更新する必要がある。
        return diningTableService.updateDiningTableState(diningTableId, "就餐中");
    }
    //全て注文票を返し、Viewから呼び出される
    public List<Bill> list(){
        return billDAO.queryMulti("select * from bill", Bill.class);
    }
    public List<MultiTableBean> list2() {
        return multiTableDAO.queryMulti("SELECT bill.*, NAME,price  " +
                "FROM bill, menu " +
                "WHERE bill.menuId = menu.id", MultiTableBean.class);
    }
//特定のテーブルに未払いの注文票があるかどうかを確認する
public boolean hasPayBillByDiningTableId(int diningTableId) {

    Bill bill =
            billDAO.querySingle("SELECT * FROM bill WHERE diningTableId=? AND state = '未结账' LIMIT 0, 1", Bill.class, diningTableId);
    return bill != null;
}
//   チェックアウトを完了する。（テーブルが存在し、テーブルに未払い請求がある場合）
//payMode支払い方法
//成功した場合はtrueを、失敗した場合はfalseを返す
    public boolean payBill(int diningTableId, String payMode) {

        //ここでトランザクションを使用する場合、ThreadLocal を使用して解決する必要があります。
        //1. bill テーブルを修正する。
        int update = billDAO.update("update bill set state=? where diningTableId=? and state='未结账'", payMode, diningTableId);

        if(update <= 0) { ////結果が0未満の場合、更新は失敗、この方法全体も失敗する

            return false;
        }
        //2. diningTable テーブルを修正する。
        //注意: ここで直接操作せず、DiningTableService メソッドを呼び出して、それぞれの役割を反映させながら更新を完了させること。
        if(!diningTableService.updateDiningTableToFree(diningTableId, "空")) {
            return false;
        }//ここfalseを返したら、この方法全体も失敗する
        return true;

    }

}
