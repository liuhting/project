/*
@Author:LiuHuiting
@Date: 18:10 2019/7/5
@Description: StringBuffer是线程安全的
*/
package javaBase;

public class stringBufferLesson {

    public static  void stringBufferMethod1( ){
        StringBuffer sb= new StringBuffer("use stringbuffer");
        sb.append("yoyoyo ");
        sb.append("jiayou ");
        System.out.println(sb);

    }
    public static  void main(String[] args){
        stringBufferMethod1();
    }
}
