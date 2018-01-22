


-- drop table cpmember;

CREATE TABLE cpmember
(
    `cpno`           INTEGER                NOT NULL    AUTO_INCREMENT COMMENT 'pk', 
    `cpid`           VARCHAR(20)            NOT NULL     COMMENT '아이디', 
    `cppwd`          VARCHAR(100)           NOT NULL     COMMENT '비밀번호', 
    `cpname`         VARCHAR(45)            NOT NULL     COMMENT '회사명', 
    `cpemail`		 VARCHAR(200)			NOT NULL	 COMMENT '회사이메일',
    `cpnum`          VARCHAR(45)            NOT NULL     COMMENT '사업자번호', 
    `companyaddr1`   VARCHAR(10)            NOT NULL     COMMENT '우편번호', 
    `companyaddr2`   VARCHAR(100)           NOT NULL     COMMENT '도로명주소', 
    `companyaddr3`   VARCHAR(45)            NULL         COMMENT '상세주소', 
    `cpcallnum`      VARCHAR(20)            NOT NULL     COMMENT '전화번호', 
    `usertype`       CHAR(1) default 'U'    NOT NULL     COMMENT '관리자,유저', 
    `departmentnum`  CHAR(1) default '2'    NOT NULL     COMMENT '시험소,유통,대형', 
    `cpisdelete`     CHAR(1) default 'N'    NOT NULL     COMMENT '탈퇴여부', 
    `cprdate`       timestamp not null default now()     NOT NULL     COMMENT '등록일', 
    PRIMARY KEY (cpno)
);


--drop table tbl_notice;

CREATE TABLE tbl_notice
(
    `nno`        INT                    NOT NULL    AUTO_INCREMENT COMMENT 'pk', 
    `ntitle`     VARCHAR(200)           NULL         COMMENT '제목', 
    `ncontent`   TEXT                   NULL         COMMENT '내용', 
    `nwriter`    VARCHAR(50)            NULL         COMMENT '작성자', 
    `nrdate`     DATE default now()     NULL         COMMENT '작성일', 
    `nviewcnt`   INT default '0'        NULL         COMMENT '조회수', 
    `nisdelete`  CHAR(1) default 'N'    NULL         COMMENT '삭제여부', 
    PRIMARY KEY (nno)
);

