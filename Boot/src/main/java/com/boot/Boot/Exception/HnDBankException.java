package com.boot.Boot.Exception;
public class HnDBankException extends Exception{
    String mesg;
    public HnDBankException(String mesg){
        this.mesg = mesg;
    }
    public String getMessage(){
        return this.mesg;
    }

}