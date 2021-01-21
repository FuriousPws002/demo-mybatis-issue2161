# demo-mybatis-issue2161
[issue#2161](https://github.com/mybatis/mybatis-3/issues/2161)

start server and send below request will result `java.lang.NoClassDefFoundError`
```
curl http://localhost/test?id=1
```
The user table schema
```sql
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(128) DEFAULT NULL COMMENT '用户名',
  `name` varchar(128) DEFAULT NULL COMMENT '名称',
  `extra_info` varchar(16) DEFAULT NULL COMMENT '扩展信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

INSERT INTO `user`(`username`, `name`, `extra_info`) VALUES ('user1', 'name1', NULL);
INSERT INTO `user`(`username`, `name`, `extra_info`) VALUES ('user2', 'name2', NULL);
```