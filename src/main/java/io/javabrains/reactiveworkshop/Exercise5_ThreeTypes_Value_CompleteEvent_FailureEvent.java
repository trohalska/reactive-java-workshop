package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise5_ThreeTypes_Value_CompleteEvent_FailureEvent {

  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

    // Subscribe to a flux using the error and completion hooks
//    ReactiveSources.intNumbersFlux().subscribe(
//        number -> System.out.println(number),
//        err -> System.out.println("Failure event " + err.getMessage()),
//        () -> System.out.println("Complete event")
//    );

//    ReactiveSources.userFlux().subscribe(
//        user -> System.out.println(user),
//        err -> System.out.println("Failure event " + err.getMessage()),
//        () -> System.out.println("Complete event")
//    );
//
//    Disposable subscription = ReactiveSources
//        .userFlux()
//        .subscribe(
//            user -> System.out.println(user),
//            err -> System.out.println("Failure event " + err.getMessage()),
//            () -> System.out.println("Complete event"),
//            subscriber -> {
//              //deprecated method
//            }
//        );
//    subscription.dispose();

    // Subscribe to a flux using an implementation of BaseSubscriber
//    ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

    System.out.println("Press a key to end");
    System.in.read();
  }
}

//class MySubscriber<T> extends BaseSubscriber<T> {
//
//  @Override
//  public void hookOnSubscribe(Subscription subscription) {
//    System.out.println("Subscribe happened");
//    request(2);  // here we need to ask for an items on subscribe
//  }
//
//  @Override
//  public void hookOnNext(T value) {
//    System.out.println(value.toString() + " received");
//    request(1); // here we need to ask for an item after each execution
//  }
//
//  @Override
//  public void hookOnComplete() {
//    System.out.println("Complete event happened");
//  }
//}