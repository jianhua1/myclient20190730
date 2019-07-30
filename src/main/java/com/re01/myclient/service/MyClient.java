package com.re01.myclient.service;
import com.re01.myclient.server_package.MyServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClient {

    @GetMapping(value = "/gets")
  public void getServer() {
        MyServer myServer = new MyServer();
        String s = myServer.getMyServerImplPort().sendInfo();
        System.out.println(s);
        System.out.println("cccccccc");
    }







}
