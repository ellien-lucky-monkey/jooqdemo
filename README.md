# JOOQ使用笔记

## 概念
* Java Object Oriented Querying，即面向Java对象查询 主要解决的两个问题
* 1， Hibernate对sql的掌控力度不够
* 2， jdbc 过于支持原生
## 版本
* Open Source 
* Express
* Professional
* Enterprise

Open Source版本针对开源数据库 基本上来说够用各个版本的支持详见[官网](https://www.jooq.org/legal/licensing#databases)
> JOOQ作为ORM框架，其原理是：在DAO层使用Java语言编写SQL语句，在Intellij IDEA的辅助下，复杂SQL的维护变得很容易。通过内部SQL Builder转换成数据库可执行的SQL文本，使用数据库驱动，提交SQL到RDBMS执行，接受处理结果，转换为POJO，返回到应用层。
它与Hibernate不同，不依赖使用字符串变量在Java代码中拼接SQL语句。在复杂SQL语句中，与变量的组合拼接时，SQL被割裂成多个部分，失去了宝贵的可读性，这简直是噩梦。而且Hibernate饱受诟病的连接查询配置复杂以及HQL语法的问题，在JOOQ中不复存在。
它与Mybatis不同，不依赖繁琐分散的XML进行SQL预定义。代码与SQL语句的分离，初衷是为了解决SQL嵌入代码时带来不直观的复杂性，但是分离的代价是维护工作倍增以及类型转换问题，经常遭遇到应用层代码变更，而XML定义未同步变更，IDE几乎无法解决。又或者开发人员改动一个XML文件，却意外影响多处上层代码，而这个问题很难避免。
更进一步的，JOOQ提供原生的类型安全转换，以及POJO维护，免去大量一次性代码的编写。当然，你也可以使用Eclipse代码生成插件解决这个问题，但是如果ORM能自动解决(结合Maven Plugin)，为什么拒绝呢？
使用这种DAO模式，可以通过类的方式来进行数据库访问了。而且对SQL控制粒度加大的同时，维护工作并没有因此倍增，这对于开发人员是更好的解决方案，也是未来的趋势。
_ 不管你信没信我是没信！

## 自定义类型转换
> 详见com.jooq.demo.converter.TimestampConverter实现类 以及pom文件中 
不吹逼了这叫传说中的规约 不看官网的话确实不知道 
# JOOQ使用笔记

## 概念
* Java Object Oriented Querying，即面向Java对象查询 主要解决的两个问题
* 1， Hibernate对sql的掌控力度不够
* 2， jdbc 过于支持原生
## 版本
* Open Source 
* Express
* Professional
* Enterprise

Open Source版本针对开源数据库 基本上来说够用各个版本的支持详见[官网](https://www.jooq.org/legal/licensing#databases)
> JOOQ作为ORM框架，其原理是：在DAO层使用Java语言编写SQL语句，在Intellij IDEA的辅助下，复杂SQL的维护变得很容易。通过内部SQL Builder转换成数据库可执行的SQL文本，使用数据库驱动，提交SQL到RDBMS执行，接受处理结果，转换为POJO，返回到应用层。
它与Hibernate不同，不依赖使用字符串变量在Java代码中拼接SQL语句。在复杂SQL语句中，与变量的组合拼接时，SQL被割裂成多个部分，失去了宝贵的可读性，这简直是噩梦。而且Hibernate饱受诟病的连接查询配置复杂以及HQL语法的问题，在JOOQ中不复存在。
它与Mybatis不同，不依赖繁琐分散的XML进行SQL预定义。代码与SQL语句的分离，初衷是为了解决SQL嵌入代码时带来不直观的复杂性，但是分离的代价是维护工作倍增以及类型转换问题，经常遭遇到应用层代码变更，而XML定义未同步变更，IDE几乎无法解决。又或者开发人员改动一个XML文件，却意外影响多处上层代码，而这个问题很难避免。
更进一步的，JOOQ提供原生的类型安全转换，以及POJO维护，免去大量一次性代码的编写。当然，你也可以使用Eclipse代码生成插件解决这个问题，但是如果ORM能自动解决(结合Maven Plugin)，为什么拒绝呢？
使用这种DAO模式，可以通过类的方式来进行数据库访问了。而且对SQL控制粒度加大的同时，维护工作并没有因此倍增，这对于开发人员是更好的解决方案，也是未来的趋势。
_ 不管你信没信我是没信！

## 自定义类型转换
>详见com.jooq.demo.converter.TimestampConverter实现类 以及pom文件中 
不吹逼了这叫传说中的规约 不看官网的话确实不知道 
![](file:////Users/ellien/Desktop/屏幕快照 2017-11-30 14.56.10.png)
<strong>[官网](https://www.jooq.org/doc/latest/manual/code-generation/custom-data-type-bindings/)</strong>

## flyway
SQL 脚本文件及Java 代码类名必须遵循以下命名规则：V<version>[_<SEQ>][__description] 。版本号的数字间以小数点（. ）或下划线（_ ）分隔开，版本号与描述间以连续的两个下划线（__ ）分隔开。如V1_1_0__Update.sql 。Java 类名规约不允许存在小数点，所以Java 类名中版本号的数字间只能以下划线进行分隔。


### 从实战开始
<strong>[官网](https://www.jooq.org/doc/latest/manual/code-generation/custom-data-type-bindings/)</strong>

## flyway
SQL 脚本文件及Java 代码类名必须遵循以下命名规则：V<version>[_<SEQ>][__description] 。版本号的数字间以小数点（. ）或下划线（_ ）分隔开，版本号与描述间以连续的两个下划线（__ ）分隔开。如V1_1_0__Update.sql 。Java 类名规约不允许存在小数点，所以Java 类名中版本号的数字间只能以下划线进行分隔。


### 从实战开始