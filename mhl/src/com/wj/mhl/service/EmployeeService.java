package com.wj.mhl.service;

import com.wj.mhl.dao.EmployeeDAO;
import com.wj.mhl.domain.Employee;

/**
 * @author wj
 * @version 1.0
 * このクラスは、Employee テーブルに対してさまざまな操作を実行します (EmployeeDAO オブジェクトを呼び出すことで実行されます)。
 */
public class EmployeeService {
    // EmployeeDAO プロパティを定義する。
    private EmployeeDAO employeeDAO=new EmployeeDAO();
    // empId と pwd に基づいて Employee オブジェクトを返すメソッド
    //クエリが動作しない場合は null を返します。
    public Employee getEmployeeByIdAndPwd(String empId, String pwd) {

        return employeeDAO.querySingle("select * from employee where empId=? and pwd=md5(?)", Employee.class, empId, pwd);

    }
}
