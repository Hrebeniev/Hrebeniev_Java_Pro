package com.hillel.hrebeniev.homeworks.homework_19;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void start(Class<?> testClass) throws Exception {
        Method beforeSuiteMethod = null;
        Method afterSuiteMethod = null;
        List<Method> testMethods = new ArrayList<>();
        Object testInstance = testClass.getDeclaredConstructor().newInstance();

        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                if (beforeSuiteMethod == null) {
                    beforeSuiteMethod = method;
                } else {
                    throw new RuntimeException("BeforeSuite method is already exists!");
                }
            } else if (method.isAnnotationPresent(AfterSuite.class)) {
                if (afterSuiteMethod == null) {
                    afterSuiteMethod = method;
                } else {
                    throw new RuntimeException("AfterSuite method is already exists!");
                }
            } else if (method.isAnnotationPresent(Test.class)) {
                testMethods.add(method);
            }
        }

        testMethods.sort((m1, m2) -> Integer.compare(m2.getAnnotation(Test.class).priority(),
                m1.getAnnotation(Test.class).priority()));

        if (beforeSuiteMethod != null) {
            beforeSuiteMethod.invoke(testInstance);
        }

        for (Method method : testMethods) {
            method.invoke(testInstance);
        }

        if (afterSuiteMethod != null) {
            afterSuiteMethod.invoke(testInstance);
        }
    }
}
