package org.example.enums;

public enum Permission {
    CREATE(1),
    READ(2),
    UPDATE(3),
    DELETE(4);

    private int exponent;
    private Permission(int n){
        this.exponent = (int) Math.pow(2,n);
    }

    public int permission(){
        return this.exponent;
    }

}
