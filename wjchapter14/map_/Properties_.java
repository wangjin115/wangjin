package com.wj.map_;

import java.util.Map;
import java.util.Properties;

/**
 * @author wj
 * @version 1.0
 */
public class Properties_ {
    public static void main(String[] args) {
      //Properties は Hashtable を継承しています
        // キーバリューペアを使用してデータを保存し、keyとvalue値はnullではいけません。
        Properties properties = new Properties();
        //追加
        properties.put("john",100);
        properties.put("lucy",100);
        properties.put("lic",100);
        properties.put("lic",88);

        //k を使用して対応する値を取得します。 検索
        System.out.println(properties.get("lic"));
        System.out.println(properties.getProperty("john"));
        //削除
        properties.remove("lic");
        System.out.println(properties);
        //更新
        properties.put("john","black");
        System.out.println(properties);
        //

    }
}
