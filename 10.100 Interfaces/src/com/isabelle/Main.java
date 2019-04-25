/*
 * isabelle andre
 * 14/08/18
 * interfaces, common behaviour used by all classes, no constructor
 * inherit or use interface?
 */

package com.isabelle;

import java.util.List;

public class Main {
    //private static List<Album> albums = new ArrayList<Album>();           //list is interface, +new (specify type)

    public static void main(String[] args) {
        ITelephone phone;
        phone = new DeskPhone(1234);
        phone.powerOn();
        phone.callPhone(1234);
        phone.answer();

        phone = new MobilePhone(4321);          //new instance, different class
        phone.powerOn();
        phone.callPhone(4321);
        phone.answer();

    }
}
