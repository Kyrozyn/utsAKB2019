/*
NIM : 10116281
Nama : Andreas Rizki Rizaldi
Kelas : IF-7
Dibuat : 21-05-2019
 */
package xyz.kyrozyn.uts10116281.model;

public class Teman {
    private String Nim;
    private String Nama;
    private String Kelas;
    private String Telepon;
    private String Email;
    private String Facebook = null;
    private String Twitter = null;
    private String Line = null;

    public Teman(String nim, String nama, String kelas, String telepon, String email) {
        Nim = nim;
        Nama = nama;
        Kelas = kelas;
        Telepon = telepon;
        Email = email;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String nim) {
        Nim = nim;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }

    public String getTelepon() {
        return Telepon;
    }

    public void setTelepon(String telepon) {
        Telepon = telepon;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String facebook) {
        Facebook = facebook;
    }

    public String getTwitter() {
        return Twitter;
    }

    public void setTwitter(String twitter) {
        Twitter = twitter;
    }

    public String getLine() {
        return Line;
    }

    public void setLine(String line) {
        Line = line;
    }
}
