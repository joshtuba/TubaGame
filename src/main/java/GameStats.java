/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raspb
 */
public class GameStats {
    
    private boolean isRunning;
    private int Score;
    private int pressedValves;
    //private int notesRangeInt;

    public GameStats() {
        isRunning = false;
        Score = 0;
        pressedValves = 0;
        //notesRangeInt = 0;
    }

    public boolean isIsRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public int getPressedValves() {
        return pressedValves;
    }

    public void setPressedValves(int pressedValves) {
        this.pressedValves = pressedValves;
    }

    @Override
    public String toString() {
        return "gameStats{" + "isRunning=" + isRunning + ", Score=" + Score + ", pressedValves=" + pressedValves + '}';
    }
    
    
    
}
