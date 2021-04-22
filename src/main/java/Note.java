/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raspb
 */
public class Note {
    private String name;
    private int fingering;

    public Note(String name, int fingering) {
        this.name = name;
        this.fingering = fingering;
    }
    
    public Note() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFingering() {
        return fingering;
    }

    public void setFingering(int fingering) {
        this.fingering = fingering;
    }

    @Override
    public String toString() {
        return "Note{" + "name=" + name + ", fingering=" + fingering + '}';
    }

   
    
    
}
