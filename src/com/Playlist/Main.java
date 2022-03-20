package com.Playlist;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;
public class Main {

    public static void main(String[] args) {
        LinkedList<PlayerList> listMusik = new LinkedList<PlayerList>();
        Scanner in = new Scanner(System.in);
        Boolean pilihanUser = true;


        while (pilihanUser) {
            menu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Masukkan Judul Lagu :");
                    String judulLagu = in.next();
                    String singer = in.next();
                    listMusik.addLast(new PlayerList(judulLagu, singer));
                    break;
                case 2:
                    System.out.println("1. Hapus sesuai judul lagu");
                    System.out.println("2. Hapus lagu terakhir");

                    if (in.nextInt() == 1) {
                        removeFromTitle(listMusik, in.next());
                    } else {
                        listMusik.removeLast();
                    }
                    break;
                case 3:
                    print(listMusik);
                    break;
                default:
                    pilihanUser = false;
                    break;
            }
        }

    }

    //menu
    public static void menu() {
        System.out.println("Pilih Menu berikut dalam Playlist : ");
        System.out.println("1. Masukkan Lagu");
        System.out.println("2. Hapus Lagu");
        System.out.println("3. Putar Lagu");
        System.out.println("4  Keluar");
    }

    //fungsi
    public static void print(LinkedList playerLists) {
        ListIterator<PlayerList> kursor = playerLists.listIterator();
        
        while (kursor.hasNext()) {
            System.out.print(kursor.next());
            if (kursor.hasNext()) {
                System.out.print(" | ");
            }
        }

        System.out.println();

        while (kursor.hasPrevious()) {
            System.out.print(kursor.previous());
            if (kursor.hasPrevious()) {
                System.out.print(" | ");
            }
        }
        System.out.println();
    }

    public static void removeFromTitle(LinkedList playerLists, String judul){
        ListIterator<PlayerList> kursor = playerLists.listIterator();
            while(kursor.hasNext()){
                PlayerList playerList = kursor.next();
                if (playerList.getJudulLagu().equals(judul)){
                    kursor.remove();
                    System.out.print("berhasil terhapus\n");
                }
            }
    }
}