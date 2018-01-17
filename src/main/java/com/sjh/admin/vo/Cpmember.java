package com.sjh.admin.vo;

import java.util.Date;

public class Cpmember {

//  pk
    private Integer cpno;

    //  아이디
    private String cpid;

    //  비밀번호
    private String cppwd;

    //  회사명
    private String cpname;

    //  회사이메일
    private String cpemail;

    //  사업자번호
    private String cpnum;

    //  우편번호
    private Integer companyaddr1;

    //  도로명주소
    private String companyaddr2;

    //  상세주소
    private String companyaddr3;

    //  전화번호
    private String cpcallnum;

    //  관리자,유저
    private String usertype;

    //  시험소,유통,대형
    private String departmentnum;

    //  탈퇴여부
    private String cpisdelete;

    //  등록일
    private Date cprdate;

    public Integer getCpno() {
        return cpno;
    }

    public void setCpno(Integer cpno) {
        this.cpno = cpno;
    }

    public String getCpid() {
        return cpid;
    }

    public void setCpid(String cpid) {
        this.cpid = cpid;
    }

    public String getCppwd() {
        return cppwd;
    }

    public void setCppwd(String cppwd) {
        this.cppwd = cppwd;
    }

    public String getCpname() {
        return cpname;
    }

    public void setCpname(String cpname) {
        this.cpname = cpname;
    }

    public String getCpemail() {
        return cpemail;
    }

    public void setCpemail(String cpemail) {
        this.cpemail = cpemail;
    }

    public String getCpnum() {
        return cpnum;
    }

    public void setCpnum(String cpnum) {
        this.cpnum = cpnum;
    }

    public Integer getCompanyaddr1() {
        return companyaddr1;
    }

    public void setCompanyaddr1(Integer companyaddr1) {
        this.companyaddr1 = companyaddr1;
    }

    public String getCompanyaddr2() {
        return companyaddr2;
    }

    public void setCompanyaddr2(String companyaddr2) {
        this.companyaddr2 = companyaddr2;
    }

    public String getCompanyaddr3() {
        return companyaddr3;
    }

    public void setCompanyaddr3(String companyaddr3) {
        this.companyaddr3 = companyaddr3;
    }

    public String getCpcallnum() {
        return cpcallnum;
    }

    public void setCpcallnum(String cpcallnum) {
        this.cpcallnum = cpcallnum;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getDepartmentnum() {
        return departmentnum;
    }

    public void setDepartmentnum(String departmentnum) {
        this.departmentnum = departmentnum;
    }

    public String getCpisdelete() {
        return cpisdelete;
    }

    public void setCpisdelete(String cpisdelete) {
        this.cpisdelete = cpisdelete;
    }

	public Date getCprdate() {
		return cprdate;
	}

	public void setCprdate(Date cprdate) {
		this.cprdate = cprdate;
	}

  

}
