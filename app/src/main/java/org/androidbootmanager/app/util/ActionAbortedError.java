package org.androidbootmanager.app.util;

public class ActionAbortedError extends Exception {
    public ActionAbortedError(Exception e) {
        super(e);
    }
}