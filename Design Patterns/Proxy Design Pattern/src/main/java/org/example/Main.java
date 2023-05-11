package org.example;

import org.example.proxy.PermissionProxy;
import org.example.service.StoreService;
import static org.example.utils.EnvUtil.setCliPermission;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        setCliPermission(args);

        Scanner scanner = new Scanner(System.in);
        PermissionProxy serviceProxy = new PermissionProxy(new StoreService());
        Integer operation;

        do {

            System.out.println("""
                    enter 0 to exit.
                    enter 1 to create.
                    enter 2 to read.
                    enter 3 to update.
                    enter 4 to delete.
                    """);

            operation = scanner.nextInt();

            try {

                switch (operation){
                    case 1:
                        serviceProxy.create(); break;
                    case 2:
                        serviceProxy.read(); break;
                    case 3:
                        serviceProxy.update(); break;
                    case 4:
                        serviceProxy.delete(); break;
                    case 0:
                        System.out.println("\nexiting\n"); break;
                    default:
                        System.out.println("\ninvalid input\n"); break;
                }

            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }

        } while (operation != 0);

    }
}