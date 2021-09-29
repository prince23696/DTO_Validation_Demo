package com.DTO_Validation.DTO_Validation_Demo.Service;

import com.DTO_Validation.DTO_Validation_Demo.Entity.Form;

import java.util.List;

public interface FormService {

    public Form getCustomer(int id);

    public List<Form> getCustomers();

    public Form addCustomer(Form form);
}
