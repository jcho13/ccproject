package com.sjh.admin.vo;

import java.util.Date;

public class Cpmember {

//  pk
    private Integer cpno;

    //  ���̵�
    private String cpid;

    //  ��й�ȣ
    private String cppwd;

    //  ȸ���
    private String cpname;

    //  ȸ���̸���
    private String cpemail;

    //  ����ڹ�ȣ
    private String cpnum;

    //  �����ȣ
    private Integer companyaddr1;

    //  ���θ��ּ�
    private String companyaddr2;

    //  ���ּ�
    private String companyaddr3;

    //  ��ȭ��ȣ
    private String cpcallnum;

    //  ������,����
    private String usertype;

    //  �����,����,����
    private String departmentnum;

    //  Ż�𿩺�
    private String cpisdelete;

    //  �����
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
