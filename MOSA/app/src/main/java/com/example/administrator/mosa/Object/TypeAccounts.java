package com.example.administrator.mosa.Object;

import java.io.Serializable;
import java.util.PriorityQueue;

/**
 * Created by Administrator on 10/18/2017.
 */

public class TypeAccounts implements Serializable{
    private String Id;
    private String Name;
    private byte[] Image;
    private String Note;

    public TypeAccounts(String id, String name, byte[] image, String note) {
        Id = id;
        Name = name;
        Image = image;
        Note = note;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] image) {
        Image = image;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }
}
