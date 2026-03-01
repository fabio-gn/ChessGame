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
public class Piece {
    protected String color;
    protected String currentPosition;
    
    public Piece(String color) throws InvalidColorException{
        if(!color.toLowerCase().equals("white") && !color.toLowerCase().equals("black")){
            throw new InvalidColorException();
        }
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    protected void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }
    
    public String getCurrentPosition(){
        return this.currentPosition;
    }
    
    public void move(){
        System.out.println("piece moved");
    }
    
}
