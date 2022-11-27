package com.dcxuexi;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Collections;

/***
 * @Title CodeGenerator
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/26 16:34
 * @Version 1.0.0
 */
public class CodeGenerator {
    // 新的代码生成器
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mybatis",
                "root","root")
                .globalConfig(builder -> {
                    builder.outputDir(System.getProperty("user.dir")+"/springboot_mp_05_generator/src/main/java") //设置代码生成位置  /opt/baomidou/ 默认值: windows:D:// linux or mac : /tmp
                            .author("DongChuang") // 设置作者
                            .fileOverride() // 覆盖已生成文件 默认值:false
                            .commentDate("yyyy-MM-dd"); // 注释日期
                })
                .packageConfig(builder -> {
                    builder.parent("com.dcxuexi") // 设置父包名
                            .controller("controller")//Controller 包名 默认值:controller
                            .entity("entity")//Entity 包名 默认值:entity
                            .service("service")//Service 包名 默认值:service
                            .mapper("mapper") //Mapper 包名 默认值:mapper
                            .pathInfo(Collections.singletonMap(OutputFile.xml,System.getProperty("user.dir")+ "/springboot_mp_05_generator/src/main/resources/mapper")); // 设置mapper.xml存放路径
                            //默认存放在mapper的xml下
                })
                .strategyConfig(builder -> {
                    builder.addInclude("platform_user","platform_region","platform_mobile_belong")  //设置当前参与生成的表名，参数为可变参数
                            .addTablePrefix("platform_") // 设置过滤表前缀
                            .serviceBuilder()//service策略配置
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()// 实体类策略配置
                            .idType(IdType.AUTO)//主键策略  雪花算法自动生成的id
                            // 自动填充配置
                            .enableLombok() //开启lombok
                            .logicDeleteColumnName("deleted")// 说明逻辑删除是哪个字段
                            .versionColumnName("version")// 说明乐观锁是哪个字段
                            .enableTableFieldAnnotation()// 属性加上注解说明
                            .controllerBuilder() //controller 策略配置
                            .formatFileName("%sController")
                            .enableRestStyle() // 开启RestController注解
                            .mapperBuilder()// mapper策略配置
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation()//@mapper注解开启
                            .formatXmlFileName("%sMapper");
                })
                .execute();

    }



    // 旧的代码生成器
    public static void main_old(String[] args) {
//        //1.获取代码生成器的对象
//        AutoGenerator autoGenerator = new AutoGenerator();
//
//        //设置数据库相关配置
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//
//        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
//        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/mybatis");
//        dataSourceConfig.setUsername("root");
//        dataSourceConfig.setPassword("root");
//        autoGenerator.setDataSource(dataSourceConfig);
//
//        //设置全局配置
//        GlobalConfig globalConfig = new GlobalConfig();
//        globalConfig.setOutputDir(System.getProperty("user.dir")+"/springboot_mp_05_generator/src/main/java");    //设置代码生成位置
//        globalConfig.setOpen(false);    //设置生成完毕后是否打开生成代码所在的目录
//        globalConfig.setAuthor("DongChuang");    //设置作者
//        globalConfig.setFileOverride(true);     //设置是否覆盖原始生成的文件
//        globalConfig.setMapperName("%sDao");    //设置数据层接口名，%s为占位符，指代模块名称
//        globalConfig.setIdType(IdType.AUTO);   //设置Id生成策略
//        autoGenerator.setGlobalConfig(globalConfig);
//
//        //设置包名相关配置
//        PackageConfig packageInfo = new PackageConfig();
//        packageInfo.setParent("com.dcxuexi");   //设置生成的包名，与代码所在位置不冲突，二者叠加组成完整路径
//        packageInfo.setEntity("domain");    //设置实体类包名
//        packageInfo.setMapper("dao");   //设置数据层包名
//        autoGenerator.setPackageInfo(packageInfo);
//
//        //策略设置
//        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig.setInclude("platform_user","platform_region","platform_mobile_belong");  //设置当前参与生成的表名，参数为可变参数
//        strategyConfig.setTablePrefix("platform_");  //设置数据库表的前缀名称，模块名 = 数据库表名 - 前缀名  例如： User = platform_user - platform_
//        strategyConfig.setRestControllerStyle(true);    //设置是否启用Rest风格
//        strategyConfig.setVersionFieldName("version");  //设置乐观锁字段名
//        strategyConfig.setLogicDeleteFieldName("deleted");  //设置逻辑删除字段名
//        strategyConfig.setEntityLombokModel(true);  //设置是否启用lombok
//        autoGenerator.setStrategy(strategyConfig);
//        //2.执行生成操作
//        autoGenerator.execute();


    }
}
