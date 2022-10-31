package com.library.Exception;

public class HndBookException extends Exception{
    String mesg;
    public HndBookException(String mesg){
        this.mesg = mesg;
    }
    public String getMessage(){
        return this.mesg;
    }
}
