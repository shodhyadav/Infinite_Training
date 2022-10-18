package com.boot.Boot.Repository;

import com.boot.Boot.Model.CustomerLoginDTO;

public interface CustomerLoginRepo {
    public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);
}
