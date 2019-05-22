package xyz.kyrozyn.uts10116281.presenter;

import xyz.kyrozyn.uts10116281.model.Teman;
import xyz.kyrozyn.uts10116281.model.listTeman;

public class kontakPresenter {
    listTeman list;
    public kontakPresenter(){
        list = new listTeman();
    }

    public String testTambahTeman(){
        Teman teman1 = new Teman("10116281","Andreas Rizki Rizaldi","IF-7","082240604117","andreasrr998@gmail.com");
        Teman teman2 = new Teman("10116282","Arvi Ramadhan","IF-7","9222222","aaa@aa.ch");
        list.add(teman1);
        list.add(teman2);
        Teman t = list.get();
        return t.getNama();
    }
}
