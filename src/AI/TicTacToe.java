package AI;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class ControlBoard {
    char board[] = new char[9]; // refers to the tic-tac-toe board
    boolean player_mv = false;
    ControlBoard() {
        for(int i = 0; i < 9; i++) board[i] = (char) (49 + i);
    } 
    // display the board
    void Display() {
        System.out.println("BOARD");
        int j = 1;
        for(char i : board) {
            System.out.print(j % 3 == 0 ? i + "\n" : i + " ");
            ++j;
        }
        System.out.println();
    }
    // switch values
    void SwitchVal(int index) {
        if (board[index - 1] != 'X' & board[index - 1] != 'O') {
            board[index - 1] = !player_mv ? 'X' : 'O';
            player_mv = !player_mv;
        }
        else {
            System.err.print("\nERR #900 : Overlapping Moves");
            System.exit(130);
        }
    }
    // check if anyone has won the game
    boolean CheckBoard() {
        return (board[2] == board[4] & board[2] == board[6]) || (board[0] == board[4] & board[0] == board[8])
                || (board[2] == board[5] & board[2] == board[8]) || (board[1] == board[4] & board[1] == board[7])
                || (board[0] == board[3] & board[0] == board[6]) || (board[6] == board[7] & board[6] == board[8])
                || (board[3] == board[4] & board[3] == board[5]) || (board[0] == board[1] & board[0] == board[2])
                ? true : false;
    }
}
class Interferance extends ControlBoard{
    // Get the available moves
    ArrayList<Integer> GetMv() {
        ArrayList<Integer> finalList = new ArrayList<>();
        for(char i : board) {
            if(i != 'O' && i != 'X')
                finalList.add(i - 48);
        }
        return finalList;
    }
    int chooseMove() {
        ArrayList<Integer> Selection = GetMv();
        return Selection.get((int) Math.floor(Math.random() * (Selection.size() + 1)));
    }
    char ImplementCheck() {
        if (CheckBoard()) {
            System.out.println('\n' + (!(player_mv) ? "The Computer " : "You") + " won the game!");
            return 'e';
        }
        return 'n';
    }
}
class TicTacToe {
    public static void main(String args[])throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        Interferance disp = new Interferance();
        int counter = 0; // stores the current count
        disp.Display();
        do {
            System.out.println("Enter a move: ");
            int x = Integer.parseInt(in.readLine());
            disp.SwitchVal(x);
            if(disp.ImplementCheck() == 'e')
                return;
            disp.Display();
            disp.SwitchVal(disp.chooseMove());
            if(disp.ImplementCheck() == 'e')
                return;
            disp.Display();
        } while(counter++ < 9);
    }
}
