package com.boot.Boot.ServicesImpl;


import com.boot.Boot.Exception.HnDBankException;
import com.boot.Boot.Model.CustomerLoginDTO;
import com.boot.Boot.Repository.CustomerLoginRepo;
import com.boot.Boot.Services.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService {
    @Autowired
    private CustomerLoginRepo customerLoginRepository;
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException {
        String toRet = null;
        CustomerLoginDTO customerLoginDTO = customerLoginRepository
                .getCustomerLoginByLoginName(customerLogin.getLoginName());
        if (customerLogin.getPassword().equals(customerLoginDTO.getPassword())){
            toRet = "SUCCESS";
        }else{
            throw new HnDBankException("Service.WRONG_CREDENTIALS");
        }
        return toRet;
    }
}