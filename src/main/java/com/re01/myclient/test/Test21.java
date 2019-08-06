package com.re01.myclient.test;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Test21 {

    public void c(){
        File f=new File("E:/122.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] buf=new byte[1024];
        int read;
        try {
            read = fileInputStream.read(buf);
            System.out.println(new String(buf,"gb2312"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void a(){
        //java.nio.file.Fi
        File f=new File("E:/122.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] buf=new byte[1024];
        StringBuilder builder=new StringBuilder();
        try {
            for(int i=0;i<fileInputStream.read();i++){
                fileInputStream.read(buf);
                builder.append(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str= null;
        try {
            str = new String(builder.toString().getBytes(),"gb2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println(str);
    }

    public void b(){
        File f=new File("E:/122.txt");
        FileInputStream fileInputStream = null;
        StringBuilder stringBuilder=new StringBuilder();
        try {
            fileInputStream = new FileInputStream(f);
            byte[] buf=new byte[1024];
            int read = fileInputStream.read(buf);
            while(read!=-1){
                stringBuilder.append(new String(buf,0,read,"gb2312"));
                read=fileInputStream.read(buf);
            }
            System.out.println(stringBuilder.toString());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void d(){
        String str = null;
        try {
            str = new String(Files.readAllBytes(Paths.get("E:/122.txt")), "gb2312");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(str);
    }

    public void e(){
        try {
            Path file = Files.createFile(Paths.get("e://125.txt"));
            //Path directories = Files.createDirectories(Paths.get("e://123.txt"));
            BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(Paths.get("E://123.txt"), BasicFileAttributeView.class);
            BasicFileAttributes basicFileAttributes = fileAttributeView.readAttributes();

            LocalDateTime localDateTime = LocalDateTime.ofInstant(basicFileAttributes.creationTime().toInstant(), ZoneId.systemDefault());
            String createTimeFormat = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println("creationTime: "+createTimeFormat);

            LocalDateTime localDateTime1 = LocalDateTime.ofInstant(basicFileAttributes.lastAccessTime().toInstant(), ZoneId.systemDefault());
            String createTimeFormat2 = localDateTime1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println("lastAccessTime: "+createTimeFormat2);

            LocalDateTime localDateTime2 = LocalDateTime.ofInstant(basicFileAttributes.lastModifiedTime().toInstant(), ZoneId.systemDefault());
            String createTimeFormat3 = localDateTime2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println("lastModifiedTime: "+createTimeFormat3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void f(){
        String str="111一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争22222";
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("e://125.txt");
            fileOutputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void g(){
        String str="3333一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近一言不合就“退群”，肆意挑起对多国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争国的贸易争端，严重破坏世界贸易组织规则……美国一些人屡屡上演无视国际规则的闹剧，透射出背信弃义、挑战底线的霸道实质。最近道实质。最近，美国一些人变本加厉，就世贸组织发展中成员地位问题发布备忘录，要求世贸组织90天内改变规则，不然美方可能单方面采取行动。这种无视秩序、破坏规则的举动，引起国际社会普遍担心：美国一些人莫非真要挑起一场“全球贸易战争33333";
        try {
            Files.write(Paths.get("e://125.txt"),str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void g2(){
      /*  File f=new File("e://127.txt");
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        boolean exists = java.nio.file.Files.exists(Paths.get("e://128.txt")
                ,new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        System.out.println("exists:"+exists);
        if(exists==false){
            try {
                Path file = Files.createFile(Paths.get("e://126.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void g3(){
        boolean exists = java.nio.file.Files.exists(Paths.get("e://232/22")
                ,new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        System.out.println("exists:"+exists);
        if(exists==false){
            try {
                Path file = Files.createDirectories(Paths.get("e://232/22"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Test21 test21 = new Test21();
        //test21.d();
        test21.g3();
    }
}

