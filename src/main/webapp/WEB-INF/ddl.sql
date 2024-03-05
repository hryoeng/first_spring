create table mem(
                    num int not null auto_increment primary key,
                    pwd varchar(20),
                    name varchar(30),
                    addr varchar(100)
);

CREATE TABLE blog(
                     num int not null auto_increment primary key,
                     title varchar(50),
                     content varchar(200),
                     id varchar(20),
                     regdate datetime default now()
);