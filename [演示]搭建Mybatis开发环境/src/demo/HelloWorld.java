package demo;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName:PACKAGE_NAME
 * @ClassName:HelloWorld
 * @Description:
 * @author: 悟空
 * @date: 2021/3/24 15:45
 * @email: 10947@163.com
 */
@Slf4j
public class HelloWorld {

    public static final void main(String[] args){
        StringBuffer testString = new StringBuffer("");
        testString.append("hello world");
        log.info("我现在想打的log:{}",testString.toString());
    }

}
