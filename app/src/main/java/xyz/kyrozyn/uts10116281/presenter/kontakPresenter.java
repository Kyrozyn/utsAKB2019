package xyz.kyrozyn.uts10116281.presenter;

import android.widget.ArrayAdapter;

import xyz.kyrozyn.uts10116281.R;
import xyz.kyrozyn.uts10116281.model.Teman;
import xyz.kyrozyn.uts10116281.model.listTeman;

public class kontakPresenter {
    private listTeman list;
    public kontakPresenter(){
        list = new listTeman();
        Teman teman1 = new Teman("10116281","Andreas Rizki Rizaldi","IF-7","082240604117","andreasrr998@gmail.com");
        Teman teman2 = new Teman("10116282","Arvi Ramadhan","IF-7","9222222","aaa@aa.ch");
        Teman teman3 = new Teman("10116283","kntl","IF-7","9222222","aaa@aa.ch");
        list.add(teman1);
        list.add(teman2);
        list.add(teman3);
    }

    public String testTambahTeman(){

        //list.modify(teman2,teman3);
        //list.delete(teman3);
        Teman t = list.getLast();
        return t.getNama();
    }

    public Teman[] TampilSemua(){
        return list.getAll();
    }

    public void list(){


    }
}
