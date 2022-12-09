package ru.gb.oseminar5.exception;

public class CommandException extends IllegalArgumentException{
    public CommandException(String message) {
        super(message);
    }

    public CommandException(String message, Throwable cause) {
        super(message, cause);
    }
}
