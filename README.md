#  什么是SaaS短链

## 项目描述

​	短链接（Short Link）是指将一个原始的长URL通过特定的算法或服务转化成一个更短、易于记忆的URL。短链接通常只包含几个字符，而原始的长URL可能会非常长。

​	短链接的原理非常简单，通过一个原始链接生成一个相对较短的链接，然后通过访问短链接跳转到原始链接。

![image](https://github.com/CarJJJJ/shortlink/blob/master/readmeImages/descrpition.png)

如果更细节一点的话，就是：

1.**生成唯一标识符**。当用户输入一个长URL的时候，短链会生成一个唯一的标识符或者短码。

2.**将标识符与长URL关联**。需要将生成的唯一标识符与长URL关联起来，并将其保存到数据库中。

3.**创建短链**。将生成的唯一标识符加上短链接服务的域名（如http://m.jd）作为前缀，构成一个短链接。

4.**重定向**。当用户访问该短链接时，短链接服务收到请求后会根据唯一标识符查找关联的长URL，然后将用户重定向到这个长URL。

5.**跟踪统计**。短链接服务需要提供访问统计和分析功能，记录访问量、来源、地理位置等信息。



**京东的短信就会出现短链。**

![image](https://github.com/CarJJJJ/shortlink/blob/master/readmeImages/message.png)

主要作用有如下几点：

1.**提升用户体验**：用户更容易记忆和分享短链接，增强用户体验。

2.**节省空间**：短链接相对于长URL更短，可以节省字符空间，特别是在一些限制字符数的场合，比短信。

3.**美化**:短链接更加美观、简洁。

4.**统计和分析**:可以跟踪短链接的访问情况，了解用户的行为和喜好。

## 技术架构

​	采用最新的JDK17+SpringBoot&SpringCloud微服务架构，构建高并发、大数据量下仍然能够高效提供可靠的短链接生成服务。

![image](https://github.com/CarJJJJ/shortlink/blob/master/readmeImages/architect.png)

## 项目亮点

1.**海量并发**：在面临大量用户同时访问的时候，仍然能保持很高的性能和访问速度。

2.**海量存储**：能存储大量的用户数据。

3.**多租户场景**:支持多个租户共享同一套系统，需要保证租户间的数据隔离、安全性和性能。

4.**数据安全性**:需要保证用户数据的隐私和安全，防止未经授权的访问和数据泄漏。

5.**扩展性&可伸缩性**：能够应对用户数量和业务规模的增长。



