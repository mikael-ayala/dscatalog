package com.devsuperior.dscatalog.controllers.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private List<FieldMessage> fieldErrors = new ArrayList<>();

    public List<FieldMessage> getFieldErrors() {
        return fieldErrors;
    }

    public void addError(String fieldName, String message) {
        fieldErrors.add(new FieldMessage(fieldName, message));
    }
}
