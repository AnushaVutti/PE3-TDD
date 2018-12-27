package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    private ChessBoard board = new ChessBoard();
    @Test
    public void chessBoardTrue () {
       String[][] arr = new String[][] {
               {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
               {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
               {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
               {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
               {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
               {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
               {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
               {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}

       };
       assertEquals(arr,board.chessBoard());
    }
    @Test
    public void chessBoardNotNull () {
        assertNotNull(board.chessBoard());
    }



}