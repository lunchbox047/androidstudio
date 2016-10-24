package com.example.osq.calcu1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import java.util.Queue;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    String sempty="";
    boolean flagpoint=false;//是否能输入小数点标记
    boolean flagequal=false;//是否能输入等号标记
    boolean flagsym=false;//能否输入运算符号标记
    boolean flag0=true;//是否能输入0标记

    public int numcount=0;//输入的数字个数
    public int digitcount=0;//输入的数字位数
    public int symcount=0;//输入的符号数
    double[] array=new double[10];//存储数字的数组
    char[] sym=new char[100];//存储符号

    private Button button00;
    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private Button button06;
    private Button button07;
    private Button button08;
    private Button button09;
    private Button buttonAC;
    private Button buttonCE;
    private Button buttonequ;
    private Button buttonpoint;
    private Button buttonadd;
    private Button buttonsub;
    private Button buttonmul;
    private Button buttondiv;
    private Button allclear;
    private Button clearele;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        button00=(Button)findViewById(R.id.Button00);
        button01=(Button)findViewById(R.id.Button01);
        button02=(Button)findViewById(R.id.Button02);
        button03=(Button)findViewById(R.id.Button03);
        button04=(Button)findViewById(R.id.Button04);
        button05=(Button)findViewById(R.id.Button05);
        button06=(Button)findViewById(R.id.Button06);
        button07=(Button)findViewById(R.id.Button07);
        button08=(Button)findViewById(R.id.Button08);
        button09=(Button)findViewById(R.id.Button09);
        buttonAC=(Button)findViewById(R.id.Buttonallclear);
        buttonCE=(Button) findViewById(R.id.Buttonclearelement);
        buttonadd=(Button)findViewById(R.id.ButtonJia);
        buttonsub=(Button)findViewById(R.id.ButtonJian) ;
        buttonmul=(Button)findViewById(R.id.Buttoncheng);
        buttondiv=(Button)findViewById(R.id.Buttonchu);
        buttonpoint=(Button)findViewById(R.id.Buttonpoint);
        buttonequ=(Button)findViewById(R.id.Buttonresult);
        allclear=(Button)findViewById(R.id.Buttonallclear);
        clearele=(Button)findViewById(R.id.Buttonclearelement);


        button00.setOnClickListener(this);
        button01.setOnClickListener(this);
        button02.setOnClickListener(this);
        button03.setOnClickListener(this);
        button04.setOnClickListener(this);
        button05.setOnClickListener(this);
        button06.setOnClickListener(this);
        button07.setOnClickListener(this);
        button08.setOnClickListener(this);
        button09.setOnClickListener(this);
        buttonadd.setOnClickListener(this);
        buttonsub.setOnClickListener(this);
        buttonmul.setOnClickListener(this);
        buttondiv.setOnClickListener(this);
        buttonpoint.setOnClickListener(this);
        buttonequ.setOnClickListener(this);
        allclear.setOnClickListener(this);
        clearele.setOnClickListener(this);
    }
    public void onClick(View v) {
        Button bview=(Button)v;
        TextView text=(TextView)findViewById(R.id.Text1);

        //numarray na=new numarray();//用于调用数字存储方法
        symbolarray sa=new symbolarray();//用于调用符号存储



        switch ((String)bview.getText())
        {
            case "0":
                if(flag0==true)
                {
                    sempty=sempty+bview.getText();
                    text.setText(sempty);

                    if(digitcount>0)
                        array[numcount]=array[numcount]*10+0;
                    else if(digitcount<0)
                        array[numcount]+=0*(Math.pow(10,digitcount));
                    else
                        array[numcount]=0;

                    flagsym=true;
                    flagequal=true;
                    if(digitcount>0)
                    {flagpoint=true; digitcount++;}
                    else if(digitcount<0)
                    {digitcount--;}
                    else
                    {flag0=false;flagpoint=true;}
                }
                break;
            case "1":
                sempty=sempty+bview.getText();
                text.setText(sempty);

                if(digitcount>0)
                    array[numcount]=array[numcount]*10+1;
                else if(digitcount<0)
                    array[numcount]+=1*(Math.pow(10,digitcount));
                else
                    array[numcount]=1;


                flag0=true;
                flagsym=true;
                flagequal=true;
                if(digitcount>=0)
                {flagpoint=true; digitcount++;}
                else
                {digitcount--;}

                break;
            case "2":
                sempty=sempty+bview.getText();
                text.setText(sempty);

                if(digitcount>0)
                    array[numcount]=array[numcount]*10+2;
                else if(digitcount<0)
                    array[numcount]+=2*(Math.pow(10,digitcount));
                else
                    array[numcount]=2;


                flag0=true;
                flagsym=true;
                flagequal=true;
                if(digitcount>=0)
                {flagpoint=true; digitcount++;}
                else
                {digitcount--;}

                break;

            case "3":
                sempty=sempty+bview.getText();
                text.setText(sempty);

                if(digitcount>0)
                    array[numcount]=array[numcount]*10+3;
                else if(digitcount<0)
                    array[numcount]+=3*(Math.pow(10,digitcount));
                else
                    array[numcount]=3;


                flag0=true;
                flagsym=true;
                flagequal=true;
                if(digitcount>=0)
                {flagpoint=true; digitcount++;}
                else
                {digitcount--;}

                break;

            case "4":
                sempty=sempty+bview.getText();
                text.setText(sempty);

                if(digitcount>0)
                    array[numcount]=array[numcount]*10+4;
                else if(digitcount<0)
                    array[numcount]+=4*(Math.pow(10,digitcount));
                else
                    array[numcount]=4;


                flag0=true;
                flagsym=true;
                flagequal=true;
                if(digitcount>=0)
                {flagpoint=true; digitcount++;}
                else
                {digitcount--;}

                break;

            case "5":
                sempty=sempty+bview.getText();
                text.setText(sempty);

                if(digitcount>0)
                    array[numcount]=array[numcount]*10+5;
                else if(digitcount<0)
                    array[numcount]+=5*(Math.pow(10,digitcount));
                else
                    array[numcount]=5;


                flag0=true;
                flagsym=true;
                flagequal=true;
                if(digitcount>=0)
                {flagpoint=true; digitcount++;}
                else
                {digitcount--;}

                break;

            case "6":
                sempty=sempty+bview.getText();
                text.setText(sempty);

                if(digitcount>0)
                    array[numcount]=array[numcount]*10+6;
                else if(digitcount<0)
                    array[numcount]+=6*(Math.pow(10,digitcount));
                else
                    array[numcount]=6;


                flag0=true;
                flagsym=true;
                flagequal=true;
                if(digitcount>=0)
                {flagpoint=true; digitcount++;}
                else
                {digitcount--;}

                break;

            case "7":
                sempty=sempty+bview.getText();
                text.setText(sempty);

                if(digitcount>0)
                    array[numcount]=array[numcount]*10+7;
                else if(digitcount<0)
                    array[numcount]+=7*(Math.pow(10,digitcount));
                else
                    array[numcount]=7;


                flag0=true;
                flagsym=true;
                flagequal=true;
                if(digitcount>=0)
                {flagpoint=true; digitcount++;}
                else
                {digitcount--;}

                break;

            case "8":
                sempty=sempty+bview.getText();
                text.setText(sempty);

                if(digitcount>0)
                    array[numcount]=array[numcount]*10+8;
                else if(digitcount<0)
                    array[numcount]+=8*(Math.pow(10,digitcount));
                else
                    array[numcount]=8;


                flag0=true;
                flagsym=true;
                flagequal=true;
                if(digitcount>=0)
                {flagpoint=true; digitcount++;}
                else
                {digitcount--;}

                break;

            case "9":
                sempty=sempty+bview.getText();
                text.setText(sempty);

                if(digitcount>0)
                    array[numcount]=array[numcount]*10+9;
                else if(digitcount<0)
                    array[numcount]+=9*(Math.pow(10,digitcount));
                else
                    array[numcount]=9;


                flag0=true;
                flagsym=true;
                flagequal=true;
                if(digitcount>=0)
                {flagpoint=true; digitcount++;}
                else
                {digitcount--;}

                break;

            case "+":
                if(flagsym==true)
                {
                    sempty=sempty+bview.getText();
                    text.setText(sempty);

                    sym[symcount]='+';

                    numcount++;
                    digitcount=0;
                    sa.push(sym,'+',symcount);
                    symcount++;
                    flagpoint=false;
                    flagequal=false;
                    flagsym=false;
                }
                break;
            case "-":
                if(flagsym==true)
                {
                    sempty=sempty+bview.getText();
                    text.setText(sempty);

                    sym[symcount]='-';

                    numcount++;
                    digitcount=0;
                    sa.push(sym,'-',symcount);
                    symcount++;
                    flagpoint=false;
                    flagequal=false;
                    flagsym=false;
                }
                break;
            case "*":
                if(flagsym==true)
                {
                    sempty=sempty+bview.getText();
                    text.setText(sempty);

                    sym[symcount]='*';

                    numcount++;
                    digitcount=0;
                    sa.push(sym,'*',symcount);
                    symcount++;
                    flagpoint=false;
                    flagequal=false;
                    flagsym=false;
                }
                break;
            case "/":
                if(flagsym==true)
                {
                    sempty=sempty+bview.getText();
                    text.setText(sempty);

                    sym[symcount]='/';

                    numcount++;
                    digitcount=0;
                    sa.push(sym,'/',symcount);
                    symcount++;
                    flagpoint=false;
                    flagequal=false;
                    flagsym=false;
                }
                break;
            case "CE":
                if(sempty!="")
                {
                    int len=sempty.length();
                    sempty=sempty.substring(0,len-1);
                    if(digitcount>1)
                    {
                        array[numcount]=Math.floor(array[numcount]/10);
                        digitcount--;
                    }
                    else if(digitcount==1)
                    {
                        digitcount=0;
                        flagpoint=false;
                        flagequal=false;
                        flagsym=false;
                        flag0=true;
                        //numcount--;
                    }
                    else if(digitcount==0)
                    {
                        flagsym=true;
                        flagequal=true;
                        flag0=true;
                        flagpoint=true;
                        //symcount--;
                    }
                    else if(digitcount==-1)
                    {
                        digitcount=0;
                        flagpoint=true;
                        flagsym=true;
                        flagequal=true;
                    }
                    else if(digitcount<-1)
                    {
                        array[numcount]=Math.floor((array[numcount]*Math.pow(0.1,digitcount+1))/10)/Math.pow(0.1,digitcount+2);
                        digitcount++;
                    }

                    text.setText(sempty);
                }

                break;
            case "AC":
                sempty="";
                text.setText(sempty);
                flagpoint=false;
                flagequal=false;
                flagsym=false;
                flag0=true;

                array=new double[100];
                numcount=0;
                digitcount=0;
                symcount=0;

                break;
            case ".":
                if(flagpoint==true)
                {
                    sempty=sempty+bview.getText();
                    text.setText(sempty);
                    digitcount=-1;
                    flagsym=false;
                    flagpoint=false;
                    flagequal=false;

                }
                break;

            case "=":
                if(flagequal==true)
                {
                    sempty=sempty+bview.getText();
                    sempty=sempty+String.valueOf(getresult(array,sym,numcount,symcount));

                    flagpoint=true;
                    digitcount=0;
                    symcount=0;
                    numcount=0;
                    flagequal=false;


                    text.setText(sempty);
                }

                break;


        }


    }


    public double getresult(double[ ] array,char[] symarr,int num_count,int sym_count)
    {
        double result=-999999;//0/n的结果

        for(int i=0;i<sym_count;)
        {
            if(symarr[i]=='*')
            {
                array[i+1]*=array[i];
                for(int j=i;j<num_count;j++)
                {
                    array[j]=array[j+1];
                    symarr[j]=symarr[j+1];
                }
                num_count--;
                sym_count--;
            }
            else if(symarr[i]=='/')
            {
                array[i+1]=array[i]/array[i+1];
                for(int j=i;j<num_count;j++)
                {
                    array[j]=array[j+1];
                    symarr[j]=symarr[j+1];
                }
                num_count--;
                sym_count--;
            }
            else
                i++;
        }
        for(int k=0;k<sym_count;)
        {
            if(symarr[k]=='+')
            {
                array[k+1]=array[k]+array[k+1];
                for(int j=k;j<num_count;j++)
                {
                    array[j]=array[j+1];
                    symarr[j]=symarr[j+1];
                }
                num_count--;
                sym_count--;
            }
            else if(symarr[k]=='-')
            {
                array[k+1]=array[k]-array[k+1];
                for(int j=k;j<num_count;j++)
                {
                    array[j]=array[j+1];
                    symarr[j]=symarr[j+1];
                }
                num_count--;
                sym_count--;
            }
        }
        result=array[0];
        return result;
    }

}
