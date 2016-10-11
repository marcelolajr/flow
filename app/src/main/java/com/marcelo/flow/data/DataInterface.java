package com.marcelo.flow.data;

/**
 * Created by projeto on 11/10/2016.
 */

public interface DataInterface {
    Object fromJson(String Json);
    String toJson();
}
