/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chessgame;

import com.mycompany.chessgame.exceptions.InvalidColorException;
import com.mycompany.chessgame.exceptions.InvalidSquareException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabio
 */
public class ChessGame {

    public static void main(String[] args) {
        ChessBoard cb = new ChessBoard();
        cb.initializePieces();
        
        try {
            System.out.println(cb.getSquare("e8"));
        } catch (InvalidSquareException ex) {
            Logger.getLogger(ChessGame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
}
