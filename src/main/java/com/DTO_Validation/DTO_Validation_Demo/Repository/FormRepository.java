package com.DTO_Validation.DTO_Validation_Demo.Repository;

import com.DTO_Validation.DTO_Validation_Demo.Entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Form, Integer> {
}
