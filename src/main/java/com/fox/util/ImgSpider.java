package com.fox.util;

import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ImgSpider {

    private  static  String resouceUrl = "http://pic1.win4000.com/wallpaper/2017-12-12/5a2f9f65c2d4a_270_185.jpg";


    public static void main(String[] args) throws Exception {

        URL url = new URL(resouceUrl);

        URLConnection connection = url.openConnection();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String line = "";
        StringBuffer sb = new StringBuffer();

        while ((line= bufferedReader.readLine())!=null){
              sb.append(line + "\r\n");
        }

        File file = new File(resouceUrl);




    }


}
