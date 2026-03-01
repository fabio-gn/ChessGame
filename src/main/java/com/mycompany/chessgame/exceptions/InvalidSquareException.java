/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.chessgame.exceptions;

/**
 *
 * @author Fabio
 */
public class InvalidSquareException extends Exception {

    /**
     * Creates a new instance of <code>InvalidSquareException</code> without
     * detail message.
     */
    public InvalidSquareException() {
    }

    /**
     * Constructs an instance of <code>InvalidSquareException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidSquareException(String msg) {
        super(msg);
    }
}
