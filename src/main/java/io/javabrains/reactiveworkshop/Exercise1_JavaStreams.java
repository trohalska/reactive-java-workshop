package io.javabrains.reactiveworkshop;

public class Exercise1_JavaStreams {

  public static void main(String[] args) {

    // Use StreamSources.intNumbersStream() and StreamSources.userStream()

    // Print all numbers in the intNumbersStream stream
    StreamSources.intNumbersStream().forEach(System.out::println);

    // Print numbers from intNumbersStream that are less than 5
    StreamSources.intNumbersStream()
        .filter(i -> i < 5)
        .forEach(System.out::println);

    // Print the second and third numbers in intNumbersStream that's greater than 5
    StreamSources.intNumbersStream()
        .filter(i -> i > 5)
        .skip(1)
        .limit(2)
        .forEach(System.out::println);

    //  Print the first number in intNumbersStream that's greater than 5.
    //  If nothing is found, print -1
    System.out.println(StreamSources.intNumbersStream()
        .filter(i -> i > 5)
        .findFirst()
        .orElse(-1)
    );

    // Print first names of all users in userStream
    StreamSources.userStream()
        .map(user -> user.getFirstName())
        .forEach(System.out::println);

    // Print first names in userStream for users that have IDs from number stream
    StreamSources.userStream()
        .filter(user -> StreamSources.intNumbersStream().anyMatch(num -> num == user.getId()))
        .map(user -> user.getFirstName())
        .forEach(System.out::println);

    StreamSources.intNumbersStream()
        .flatMap(num -> StreamSources.userStream().filter(user -> user.getId() == num))
        .map(user -> user.getFirstName())
        .forEach(System.out::println);

    var stream = StreamSources.intNumbersStream();
    var stream1 = stream.flatMap(
        num -> StreamSources.userStream().filter(user -> user.getId() == num));
    var stream2 = stream1.map(user -> user.getFirstName());
    stream2.forEach(System.out::println);
  }

}
