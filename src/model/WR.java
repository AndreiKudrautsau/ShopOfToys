package model;

import java.io.Serializable;

public interface WR {
    boolean writeFile(Serializable serializable, String path);
    Object readFile(String path);
}
