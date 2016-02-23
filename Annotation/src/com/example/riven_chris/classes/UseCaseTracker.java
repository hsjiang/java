package com.example.riven_chris.classes;

import com.example.riven_chris.annotations.UseCase;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by riven_chris on 15/8/12.
 */
public class UseCaseTracker {

    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {

        for (Method m : cl.getDeclaredMethods()) {
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Found UserCase: " + uc.id() + ", " + uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }

        for (Integer i : useCases) {
            System.out.println("Warning:Missing UserCase-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        trackUseCases(useCases, PasswordUtils.class);
    }
}
