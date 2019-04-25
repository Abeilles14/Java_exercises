/*
 * interface class telephone
 */

package com.isabelle;

public interface ITelephone {
    void powerOn();                  //signature, classes inherit interface
    void dial(int phoneNumber);      //public unneeded, will be using publicly
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
