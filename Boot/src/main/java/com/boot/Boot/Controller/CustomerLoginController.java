package com.boot.Boot.Controller;


import com.boot.Boot.Exception.HnDBankException;
import com.boot.Boot.Model.CustomerLoginDTO;
import com.boot.Boot.Services.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value="customerLoginController")
public class CustomerLoginController {
    @Autowired
    private CustomerLoginService customerLoginService;
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException {
        String b = customerLoginService.authenticateCustomer(customerLogin);
        return b;
    }
}