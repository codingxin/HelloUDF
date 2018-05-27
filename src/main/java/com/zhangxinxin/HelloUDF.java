package com.zhangxinxin;
import org.apache.hadoop.hive.ql.exec.UDF;
//注意这里的问题
public class HelloUDF extends UDF{
    public String evaluate(String str) {
        try {
            return "HelloWorld " + str;
        } catch (Exception e) {
            return null;
        }
    }
}

