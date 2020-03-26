/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asincrono;

public class Asincrono implements Runnable
{
    String atributo;

    public Asincrono(int i)
    {
        atributo = "Intento" + i;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 4; i++)
        {
            Thread ch = new Thread(new Asincrono(i));
            ch.start();
        }
    }

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i + ": " + atributo);
        }
    }
}