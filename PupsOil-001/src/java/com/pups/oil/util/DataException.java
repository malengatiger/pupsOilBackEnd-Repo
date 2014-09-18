/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.util;

/**
 *
 * @author aubreyM
 */
public class DataException extends Exception{
    
    private String description;
    public DataException(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}
