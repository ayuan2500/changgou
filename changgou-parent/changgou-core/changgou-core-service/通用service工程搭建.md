一、通用service工程搭建
1.【changgou-common-db】
 1）pom.xml添加依赖
  1.1）通用mapper起步依赖（mapper-spring-boot-starter）
  1.2）mybatis分页插件（pagehelper-spring-boot-starter）
  
2.创建【changgou-core】工程，依赖parent工程
 1）指定打包方式为pom
 2）删除src
 2.创建【changgou-core-service】工程
  2.0）pom.xml
   2.0.1）添加common-db依赖
  2.1）创建com.changgou.core.service包
  2.2）导入通用的CRUDPService接口
   2.1.1）InsertService 新增的接口
   2.1.2）UpdateService 修改的接口
   2.1.3）DeleteService 删除的接口
   2.1.4）SelectService 查询的接口
   2.1.5）PagingService 分页的接口
  2.3）创建CoreService接口继承CRUDPService接口
  2.4）创建CoreServiceImpl抽象类实现CoreService接口