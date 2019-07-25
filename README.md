# AccountBook

## 项目背景：
swing图形界面：由于用这个写的图形界面非常丑，现在主流的图形界面已经基本不同该框架，因此这个不是我们学习的重点（界面就写的非常丑），介绍的知识点就够在项目中使用

## 项目需求：
1、根据数据库中的记录提供用户的消费信息
2、用户输入数据写入数据库，以记录自己的消费
3、设置消费类型以区分消费的品类，并根据消费类型统计消费数据
4、以月为单位统计消费信息
5、将数据库中的信息导出
6、将数据库中信息导入软件

## 列举知识点：
涉及到如下内容： 
1 基础内容： 
面向对象 字符串数字 日期 

2 中级内容： 
异常 ，集合，JDBC, I/O，Swing， 利用TableModel更新数据,

3 高级内容： 
图表chart动态生成，数据库的备份与恢复，自定义圆形进度条 

4 软件设计思想： 
单例模式，面板类与监听器类松耦合，Entity层设计，DAO层设计，Service层设计 

5 业务常见处理手法： 
CRUD操作，配置信息，配置信息初始化，报表生成，一对多关系，多对一关系 

## 数据库设计
针对项目需求，我们要建立几张不同的表去记录我们需要的数据
1. 首先我定义了一张Account表，用于记录用户的消费记录，消费记录中就包括用户的消费金额、消费的分类、消费的备注、消费日期
![image](https://github.com/DHcurry/AccountBook/blob/master/img/db_account.png)
2. 接着，为了能够规范用户的消费分类，我们就必须建立一张记录用户消费种类的表，以至于用户在写消费分类的时候就可以直接从这张表里选择，而不是随意定义
![image](https://github.com/DHcurry/AccountBook/blob/master/img/db_category.png)
3. 紧接着为了完成用户的导入导出操作，我们要让用户设置导入导出地址，这里就需要一张配置表。
![image](https://github.com/DHcurry/AccountBook/blob/master/img/db_config.png)
![image](https://github.com/DHcurry/AccountBook/blob/master/img/%E6%95%B0%E6%8D%AE%E5%BA%93%E5%9B%BE.png)

## 目录总览：

## 目录介绍

## 项目进度
### Done
1. 完成了菜单栏（可以通过菜单栏）
2. 完成了花费预览、记账、分类界面（界面原型，并未写完与数据库的连接）
3. 完成分类界面的增删
### TODO
1. 完成记帐界面
2、完成花费预览界面

## 记录一些项目中的经验（项目细节）：
1. 如何分离项目中的一些组件，使其更容易维护和管理比如分离出panel、listener，并且如何将其在分离的状态下依然能够协作
2. 什么是util，如何规划好util。

针对不同的情况，我们应该设置一下多个util包以能够在针对不同状况下用，比如GUIutil是gui的工具类，colorutil是针对颜色抽象的util

如何使用util，既然将一些方法封装起来以后怎么使用他们

3. DAO是什么，如何理解DAO的设计，entity与dao之间有什么关系，以及这种思想让我们以后如何在程序中理解

比如说我们把每条记录可以看成是一个对象。
4. Service是什么
5. 整个项目的流程是什么样子的
![image](https://github.com/DHcurry/AccountBook/blob/master/img/%E7%BB%93%E6%9E%84%E5%9B%BE.png)
