package com.codevillain679.creational.builder;

public class Account {

    private int ID;
    private String name;
    private String email;
    private Boolean verified;

    public Account(Builder builder) {
        this.ID = builder.ID;
        this.name = builder.name;
        this.email = builder.email;
        this.verified = builder.verified;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getVerified() {
        return verified;
    }

    public static class Builder{
        private int ID;
        private String name;
        private String email;
        private Boolean verified;
        public Builder setID(int ID) {
            this.ID = ID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setVerified(Boolean verified) {
            this.verified = verified;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", verified=" + verified +
                '}';
    }
}