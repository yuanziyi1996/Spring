package com.jlu.yzy;

public class Post {
    /**
     * 给Post类增加一个类型为int的成员变量，命名为id
     * 修改print()函数，在打印标题title和内容content之前，首先打印id
     * 在HelloWorld类的main函数中，将设置post对象的id为100
     */

    // your code here：定义id
    long id;
    String title;
    String content;
    // 第一个构造函数，
    public Post(){}

    // 第二个构造函数，传入标题和内容
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Post(long id,String title,String content){
        this.id=id;
        this.title=title;
        this.content=content;

    }

    void print() {
        System.out.print(id);
        System.out.println(title);
        System.out.println(content);

        StringBuilder sb =new StringBuilder();
        sb.append("<html>").append("<head>")
                .append("<title>"+this.title+"</title>");
        System.out.print(sb);

    }
}


