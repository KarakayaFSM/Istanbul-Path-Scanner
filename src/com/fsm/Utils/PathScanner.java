package com.fsm.Utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.function.Predicate;

public class PathScanner {

    public List<Class<?>> getClassesOf(String packageName) {
        List<Class<?>> classes = getClasses(packageName);
    }

    public List<Class<?>> getClassesOf(String packageName, Predicate<Class<?>> filter) {

    }

    private List<Class<?>> getClasses(String packageName) {
        String path = getPathNameFrom(packageName);
        Enumeration<URL> resources = getResourcesIn(path);

    }

    private List<File> getDirectoriesFrom(Enumeration<URL> resources) {

    }

    private List<Class<?>> getClassesFrom(List<File> directories, String packageName) {

    }

    Enumeration<URL> getResourcesIn(String path) {
        return getResourcesIn(path);
    }

    Enumeration<URL> getResources(String pathName) {
        Enumeration<URL> emptyResources = Collections.emptyEnumeration();
        try {
            ClassLoader classLoader = getClassLoader();
            return classLoader.getResources(pathName);
        } catch (IOException | NoSuchElementException e) {
            e.printStackTrace();
        }
        return emptyResources;
    }

    ClassLoader getClassLoader() {
        return Optional
                .of(Thread.currentThread().getContextClassLoader())
                .orElseThrow(() -> new NoSuchElementException("ClassLoader cannot be instantiated"));
    }

    String getPathNameFrom(String packageName) {
        return packageName.replace(".", "/");
    }

}
