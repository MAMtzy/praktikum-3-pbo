/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan12;

/**
 *
 * @author MAM
 */
public class MyException extends Exception{
    private String Teks;
    MyException(String s)
    {
        Teks="Exception generated by: "+s;
        System.out.println(Teks);
    }
}
class Eksepsi
{
    static void tampil(String s)throws Exception
    {
        System.out.println("Tampil");
        if(s.equals("amir"))
        {
            throw new MyException(s);
        }
        System.out.println("OK!");
    }
public static void main(String[] args)throws Exception
{
    try{
        tampil("ali");
        tampil("amir");
    }catch(MyException ex)
    {
        System.out.println("Tangkap:"+ex);
    }
}
}
