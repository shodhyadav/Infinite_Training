package com.boot.Boot.Model;




public class CustomerLoginDTO {
    public CustomerLoginDTO() {
    }

    public CustomerLoginDTO(int id, String loginName, String password) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
    }

    private int id;
    private String loginName;
    private String password;

    public String getLoginName() {
        return loginName;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomerLoginDTO [loginName=" + loginName + ", password=" + password + "]";
    }
}
