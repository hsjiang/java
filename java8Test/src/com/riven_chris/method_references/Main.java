package com.riven_chris.method_references;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(User.create(User::new));
        }

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User a, User b) {
                return a.getAge() > b.getAge() ? 1 : 0;
            }
        });

        users.sort((a, b) -> a.getAge() > b.getAge() ? 1 : 0);

        users.sort((a, b) -> User.compareStaticAge(a, b));

        //1,Reference to a Static Method
        //Its formal parameter list is copied from Comparator<User>.compare, which is (User, User)
        users.sort(User::compareStaticAge);
        users.sort(Main::compareAge);
        cloneConsumerUser(Main::cloneUser);

        //2,Reference to an Instance Method of a Particular Object
        //The method reference main::compareAge2 invokes the method compareAge2 that is part of the
        // object main.The JRE infers the method type arguments, which in this case are (User, User)
        Main main = new Main();
        users.sort(main::compareNonStaticAge2);
        User user = new User();
        users.sort(user::compareNoStaticAge3);

        //3,Reference to an Instance Method of an Arbitrary Object of a Particular Type
        //The method reference would invoke the method a.compareAge2(b)
        users.sort(User::compareNoStaticAge2);


        createUser(() -> new User());
        //4,Reference to a Constructor
        //You can reference a constructor in the same way as a static method by using the name new;
        createUser(User::new);

        users.sort(Comparator.comparing(User::getAge));

        User searchJobUser = new User();
        searchJobUser.searchJob(Job::new);

        selectJob(User::selectJob);

        startAction(() -> System.out.println("ha"));
        startAction(Main::getAction);
    }

    public static int compareAge(User a, User b) {
        return Integer.compare(a.getAge(), b.getAge());
    }

    public int compareNonStaticAge2(User a, User b) {
        return Integer.compare(a.getAge(), b.getAge());
    }

    public int compareNonStaticAge3(User a) {
        return a.getAge() > 0 ? 1 : -1;
    }

    public static int compareAge4(User a) {
        return a.getAge() > 0 ? 1 : -1;
    }

    public static void cloneUser(User user) {

    }

    public static void getAction() {

    }

    public static User createUser(Supplier<User> userSupplier) {
        return userSupplier.get();
    }

    public static void cloneConsumerUser(Consumer<User> userConsumer) {

    }

    public static void selectJob(SelectJob selectJob) {
        selectJob.selectJob(new User(), new Job());
    }

    public static void startAction(Action action) {
        action.onAction();
    }

    private Consumer<User> consumer1 = a -> a.getAge();
    private Consumer<User> consumer2 = User::printUser;
}
