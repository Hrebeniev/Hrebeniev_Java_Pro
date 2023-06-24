package com.hillel.hrebeniev.homeworks.homework_25;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Lesson {
    long id;
    String name;
    Homework homework;
}