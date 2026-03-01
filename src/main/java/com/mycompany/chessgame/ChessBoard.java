/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chessgame;
import com.mycompany.chessgame.exceptions.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabio
 */
public class ChessBoard {
    
    private String[][] board;
    
    private String numbers = "1234567890";
    private String letters = "abcdefghijklmnopqrstuvwxyz";
    private Piece[] pieces;
    
    
    public ChessBoard(){
        // inizializa una scacchiera 8x8
        this.board = new String[8][8];  
        // riempie la scacchiera
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                board[i][j] = "" + letters.charAt(i) + numbers.charAt(j);
            }
        }
    }
    
    public void initializePieces(){
        this.pieces = new Piece[32];
        
        for(int i=0; i<this.board.length; i++){
            
            try {
                this.pieces[i] = new Pawn("white");
                this.pieces[i].setCurentPosition(this.letters.charAt(i));
            } catch (InvalidColorException ex) {
                Logger.getLogger(ChessBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
        
    }
    public void movePiece(Piece piece, String square){
        
    }
    
    public String getSquare(String square) throws InvalidSquareException{
        if(!this.checkSquareInput(square)){
            throw new InvalidSquareException();
        }
        int column = this.letters.indexOf(square.toLowerCase().charAt(0));
        int row = Integer.parseInt(square.substring(1)) -1;
        
        return board[column][row];
    }
    
    public boolean checkSquareInput(String square){
        if(!square.matches("^[a-hA-H][1-8]$")){
           return false; 
        }
        return true;
    }
        
        
    
}
    
    

