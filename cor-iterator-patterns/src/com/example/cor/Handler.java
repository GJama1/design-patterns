package com.example.cor;

public interface Handler {

    void setNext(Handler handler);
    void handle(Order order);

}
