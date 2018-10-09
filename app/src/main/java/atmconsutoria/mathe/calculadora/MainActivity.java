package atmconsutoria.mathe.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private Button menos,mais,vezes,divisao,um,dois,tres,quatro,cinco,seis,sete,oito,nove,zero,igual;
private String expressaoRecebe="";
private ArrayList<String> expressao;
private boolean sinal=true;
private EditText saida;
private int resolvendo=0;
private boolean qualNum=true;
private AlertDialog.Builder dialog;
    private ArrayList<String> expressaoAux;

// dialog "deseja trocar o sinal?????"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        expressao=new ArrayList<String>();
        expressaoAux=new ArrayList<String>();

        setContentView(R.layout.activity_main);
        menos=findViewById(R.id.botaoMenos_Id);
        mais=findViewById(R.id.botaoMais_Id);
        vezes=findViewById(R.id.botaoVezes_Id);
        divisao=findViewById(R.id.botaoDivisao_Id);
        um=findViewById(R.id.um_Id);
        dois=findViewById(R.id.dois_Id);
        tres=findViewById(R.id.tres_Id);
        quatro=findViewById(R.id.quatro_Id);
        cinco=findViewById(R.id.cinco_Id);
        seis=findViewById(R.id.seis_Id);
        sete=findViewById(R.id.sete_Id);
        oito=findViewById(R.id.oito_Id);
        nove=findViewById(R.id.nove_Id);
        zero=findViewById(R.id.zero);
        igual=findViewById(R.id.igual_Id);
        saida=findViewById(R.id.saida_Id);
        saida.setText(" ");
        dialog =new AlertDialog.Builder(MainActivity.this);

       // expressao.add(0,"");
        // ************************************************
        vezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sinal==true) {
                    expressaoRecebe+="*";
                    saida.setText(saida.getText()+" *");
                    sinal =false;

                }
                else{
//                     chama dialog
                }


            }
        });
        // ///////////////////////////////////////////////////
        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sinal==true) {
                    expressaoRecebe+="/";
                    saida.setText(saida.getText()+" /");
                    sinal =false;

                }
                else{
//                     chama dialog
                }


            }
        });
        // +++++++++++++++++++++++++++++++++++++++++++++++++++
        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sinal==true) {
                    expressaoRecebe+="+";
                    saida.setText(saida.getText()+" +");
                    sinal =false;

                }
                else{
//                     chama dialog
                }


            }
        });
        // ---------------------------------------------------
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (sinal==true) {
                         expressaoRecebe+="-";
                        saida.setText(saida.getText()+" -");
                        sinal =false;

                    }
                    else{
//                     chama dialog
                    }

            }
        });
        //0000000000000000000000000000000000000000000000000
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           expressaoRecebe+="0";
           saida.setText(saida.getText()+" 0");
                sinal =true;



            }
        });
        //111111111111111111111111111111111111111111111111
        um.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressaoRecebe+="1";
                saida.setText(saida.getText()+" 1");
                sinal =true;



            }
        });

        //22222222222222222222222222222222222222222222222222
        dois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressaoRecebe+="2";
                saida.setText(saida.getText()+" 2");
                sinal =true;


            }
        });

        //33333333333333333333333333333333333333333333333333
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressaoRecebe+="3";
                saida.setText(saida.getText()+" 3");
                sinal =true;



            }
        });

        //444444444444444444444444444444444444444444444444
        quatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressaoRecebe+="4";
                saida.setText(saida.getText()+" 4");
                sinal =true;



            }
        });

        //5555555555555555555555555555555555555555555555555
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressaoRecebe+="5";
                saida.setText(saida.getText()+" 5");
                sinal =true;


            }
        });
        //666666666666666666666666666666666666666666666666
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressaoRecebe+="6";
                saida.setText(saida.getText()+" 6");
                sinal =true;



            }
        });
        //77777777777777777777777777777777777777777777777777
        sete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressaoRecebe+="7";
                saida.setText(saida.getText()+" 7");
                sinal =true;



            }
        });
        //888888888888888888888888888888888888888888888888888
        oito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressaoRecebe+="8";
                saida.setText(saida.getText()+" 8");
                sinal =true;



            }
        });
        //999999999999999999999999999999999999999999999999
        nove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressaoRecebe+="9";
                saida.setText(saida.getText()+" 9");
                sinal =true;



            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            resolver();

            }
        });

    }





