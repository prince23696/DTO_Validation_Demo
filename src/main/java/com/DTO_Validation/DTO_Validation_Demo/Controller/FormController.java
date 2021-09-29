package com.DTO_Validation.DTO_Validation_Demo.Controller;

import com.DTO_Validation.DTO_Validation_Demo.Entity.Form;
import com.DTO_Validation.DTO_Validation_Demo.Service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FormController {

    @Autowired
    FormService formService;

    @PostMapping("/saveForm")
    public Form addCustomer(@Valid @RequestBody Form form) {
        return formService.addCustomer(form);
    }

    @GetMapping("/getAll")
    public List<Form> getCustomer() {
        List<Form> forms = formService.getCustomers();
        return forms;
    }

    @GetMapping("/get")
    public Form getCustomer(@PathVariable int id) {
        Form form = formService.getCustomer(id);
        return form;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}


