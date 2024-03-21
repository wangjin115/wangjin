package com.wj.mhl.service;

import com.wj.mhl.dao.MenuDAO;
import com.wj.mhl.domain.Menu;

import java.util.List;

/**
 * @author wj
 * @version 1.0
 */
public class MenuService {
    private MenuDAO menuDAO=new MenuDAO();
//すべての料理を返し、インターフェイスの使用に戻る
public List<Menu> list(){
    return menuDAO.queryMulti("select * from menu",Menu.class);
}
//idに従ってメソッドが必要、Menuオブジェクトを返す
public Menu getMenuById(int id) {
    return menuDAO.querySingle("select * from menu where id = ?", Menu.class, id);
}

}
