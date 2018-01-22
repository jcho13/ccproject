


-- drop table cpmember;

CREATE TABLE cpmember
(
    `cpno`           INTEGER                NOT NULL    AUTO_INCREMENT COMMENT 'pk', 
    `cpid`           VARCHAR(20)            NOT NULL     COMMENT '���̵�', 
    `cppwd`          VARCHAR(100)           NOT NULL     COMMENT '��й�ȣ', 
    `cpname`         VARCHAR(45)            NOT NULL     COMMENT 'ȸ���', 
    `cpemail`		 VARCHAR(200)			NOT NULL	 COMMENT 'ȸ���̸���',
    `cpnum`          VARCHAR(45)            NOT NULL     COMMENT '����ڹ�ȣ', 
    `companyaddr1`   VARCHAR(10)            NOT NULL     COMMENT '�����ȣ', 
    `companyaddr2`   VARCHAR(100)           NOT NULL     COMMENT '���θ��ּ�', 
    `companyaddr3`   VARCHAR(45)            NULL         COMMENT '���ּ�', 
    `cpcallnum`      VARCHAR(20)            NOT NULL     COMMENT '��ȭ��ȣ', 
    `usertype`       CHAR(1) default 'U'    NOT NULL     COMMENT '������,����', 
    `departmentnum`  CHAR(1) default '2'    NOT NULL     COMMENT '�����,����,����', 
    `cpisdelete`     CHAR(1) default 'N'    NOT NULL     COMMENT 'Ż�𿩺�', 
    `cprdate`       timestamp not null default now()     NOT NULL     COMMENT '�����', 
    PRIMARY KEY (cpno)
);


--drop table tbl_notice;

CREATE TABLE tbl_notice
(
    `nno`        INT                    NOT NULL    AUTO_INCREMENT COMMENT 'pk', 
    `ntitle`     VARCHAR(200)           NULL         COMMENT '����', 
    `ncontent`   TEXT                   NULL         COMMENT '����', 
    `nwriter`    VARCHAR(50)            NULL         COMMENT '�ۼ���', 
    `nrdate`     DATE default now()     NULL         COMMENT '�ۼ���', 
    `nviewcnt`   INT default '0'        NULL         COMMENT '��ȸ��', 
    `nisdelete`  CHAR(1) default 'N'    NULL         COMMENT '��������', 
    PRIMARY KEY (nno)
);

