package com.scwellness.util;

public class ActiveSessionsExistException extends Exception {
    public ActiveSessionsExistException(String msg) {
        super(msg);
    }
}
