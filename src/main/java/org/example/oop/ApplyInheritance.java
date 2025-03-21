package org.example.oop;

interface I1{
    private String displayMessage(String msg){
        return msg;
    }
    public String publicDisplayMessage(String msg);
    default String protectedDisplayMessage(String msg){
        return msg;
    }
}

abstract class Abstract1{
    private String displayMessage(String msg){
        return msg;
    }
    public abstract String publicDisplayMessage(String msg);
    protected abstract String protectedDisplayMessage(String msg);
}
public class ApplyInheritance extends Abstract1{

    @Override
    public String publicDisplayMessage(String msg) {
        return null;
    }

    @Override
    protected String protectedDisplayMessage(String msg) {
        return null;
    }
}
