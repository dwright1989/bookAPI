package com.debbie.bookAPI.enums;

public enum Role {
    DEFAULT("USER"),
    PREFIX("ROLE_");

    private final String userRole;
    Role(String userRole) { this.userRole = userRole;}
    @Override
    public String toString() {
        return userRole;
    }
}
