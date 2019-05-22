/*
NIM : 10116281
Nama : Andreas Rizki Rizaldi
Kelas : IF-7
Dibuat : 21-05-2019
 */
package xyz.kyrozyn.uts10116281.model;

import android.util.Log;

import java.util.LinkedList;


public class listTeman {
    LinkedList list;
    public listTeman(){
        list = new LinkedList();
    }
    public boolean add(Teman teman){
        if (list.add(teman)){
            Log.d("tag","teman '"+teman.getNim()+"' berhasil ditambah!");
            return true;
        }
        else{
            Log.d("tag","teman '"+teman.getNim()+"' gagal ditambah!");
            return false;
        }
    }
    public boolean delete(Teman teman){
        return list.remove(teman);
    }
    public boolean modify(Teman x,Teman y){
        if(list.contains(x)){
            delete(x);
            add(y);
            return true;
        }
        else{
            return false;
        }
    }
    public Teman get(){
        return (Teman) list.getFirst();
    }
}
