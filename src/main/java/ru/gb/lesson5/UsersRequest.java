package ru.gb.lesson5;

public class UsersRequest extends ListRequest {
    public static final String TYPE = "users";


    public UsersRequest() {

        super(TYPE);

    }
}