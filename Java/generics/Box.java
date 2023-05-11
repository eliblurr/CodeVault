package generics;

import java.io.Serializable;

// generic type extension calls for bounded generic -> compile for all subtype
public class Box<T extends Object & Serializable> implements Append<String>{
    String title;
    public Box(){}
    public Box(String title){ this.title = title;}

    @Override
    public String append(String first, String last) { return first+" "+last;}
}
