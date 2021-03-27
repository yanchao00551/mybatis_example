package org.example;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName:org.example
 * @ClassName:Test01
 * @Description:
 * @author: 悟空
 * @date: 2021/3/27 13:56
 * @email: 10947@163.com
 */
public class Test01 {

    @Test
    public void testMBG() throws Exception {
        List<String> warnings = new ArrayList<String>();
        Boolean overwrite = true;
        File configFile = new File("resources\\generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }


}
