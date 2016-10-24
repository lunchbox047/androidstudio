package com.example.osq.calcu1;

/**
 * Created by OSQ on 2016/10/14.
 */
class symbolarray{

    public void push(char[] sym,char x,int symcount)
    {
        sym[symcount]=x;
    }
    public char pop(char[] sym,int symcount)
    {
        char y='+';
        y=sym[symcount];
        return y;
    }
}


