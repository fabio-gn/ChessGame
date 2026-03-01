/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessgame;
import com.mycompany.chessgame.exceptions.*;

/**
 *
 * @author Fabio
 */
public class King extends Piece{
    
    public King(String color) throws InvalidColorException{
        super(color);      
    }
    
    @Override
    public void move(){
        this.currentPosition = "new position";
    }
    
}
