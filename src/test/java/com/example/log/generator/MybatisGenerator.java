package com.example.log.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import sun.nio.cs.Surrogate;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MybatisGenerator {

    public static void main(String[] args) throws Exception{
        //MyBatisGenerator执行过程中的警告信息
        List<String> warnings = new ArrayList<String>();
        //当生成的代码重复时，覆盖源代码
        Boolean overwrite = true;
        InputStream is = Surrogate.Generator.class.getResourceAsStream("/generator/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);

        //创建MybatisGenerator
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        //执行生成代码
        myBatisGenerator.generate(null);
        for (String warning : warnings){
            System.out.println(warning);
        }
    }
}
