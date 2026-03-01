/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.chessgame.exceptions;

/**
 *
 * @author Fabio
 */
public class InvalidColorException extends Exception {

    /**
     * Creates a new instance of <code>InvalidColorException</code> without
     * detail message.
     */
    public InvalidColorException() {
    }

    /**
     * Constructs an instance of <code>InvalidColorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidColorException(String msg) {
        super(msg);
    }
}
