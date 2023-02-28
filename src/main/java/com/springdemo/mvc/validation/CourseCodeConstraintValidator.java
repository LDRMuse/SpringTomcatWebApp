package com.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
    }

    public boolean isValid(String theCode,
                           ConstraintValidatorContext theConstraintValidatorContext) {

        if(theCode != null) {
            return theCode.startsWith(coursePrefix);

        }
        return true;
    }



}
