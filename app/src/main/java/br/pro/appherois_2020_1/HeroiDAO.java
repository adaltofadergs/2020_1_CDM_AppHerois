package br.pro.appherois_2020_1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class HeroiDAO {

    public static void inserir(Context contex, Heroi heroi){
        Banco banco = new Banco(contex);

        ContentValues valores = new ContentValues();
        valores.put( "nome", heroi.getNome() );
        valores.put( "grupo", heroi.getGrupo() );

        SQLiteDatabase db = banco.getWritableDatabase();
        db.insert("herois", null, valores);
    }
}

















