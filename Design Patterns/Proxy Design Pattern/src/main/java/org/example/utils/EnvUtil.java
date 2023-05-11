package org.example.utils;

import org.example.enums.Permission;
import java.util.Arrays;

final public class EnvUtil {
    private EnvUtil(){};

    public static void setCliPermission(String[] args){
        Integer permission = Arrays.stream(args).distinct().filter(
                arg -> Arrays.stream(Permission.values()).map(Permission::toString).toList().contains(arg.toUpperCase())
        ).mapToInt( arg -> Permission.valueOf(arg.toUpperCase()).permission() ).reduce(0, (a, b) -> a + b);
        System.setProperty("cli-permissions", permission.toString());
    }

    public static int getCliPermission() {
        return Integer.parseInt(System.getProperty("cli-permissions"));
    }
}
