package com.wj.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wj
 * @version 1.0
 * 文件上传的服务器端
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {

        //1.サーバーがローカルホストで8888ポートをリッスンしています
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("サーバーがローカルホストで8888ポートをリッスンしています");
        //2.接続を待っています
        Socket socket = serverSocket.accept();

        //3.クライアントから送信されたデータを読み取る
        //Socketで入力ストリームを取得する
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //4.bytes配列が取得され、指定されたパスに書き込まれ、ファイルが取得されます。
        String desFilePath="/Users/dreamtank/IdeaProjects/chapter20/src/wb2.png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desFilePath));
        bos.write(bytes);
        System.out.println("ファイルのコピーが成功しました");
        bos.close();
        //クライアントに「画像を受け取りました」と返信
        //socketで出力ストリーム (文字) を取得します
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("画像を受け取りました");
        writer.flush();//コンテンツをデータチャネルにフラッシュする
        socket.shutdownOutput();//書き込み終了マーカーを設定する

        writer.close();
        bis.close();
        socket.close();
        serverSocket.close();


    }
}
