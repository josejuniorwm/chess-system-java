package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessPiece;
import chess.ChessPosition;

public class UI {
	
			// https://stackoverflow.com/questions/2979383/java-clear-the-console
		public static void clearScreen() {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			}
			
		public static ChessPosition readChessPosition(Scanner sc) {
			try {
			String s = sc.nextLine();
			char column = s.charAt(0);
			int row = Integer.parseInt(s.substring(1));
			return new ChessPosition(column, row);
			}
			catch (RuntimeException e) {
				throw new InputMismatchException("Erros lendo a posit��o do xadrez");
			}
			
		}
	
		public static void printBoard(ChessPiece[][] pieces) {
			for (int i=0; i<pieces.length; i++) {
				System.out.print((8-i) + " ");
				for (int j=0; j<pieces.length; j++){
					printPiece(pieces[i] [j]);
				}
				System.out.println();
			}
			
			System.out.println("  a b c d e f g h");
		}

		private static void printPiece(ChessPiece piece) {
			if (piece == null) {
				System.out.print("-");
			}
			else {
					
				 System.out.print(piece);
				
			}
		    System.out.print(" ");
			
		
		}
}

