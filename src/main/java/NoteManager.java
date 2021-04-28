
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author raspb
 */
public class NoteManager {

    private ArrayList<Note> database;

    public NoteManager() {
        database = new ArrayList<Note>();

        Note Bb2 = new Note("Bb2",    0);
        database.add(Bb2);
        Note C2 = new Note("C2",      4);
        database.add(C2);
        Note D2 = new Note("D2",   1200);
        database.add(D2);
        Note E2 = new Note("E2",    200);
        database.add(E2);
        Note F2 = new Note("F2",      0);
        database.add(F2);
        Note G2 = new Note("G2",   1200);
        database.add(G2);
    }

    public NoteManager(ArrayList<Note> database) {
        this.database = database;
    }

    public int getSize() {
        return database.size();
    }

    public ArrayList<Note> getAll() {
        return database;
    }

    public String getbyName(String noteName) {
        for (Note note : database) {
            if (note.getName() == noteName) {
                return note.toString();
            }
        }

        return null;
    }

    public Note getByIndex(int index) {
        return database.get(index);
    }

    public String getNameByIndex(int index) {
        String Name = "";

        Note myNote = database.get(index);
        Name = myNote.getName();

        return Name;
    }

    public int getFingeringByName(String name) {
        int fingering = 1;
        
        for (Note note : database) {
            if (note.getName() == name) {
                fingering = note.getFingering();
            }
        }
    
        
        return fingering;
    }

    public void create(Note newNote) {
        database.add(newNote);
    }

}
