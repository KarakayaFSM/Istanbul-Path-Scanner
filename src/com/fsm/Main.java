package com.fsm;

import com.fsm.Annotation.Controller;
import com.fsm.Utils.PathScanner;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Class<?>> allClasses = PathScanner.getInstance()
                .getClassesOf("com.fsm");
        //allClasses.forEach(cls -> System.out.println(cls.getSimpleName()));

        List<Class<?>> controllerClasses = PathScanner
                .getInstance()
                .getClassesOf("com.fsm", cls ->
                        cls.isAnnotationPresent(Controller.class));
        controllerClasses.forEach(cls -> System.out.println(cls.getSimpleName()));

    }

}
