/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.reactive;


import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 *
 * @author Administrator
 */
public class ReactiveTest {

    public void reactTest() {

        Observable<String> observable = Observable.create((ObservableEmitter<String> e) -> {
            e.onNext("Hello");
            e.onNext("Welcome");
            e.onNext("This is your first RxJava example");
            e.onComplete();
        });

        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("observer subscribed to observable - on subscribe");
            }

            @Override
            public void onNext(String value) {
                System.out.println("observer - onNext " + value);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("observer - onError " + e.toString());
            }

            @Override
            public void onComplete() {
                System.out.println("observer - on complete");
            }
        };

        observable.subscribe(observer);

    }

    public static void main(String[] args) {
        ReactiveTest react = new ReactiveTest();
        react.reactTest();

    }
}
