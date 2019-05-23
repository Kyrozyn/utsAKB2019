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
    private LinkedList<Teman> list;
    public listTeman(){
        list = new LinkedList<>();
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
        if(list.remove(teman)){
            Log.d("tag","Teman = "+teman.getNim()+" Berhasil di dihapus");
            return true;
        }
        else{
            Log.d("tag","Teman = "+teman.getNim()+" gagal di dihapus");
            return false;
        }
    }
    public boolean modify(Teman x,Teman y){
        if(list.contains(x)){
            int index = list.indexOf(x);
            Teman t = (Teman)list.set(index, y);
            Log.d("tag","List "+ t.getNim()+" berhasil diubah");
            return true;
        }
        else{
            Log.d("tag","List gagal diubah");
            return false;
        }
    }
    public Teman getLast(){
        return (Teman) list.getLast();
    }

    public Teman[] getAll(){
        Teman[] teman = new Teman[list.size()];
        return list.toArray(teman);
    }
}