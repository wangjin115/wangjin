package com.wj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

/**
 * @author wj
 * @version 1.0
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress host = InetAddress.getByName("dreaMTanknoMacBook-Pro.local");
        System.out.println("host="+host);

        InetAddress host1 = InetAddress.getByName("www.baidu.com");
        System.out.println("host1"+host1);

        String hostAddress = host1.getHostAddress();
        System.out.println("host1对应的ip="+hostAddress);

        String hostName = host1.getHostName();
        System.out.println("host1对应的主机名/域名"+hostName);


    }
}
