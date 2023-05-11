package org.example.interfaces;

import org.example.exceptions.MissingPermissionException;

public interface CRUD {
    void create() throws MissingPermissionException;
    void read() throws MissingPermissionException;
    void update() throws MissingPermissionException;
    void delete() throws MissingPermissionException;
}