public void armazenar(){
        String numeroMaior;
        Character auxiliar;
    int indice=expressao.size();
    expressao.add(expressao.size(),"");
    int i=0; int r=0;
        for(i=0; i<(expressaoRecebe.length()); i++){
            auxiliar=expressaoRecebe.charAt(r);

            if(verificar(auxiliar)){
                 if(expressao.get(indice).equals("")||expressao.get(indice).equals("0")){
                     expressao.set(indice,String.valueOf(auxiliar));

                     indice=expressao.size();
                     expressao.add(indice,"");

                      }
                 else{

                expressao.add(String.valueOf(auxiliar));
                     indice=expressao.size();

               // indice++;
                expressao.add(indice,"");
            }}
            else {


                numeroMaior= String.valueOf(auxiliar);
                numeroMaior = numeroMaior+expressao.get(indice);
                expressao.set(indice,numeroMaior);
            }

        r++;
        }
//      saida.setText(String.valueOf(expressao.size()));
//    for (String str:expressao
//         ) {
//       saida.setText(saida.getText()+str);
//    }

}


        public void resolver(){

        armazenar();

        Character achar='z';

            for(int i=0; i<expressao.size(); i++){

                achar= expressao.get(i).charAt(0);
           //     saida.setText(String.valueOf(achar) );

             //   if(verificar(achar)) {

                    switch (achar){

                        case '-' :
                            resolvendo= (Integer.valueOf(expressao.get(i-1)))-(Integer.valueOf(expressao.get(i+1)));
                            expressao.set(i-1,String.valueOf(resolvendo));
                            expressao.remove((i+1));
                            expressao.remove(i);
                           saida.setText(String.valueOf(expressao.size()));
                            i--;
                            break;

                        case '+' :
                           resolvendo= (Integer.valueOf(expressao.get(i-1)))+(Integer.valueOf(expressao.get(i+1)));
                           expressao.set(i-i,String.valueOf(resolvendo));
                           expressao.get(i+1);
                            expressao.get(i);
                           expressao.remove((i+1));
                           expressao.remove(i);
                            i--;
                            break;
                        case '*' :
                            resolvendo= (Integer.valueOf(expressao.get(i-1)))*(Integer.valueOf(expressao.get(i+1)));
                            expressao.set(i-1,String.valueOf(resolvendo));
                            expressao.remove((i+1));
                            expressao.remove(i);
                            i--;

                            break;
                        case '/' :
                            resolvendo= (Integer.valueOf(expressao.get(i-1)))/(Integer.valueOf(expressao.get(i+1)));
                            expressao.set(i-1,String.valueOf(resolvendo));
                            expressao.remove((i+1));
                            expressao.remove(i);
                            i--;
                            break;

                        default:
                            break;
                   // }




            }

                sinal =true;

                qualNum=true;


        }               saida.setText(String.valueOf(resolvendo));

            for (String str:expressao
                 ) {
                if(str!=null||str!=""){
                    expressaoAux.add(str);
                }
            }
            expressao=new ArrayList<String>();


            for (String str:expressaoAux
                    ) {
                if(str!=null||str!=""){
                    expressao.add(str);
                }
            }

//saida.setText(String.valueOf(expressao.size()));

expressaoRecebe="";


    }

    public boolean verificar(char testada){
        Character ultim= testada;
        if(ultim.equals('-')||ultim.equals('+')||ultim.equals('/')||ultim.equals('*')){


            return true;
        }
        return false;

            }

}
