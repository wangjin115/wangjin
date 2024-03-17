package com.wj.upload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author wj
 * @version 1.0
 * 文件上传的客户端
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //1.クライアントはサーバーに接続し、Socket オブジェクトを取得します。
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //2.ディスクからファイルを読み取る入力ストリームを作成する
        String filePath ="/Users/dreamtank/IdeaProjects/chapter20/src/wb.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        //bytes は filePath に対応するバイト配列です
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //Socketで出力ストリームを取得し、bytes データをサーバーに送信します。
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);//ファイルに対応するバイト配列の内容をデータチャネルに書き込みます
        bis.close();
        socket.shutdownOutput();//書き込んだデータのエンドマークを設定します
        //=====サーバーから返信されたメッセージを受信する=====
        InputStream inputStream = socket.getInputStream();
        //StreamUtils メソッドを使用して、
        //inputStream によって読み取られたコンテンツを文字列に直接変換します。

        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        bos.close();
        socket.close();



    }
}
