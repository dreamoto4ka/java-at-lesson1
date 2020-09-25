package ru.geekbrains.java.at.lesson1.participants;

public interface Runner {

    String getName();

    int getMaxLength();

    int getMaxWeight();

    boolean getSuccess();

    void setSuccess(boolean success);

    void run();

    void jump();

}