package com.zxk.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: spring_day01
 * @description: 自定义bean导入器
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-03 10:34
 **/
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        try {
            InputStream rs = MyImportSelector.class.getClassLoader().getResourceAsStream("import.properties");
            Properties prop = new Properties();
            prop.load(rs);
            String className = (String) prop.get("className");
            return new String[]{className};
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
