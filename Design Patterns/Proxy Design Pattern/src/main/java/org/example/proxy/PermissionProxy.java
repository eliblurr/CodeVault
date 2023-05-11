package org.example.proxy;
import org.example.enums.Permission;
import org.example.exceptions.MissingPermissionException;
import org.example.interfaces.CRUD;
import org.example.service.StoreService;
import static org.example.utils.EnvUtil.getCliPermission;

public class PermissionProxy implements CRUD {

    StoreService service;

    public PermissionProxy(StoreService service){
        this.service = service;
    }

    private Boolean hasPermission(Permission operation){
        return (getCliPermission() & operation.permission()) == operation.permission();
    }

    @Override
    public void create() {
        if ( !hasPermission(Permission.CREATE) ){
            throw new MissingPermissionException("\ncreate permission required\n");
        }
        service.create();
    }

    @Override
    public void read() {
        if ( !hasPermission(Permission.READ) ){
            throw new MissingPermissionException("\nread permission required\n");
        }
        service.read();
    }

    @Override
    public void update() {
        if ( !hasPermission(Permission.UPDATE) ){
            throw new MissingPermissionException("\nupdate permission required\n");
        }
        service.update();
    }

    @Override
    public void delete() {
        if ( !hasPermission(Permission.DELETE) ){
            throw new MissingPermissionException("\ndelete permission required\n");
        }
        service.delete();
    }
}
