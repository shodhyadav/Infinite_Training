package com.boot.Boot.Services;

import com.boot.Boot.Exception.HnDBankException;
import com.boot.Boot.Model.CustomerLoginDTO;
import org.springframework.stereotype.Service;

public interface CustomerLoginService {
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException;

}