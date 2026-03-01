/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessgame;

import com.mycompany.chessgame.exceptions.InvalidColorException;

/**
 *
 * @author Fabio
 */
public class Pawn extends Piece{
    
    private String pieceType = "pawn";
    
    public Pawn(String color) throws InvalidColorException {
        super(color);
    }

    public String getPieceType() {
        return pieceType;
    }
    
    @Override
    public void move(){
        //metodo move
    }
    
}
