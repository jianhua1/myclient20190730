package com.re01.myclient.test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test23 {

    public void a(){
        String str="一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会";
       String desc="e:/12999.txt";
        try {
           Files.write(Paths.get(desc),str.getBytes(),StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void b(){
        String source="e:/122.txt";
        String desc="e:/12995.txt";
        try {
            //Files.copy(Paths.get(source),Paths.get(desc));
            Files.copy(Paths.get(source),Paths.get(desc),StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void b1(){
        String source="e:/122.txt";
        String desc="e:/129989.txt";
        try {
            FileInputStream fileInputStream=new FileInputStream(source);
            FileOutputStream fileOutputStream = new FileOutputStream(desc,true);
            FileChannel channel = fileInputStream.getChannel();
            FileChannel channel1 = fileOutputStream.getChannel();
            channel.transferTo(0,channel.size(),channel1);
        } catch (IOException  e) {
            e.printStackTrace();
        }

    }

    public void c(){
        String source="e:/122.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            byte[] bytes = new byte[1024];
            int read = fileInputStream.read(bytes);
            StringBuilder stringBuilde=new StringBuilder();
            while (read!=-1){
                stringBuilde.append(new String(bytes,0,read,"gb2312"));
                read = fileInputStream.read(bytes);
            }
            System.out.println(stringBuilde.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void d(){
        String source="e:/122.txt";
        try {
            BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(Paths.get(source), BasicFileAttributeView.class);
            BasicFileAttributes basicFileAttributes = fileAttributeView.readAttributes();
            FileTime fileTime1 = basicFileAttributes.lastAccessTime();
            FileTime fileTime2 = basicFileAttributes.creationTime();
            FileTime fileTime3 = basicFileAttributes.lastModifiedTime();

            LocalDateTime localDateTime1 = LocalDateTime.ofInstant(fileTime1.toInstant(), ZoneId.systemDefault());
            String format1 = localDateTime1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            LocalDateTime localDateTime2 = LocalDateTime.ofInstant(fileTime2.toInstant(), ZoneId.systemDefault());
            String format2 = localDateTime2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            LocalDateTime localDateTime3 = LocalDateTime.ofInstant(fileTime3.toInstant(), ZoneId.systemDefault());
            String format3 = localDateTime3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            System.out.println("lastAccessTime:"+format1+" creationTime:"+format2+" lastModifiedTime:"+format3);

            Date date=new Date();
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
            String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println(format);

            String str="2019-08-03 12:32:22";
            LocalDateTime parse = LocalDateTime.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            Date date1 = Date.from(parse.atZone(ZoneId.systemDefault()).toInstant());
            System.out.println(date1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Test23 t=new Test23();
        t.b1();
    }
}
