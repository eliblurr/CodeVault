package org.example.service;
import org.example.interfaces.CRUD;

public class StoreService implements CRUD {

    public void create(){
        System.out.println("\nyou can create\n");
    }

    public void read(){
        System.out.println("\nyou can read\n");
    }

    public void update(){
        System.out.println("\nyou can update\n");
    }

    public void delete(){
        System.out.println("\nyou can delete\n");
    }
}
