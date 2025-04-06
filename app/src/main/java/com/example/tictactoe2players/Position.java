package com.example.tictactoe2players;

public class Position {
    private  int line;
    private  int cole;

    public Position() {//חייבים פעולה בונה ריקה בשביל הפייר בייס


    }

    public Position(int line, int cole) {
        this.line = line;
        this.cole = cole;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getCole() {
        return cole;
    }

    public void setCole(int cole) {
        this.cole = cole;
    }
}
