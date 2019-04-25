/*
 * interface class, saves object to be saved to storage medium
 */
package com.isabelle;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(ArrayList<String> savedValues);
}
