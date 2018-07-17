package com.panthera.java8;

import com.panthera.pojo.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.python.bouncycastle.util.Strings;

public class StreamPractice {

    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map(x -> (int) Math.sqrt(x)).collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(x -> x.getAge()).collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(x -> x.getAge()).distinct().collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).collect(Collectors.toList());
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return (int) users.stream().filter(x -> x.getAge() > 25).count();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(Strings::toUpperCase).collect(Collectors.toList());
    }

    public static Integer sums(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(x -> x.split(" ")[0]).collect(Collectors.toList());
    }

    public static List<String> getDistinctLetters(List<String> names) {
        throw new NotImplementedException();
    }

    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(x -> x.getName()).collect(Collectors.joining(","));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().mapToDouble(x -> x.getAge()).average().getAsDouble();
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().map(x -> x.getAge()).max(Comparator.comparing(Integer::valueOf)).get();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().map(x -> x.getAge()).min(Comparator.comparing(Integer::valueOf)).get();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(Collectors.partitioningBy(x -> x.isMale() == true));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(x -> x.getAge()));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(Collectors.partitioningBy(x -> x.isMale() == true, Collectors.counting()));
    }

    public static boolean anyMatchExample(List<User> users, int age) {
        return users.stream().anyMatch(x -> x.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().noneMatch(x -> x.getAge() == age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().findAny().filter(x -> x.getName().contains(name));
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        throw new NotImplementedException();
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        throw new NotImplementedException();
    }

    public static User findOldest(List<User> users) {
        throw new NotImplementedException();
    }

    public static int sumAge(List<User> users) {
        return users.stream().map(x -> x.getAge()).collect(Collectors.summingInt(Integer::valueOf));
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        throw new NotImplementedException();
    }

    public static void main(String[] args) {
        StreamPractice prac = new StreamPractice();

        List<User> user = new ArrayList<>();
        user.add(new User("Mahesh Patel", 28, true));
        user.add(new User("Naresh Sharma", 21, true));
        user.add(new User("Suresh Raina", 18, false));
        user.add(new User("Taresh Patil", 78, true));
        user.add(new User("Paresh Shimpi", 28, false));

        List<Integer> data = Arrays.asList(4, 8, 16, 85, 25, 62, 100, 121);
        List<String> names = Arrays.asList("Mahesh Patel", "Naresh Sharma", "Suresh Raina");

        // prac.returnSquareRoot(data).forEach(System.out::println);
        //prac.getAgeFromUsers(user).forEach(System.out::println);
        //prac.getDistinctAges(user).forEach(System.out::println);
        //List<User> limitedUser = prac.getLimitedUserList(user, 2);
        //limitedUser.forEach(System.out::println);
        //System.out.println(prac.countUsersOlderThen25(user));
        //System.out.println(prac.sums(data));
        //prac.skip(data, 2).forEach(System.out::println);
        //prac.getFirstNames(names).forEach(System.out::println);
        //System.out.println(prac.separateNamesByComma(user));
        //System.out.println(prac.getAverageAge(user));
        //System.out.println(prac.getMaxAge(user));
        //System.out.println(prac.getMinAge(user));
        /*  System.out.println(prac.sumAge(user));
        partionUsersByGender(user).forEach((k, v) -> {
            System.out.println(k + "" + v);
        });*/
 /* System.out.println(prac.groupByAge(user));
        partionUsersByGender(user).forEach((k, v) -> {
            System.out.println(k + "" + v);
        });*/
 /*System.out.println(prac.countGender(user));
        partionUsersByGender(user).forEach((k, v) -> {
            System.out.println(k + "" + v);
        });*/
        // System.out.println(prac.groupByGenderAndAge(user));
        //System.out.println(prac.anyMatchExample(user, 89));
        //System.out.println(prac.noneMatch(user, 21));
        //System.out.println(prac.findAny(user, "Mahesh").get().getName());
        //StreamPractice.sortByAge(user).forEach(System.out::println);
        IntStream i = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        StreamPractice.getBoxedStream(i);

    }

}
