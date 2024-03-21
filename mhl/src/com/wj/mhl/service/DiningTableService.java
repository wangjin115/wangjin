package com.wj.mhl.service;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.wj.mhl.dao.DiningTableDAO;
import com.wj.mhl.domain.DiningTable;

import java.util.List;

/**
 * @author wj
 * @version 1.0
 */
public class DiningTableService {
    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    //返回所有餐桌的信息
    public List<DiningTable> list() {

        return diningTableDAO.queryMulti("select id, state from diningTable", DiningTable.class);
    }
    // id に応じて、対応するテーブル DiningTable オブジェクトをクエリする。
    //null が返された場合は、id 番号に対応するテーブルが存在しないことを意味する。
    public DiningTable getDiningTableById(int id) {

        return diningTableDAO.querySingle("select * from diningTable where id = ?", DiningTable.class, id);
    }
    // テーブルが予約可能な場合、予約者の名前と電話番号を含むステータスを更新してメソッドを呼び出します。
    public boolean orderDiningTable(int id, String orderName, String orderTel) {

        int update =
                diningTableDAO.update("update diningTable set state='已经预定', orderName=?, orderTel=? where id=?", orderName, orderTel, id);

        return  update > 0;
    }
    public boolean updateDiningTable(int id,String state,String orderName,String orderTel){
        int update=diningTableDAO.update("update diningTable set state=?,orderName=?,orderTel=? where id=?",state,orderName,orderTel,id);
        return update>0;
    }
    // テーブルのステータスを更新するメソッドを提供する必要がある。
    public boolean updateDiningTableState(int id,String state){
     int update=diningTableDAO.update("update diningTable set state=? where id=?",state,id);
        return update>0;
    }
//    指定したテーブルを“空”にする
public boolean updateDiningTableToFree(int id, String state) {

    int update = diningTableDAO.update("update diningTable set state=?,orderName='',orderTel='' where id=?", state, id);
    return update > 0;
}

}
