
drop table tbl_board;

CREATE TABLE cpmember
(
    `cpno`           INTEGER                NOT NULL    AUTO_INCREMENT COMMENT 'pk', 
    `cpid`           VARCHAR(20)            NOT NULL     COMMENT '���̵�', 
    `cppwd`          VARCHAR(100)           NOT NULL     COMMENT '��й�ȣ', 
    `cpname`         VARCHAR(45)            NOT NULL     COMMENT 'ȸ���', 
    `cpemail`		 VARCHAR(200)			NOT NULL	 COMMENT 'ȸ���̸���',
    `cpnum`          VARCHAR(45)            NOT NULL     COMMENT '����ڹ�ȣ', 
    `companyaddr1`   INTEGER(10)            NOT NULL     COMMENT '�����ȣ', 
    `companyaddr2`   VARCHAR(100)           NOT NULL     COMMENT '���θ��ּ�', 
    `companyaddr3`   VARCHAR(45)            NULL         COMMENT '���ּ�', 
    `cpcallnum`      VARCHAR(20)            NOT NULL     COMMENT '��ȭ��ȣ', 
    `usertype`       CHAR(1) default 'U'    NOT NULL     COMMENT '������,����', 
    `departmentnum`  CHAR(1) default '2'    NOT NULL     COMMENT '�����,����,����', 
    `cpisdelete`     CHAR(1) default 'N'    NOT NULL     COMMENT 'Ż�𿩺�', 
    `cprdate`       timestamp not null default now()     NOT NULL     COMMENT '�����', 
    PRIMARY KEY (cpno)
);

insert into cpmember (cpid, cppwd, cpname, cpemail, cpnum, companyaddr1, companyaddr2, companyaddr3, cpcallnum)
values ('hyundai', 'P@ssw0rd', '����', 'hyundai@hyundai.co.kr', '000-00-00000', '00000', '����� ������', '�Ｖ��', '02-000-0000');


insert into cpmember (cpid, cppwd, cpname, cpemail, cpnum, companyaddr1, companyaddr2, companyaddr3, cpcallnum)
values ('lg', 'P@ssw0rd', 'lg', 'lg@lg.co.kr', '000-00-00000', '00000', '����� ��������', '���ǵ���', '02-000-0000');


insert into cpmember (cpid, cppwd, cpname, cpemail, cpnum, companyaddr1, companyaddr2, companyaddr3, cpcallnum)
values ('lg', 'P@ssw0rd', 'lg', 'lg@lg.co.kr', '000-00-00000', '00000', '����� ��������', '���ǵ���', '02-000-0000');
