package com.DTO_Validation.DTO_Validation_Demo.Service;

import com.DTO_Validation.DTO_Validation_Demo.Entity.Form;
import com.DTO_Validation.DTO_Validation_Demo.Repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormServiceImpl implements FormService {

    @Autowired
    FormRepository formRepository;

    @Override
    public Form getCustomer(int id) {
        return formRepository.getById(id);
    }

    @Override
    public List<Form> getCustomers() {
        return (List<Form>) formRepository.findAll();
    }

    @Override
    public Form addCustomer(Form form) {
        return formRepository.save(form);
    }
}
