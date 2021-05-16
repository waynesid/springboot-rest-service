package com.payroll.payroll;

class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id){
        super("could not find employee " + id);
    }
}
