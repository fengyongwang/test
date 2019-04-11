drop table if EXISTS `user`;

CREATE TABLE `user` (
`uid`  int(10) NOT NULL AUTO_INCREMENT ,
`uname`  varchar(255) NOT NULL ,
`upwd`  varchar(255) NOT NULL ,
`state`  int(10) NOT NULL DEFAULT 0 ,
`sex`  varchar(255) NOT NULL ,
`createTime`  datetime NOT NULL ,
`updateTime`  datetime NOT NULL ,
PRIMARY KEY (`uid`)
)
;


insert into user values(null,'jack','123456',1,'男','20190401','20190401');
insert into user values(null,'tom','123456',1,'男','20190401','20190401');
insert into user values(null,'rose','123456',1,'男','20190401','20190401');
COMMIT;
select * from user;