package com.sahabt.testodev1;

/**
 * Hello world!
 *
 */
public class Calculations
{


    public static int FindingMod(int i1, int i2 ){

        int remain;
        if (i1 >= i2){
            remain = i1 % i2;
        }
        else{
            remain= i2 % i1;
        }

        return remain;


}

    public static boolean RemainderCheck (int i1, int i2){
        if(i1 % i2 == 0){
            return true;
        }
        else return false;

}

    public static int Factorial (int i3){

        int faktoriyel=1;

        for(int sayi=2; sayi <= i3 ; sayi++){

            faktoriyel = sayi * faktoriyel;
        }

        return faktoriyel;

}


    public static void main( String[] args )
    {
        System.out.println(FindingMod(7,2));
        System.out.println(Factorial(5));
        System.out.println(RemainderCheck(6,2));
    }
}
