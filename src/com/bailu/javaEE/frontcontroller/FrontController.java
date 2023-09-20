package com.bailu.javaEE.frontcontroller;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page request: " + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
