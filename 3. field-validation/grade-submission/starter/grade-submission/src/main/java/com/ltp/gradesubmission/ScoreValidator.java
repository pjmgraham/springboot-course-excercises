package com.ltp.gradesubmission;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ScoreValidator implements ConstraintValidator<Score, String> {

  List<String> scores = Arrays.asList(
    "A+", "B+", "C+", "D+", "A", "B", "C", "D","F", "A-", "B-", "C-", "D-"
  );
  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    for (String string : scores) {
      if (value.equals(string)) return true;
    }
  return false;
}
}
