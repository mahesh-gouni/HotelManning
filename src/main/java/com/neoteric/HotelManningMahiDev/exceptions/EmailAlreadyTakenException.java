package com.neoteric.HotelManningMahiDev.exceptions;



public class EmailAlreadyTakenException extends RuntimeException{
    public EmailAlreadyTakenException(String msg){
        super(msg);
    }
}
