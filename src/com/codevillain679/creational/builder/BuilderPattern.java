package com.codevillain679.creational.builder;

public class BuilderPattern {
    public BuilderPattern(){

        var account = new Account.Builder()
                .setID(1)
                .setName("Niels")
                .setEmail("mypersonalemail@mail.com")
                .setVerified(true)
                .build();

        System.out.println(account.toString());
    }
}
