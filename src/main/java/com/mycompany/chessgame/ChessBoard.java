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
    
    private Piece[][] squares;
    private String numbers = "1234567890";
    private String letters = "abcdefghijklmnopqrstuvwxyz";
    private String piecesRow = "RNBQKBNR";
    private Piece[] pieces;
    
    
    public ChessBoard(){
        // inizializa una scacchiera 8x8
        this.squares = new Piece[8][8];  
        // riempie la scacchiera
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                squares[i][j] = null;
            }
        }
    }
    
    public void initializePieces(){
        this.pieces = new Piece[32];
        
        try {
            populateColor("white");
            populateColor("black");
        } catch (InvalidColorException ex) {
            Logger.getLogger(ChessBoard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidSquareException ex) {
            Logger.getLogger(ChessBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    private void populateColor(String color) throws InvalidColorException,InvalidSquareException{
        int rowNumberForPawns;
        int rowNumberForPieces;
        if(color.equals("white")){
            rowNumberForPawns = 2;
            rowNumberForPieces = 1;
        }
        else{
            rowNumberForPawns = 7;
            rowNumberForPieces = 8;
        }
        for(int i=0; i<this.squares.length; i++){
            String squarePosition;
            switch (this.piecesRow.charAt(i)) {
                case 'P':
                    this.pieces[i] = new Pawn(color);
                    squarePosition = "" + this.letters.charAt(i) + String.valueOf(rowNumberForPawns);
                    this.setSquare(squarePosition, this.pieces[i]);
                    break;
                case 'R':
                    this.pieces[i] = new Rook(color);
                    squarePosition = "" + this.letters.charAt(i) + String.valueOf(rowNumberForPieces);
                    this.setSquare(squarePosition, this.pieces[i]);
                    break;
                case 'N':
                    this.pieces[i] = new Knight(color);
                    squarePosition = "" + this.letters.charAt(i) + String.valueOf(rowNumberForPieces);
                    this.setSquare(squarePosition, this.pieces[i]);
                    break;
                case 'B':
                    this.pieces[i] = new Bishop(color);
                    squarePosition = "" + this.letters.charAt(i) + String.valueOf(rowNumberForPieces);
                    this.setSquare(squarePosition, this.pieces[i]);
                    break;
                case 'Q':
                    this.pieces[i] = new Queen(color);
                    squarePosition = "" + this.letters.charAt(i) + String.valueOf(rowNumberForPieces);
                    this.setSquare(squarePosition, this.pieces[i]);
                    break;
                case 'K':
                    this.pieces[i] = new King(color);
                    squarePosition = "" + this.letters.charAt(i) + String.valueOf(rowNumberForPieces);
                    this.setSquare(squarePosition, this.pieces[i]);
                    break;
                default:
                    // codice da eseguire se nessun case corrisponde
                    System.out.println("errore nei pezzi");
            }
            
           
        }
    }
    
    public void movePiece(Piece piece, String square){
        
    }
    private int[] squareToCoords(String square) throws InvalidSquareException{
        if(!square.matches("^[a-hA-H][1-8]$")){
            throw new InvalidSquareException();
        }
        int column = this.letters.indexOf(square.toLowerCase().charAt(0));
        int row = Integer.parseInt(square.substring(1)) -1;
        return new int[]{column, row};
    }
    // restituisce il pezzo presente in un dato momento in una data casella
    public Piece getSquare(String square) throws InvalidSquareException{
        int[] coords = this.squareToCoords(square);
        return squares[coords[0]][coords[1]];
    }
    public void setSquare(String square, Piece piece)throws InvalidSquareException{
        int[] coords = this.squareToCoords(square);
        squares[coords[0]][coords[1]] = piece;
        if(piece != null){
            piece.setCurrentPosition(square);
        }
    }
}
    
    

