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


## 目录总览：

## 目录介绍

记录一些项目中的经验：
1、如何分离项目中的一些组件，使其更容易维护和管理比如分离出panel、listener，并且如何将其在分离的状态下依然能够协作
2、什么是util，如何规划好util
	2.1针对不同的情况，我们应该设置一下多个util包以能够在针对不同状况下用，比如GUIutil是gui的工具类，colorutil是针对颜色抽象的util
	2.2如何使用util，既然将一些方法封装起来以后怎么使用他们
3、DAO是什么，如何理解DAO的设计，entity与dao之间有什么关系，以及这种思想让我们以后如何在程序中理解
	3.1 比如说我们把每条记录可以看成是一个对象。
