package com.edisongonzalez.sln_practica_1_3;

//-------------------- Después del empaquetado siempre se importan librerias -----------------------

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    //------------- Creando objetos y variables e inicializando las que asi lo requieren------------

    private EditText emuestra;
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bs, br, bmul, bdiv, bp, bi;
    private String sacum="", snuma="", snumb="";
    private byte bflagp=0, bflagsum=0, bflagres=0, bflagmul=0, bflagdiv=0, bflagnuma=0, bflagopant=0;
    private float fnuma=0, fnumb=0, facum=0;

    /* Significado de los nombres de cada variable para inferir mas o menos su uso
        1. Objeto o variable se empieza por una letra minuscula que indica a que tipo de
        variable u objeto pertenece.
        2. Con respecto al EditText, muestra hace referencia a que sera nuestra pantalla para con el
        usuario.
        3.  Con resepecto al boton, estan enumerados del 0 al 9 refiriendose a esos botones de la
        interfaz.
        4. Aqui unas abreviaciones comunes.
            s:suma, r:resta, mul:multiplicación, div:división, p:punto, i:igual, flag:bandera (Indicador)
            acum:acumulado (Valor acumulativo), numa:numero a (Hace referencia a que el orden de una
            operación es numero a (operación) numero b), numb: numero b.
        5. Entre los tipo byte hay una bandera que tiene un nombre raro y es:
            bflagopant, su significado es variable tipo byte, su función es ser una bandera de la
            operación anterior.
        NOTA: Fue un error en este caso indicar que el objeto tipo boton inicializado con letra b y
        la variable tipo byte inicializada con letra b igualmente, se deberia de inicializar la
        tipo byte con by por ejemplo el objeto boton con bo o bu pero algo comun en este codigo es
        que todas las variables tipo byte son usadas como banderas, asi que despues de una b si no
        hay un indicativo flag entonces es porque nos referimos a un boton.
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Lo primero que se debe de realizar es llamar nuestra fucción onCreate e instanciar el estado
        //Luego llamar Vista de lo contenido en el activity_main.xml (nuestra función para mostrar)

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---------------------- Instanciando los objetos segun su id en el xml---------------------

        emuestra = (EditText) findViewById(R.id.editText);
        b0 = (Button) findViewById(R.id.button0);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        bs = (Button) findViewById(R.id.buttonsuma);
        br = (Button) findViewById(R.id.buttonresta);
        bmul = (Button) findViewById(R.id.buttonmult);
        bdiv = (Button) findViewById(R.id.buttondiv);
        bp = (Button) findViewById(R.id.buttonpunto);
        bi = (Button) findViewById(R.id.buttonigual);

        //---------------- Definimos las acciones después de presionar cada botón ------------------

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bflagsum = 0; bflagres = 0; bflagmul = 0; bflagdiv = 0;
                if (bflagnuma == 0){
                    snuma += "0";
                }
                else{
                    snumb += "0";
                }
                sacum += "0";
                emuestra.setText(sacum);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bflagsum = 0; bflagres = 0; bflagmul = 0; bflagdiv = 0;
                if (bflagnuma == 0){
                    snuma += "1";
                }
                else{
                    snumb += "1";
                }
                sacum += "1";
                emuestra.setText(sacum);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bflagsum = 0; bflagres = 0; bflagmul = 0; bflagdiv = 0;
                if (bflagnuma == 0){
                    snuma += "2";
                }
                else{
                    snumb += "2";
                }
                sacum += "2";
                emuestra.setText(sacum);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bflagsum = 0; bflagres = 0; bflagmul = 0; bflagdiv = 0;
                if (bflagnuma == 0){
                    snuma += "3";
                }
                else{
                    snumb += "3";
                }
                sacum += "3";
                emuestra.setText(sacum);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bflagsum = 0; bflagres = 0; bflagmul = 0; bflagdiv = 0;
                if (bflagnuma == 0){
                    snuma += "4";
                }
                else{
                    snumb += "4";
                }
                sacum += "4";
                emuestra.setText(sacum);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bflagsum = 0; bflagres = 0; bflagmul = 0; bflagdiv = 0;
                if (bflagnuma == 0){
                    snuma += "5";
                }
                else{
                    snumb += "5";
                }
                sacum += "5";
                emuestra.setText(sacum);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bflagsum = 0; bflagres = 0; bflagmul = 0; bflagdiv = 0;
                if (bflagnuma == 0){
                    snuma += "6";
                }
                else{
                    snumb += "6";
                }
                sacum += "6";
                emuestra.setText(sacum);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bflagsum = 0; bflagres = 0; bflagmul = 0; bflagdiv = 0;
                if (bflagnuma == 0){
                    snuma += "7";
                }
                else{
                    snumb += "7";
                }
                sacum += "7";
                emuestra.setText(sacum);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bflagsum = 0; bflagres = 0; bflagmul = 0; bflagdiv = 0;
                if (bflagnuma == 0){
                    snuma += "8";
                }
                else{
                    snumb += "8";
                }
                sacum += "8";
                emuestra.setText(sacum);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bflagsum = 0; bflagres = 0; bflagmul = 0; bflagdiv = 0;
                if (bflagnuma == 0){
                    snuma += "9";
                }
                else{
                    snumb += "9";
                }
                sacum += "9";
                emuestra.setText(sacum);
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bflagp == 0){
                    if (bflagnuma == 0){
                        snuma += ".";
                    }
                    else{
                        snumb += ".";
                    }
                    sacum += ".";
                    bflagp = 1;
                }
                emuestra.setText(sacum);
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bflagsum == 0 && bflagres == 0 && bflagmul == 0 && bflagdiv == 0){
                    fill_numa_numb(bflagnuma);
                    realizar_operaciones(bflagopant, fnuma, fnumb);
                    bflagopant = 1;
                    sacum += " + ";
                    bflagsum = 1;
                    bflagp = 0;
                }
                emuestra.setText(sacum);
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bflagres == 0 && bflagsum == 0 && bflagmul == 0 && bflagdiv == 0) {
                    fill_numa_numb(bflagnuma);
                    realizar_operaciones(bflagopant, fnuma, fnumb);
                    bflagopant = 2;
                    sacum += " - ";
                    bflagres = 1;
                    bflagp = 0;
                }
                emuestra.setText(sacum);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bflagmul == 0 && bflagsum == 0 && bflagres == 0 && bflagdiv == 0){
                    fill_numa_numb(bflagnuma);
                    realizar_operaciones(bflagopant, fnuma, fnumb);
                    bflagopant = 3;
                    sacum += " × ";
                    bflagmul = 1;
                    bflagp = 0;
                }
                emuestra.setText(sacum);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bflagdiv == 0 && bflagsum == 0 && bflagres == 0 && bflagmul == 0){
                    fill_numa_numb(bflagnuma);
                    realizar_operaciones(bflagopant, fnuma, fnumb);
                    bflagopant = 4;
                    sacum += " ÷ ";
                    bflagdiv = 1;
                    bflagp = 0;
                }
                emuestra.setText(sacum);
            }
        });
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
        }

        //---- Creamos función para cambiar a numa y numb (Llenar cada uno con valor correcto) -----

        private void fill_numa_numb(byte var_byte){
            //funcionamiento debe ser escrito aqui....
            if (var_byte == 0){
                bflagnuma = 1;
                fnuma = Float.parseFloat(snuma);
                snuma = "";
            }
            else{
                fnumb = Float.parseFloat(snumb);
                snumb = "";
            }
        }

        //-- Creamos una función para realizar operaciónes, el resultado solo se muestra con igual -

        private void realizar_operaciones(byte operacion, float numeroa, float numerob){
            switch (operacion) {
                case 1:
                    facum = fnuma + fnumb;
                    fnuma = facum;
                    sacum = Float.toString(facum);
                    bflagopant = 0;
                    break;
                case 2:
                    facum = fnuma - fnumb;
                    fnuma = facum;
                    sacum = Float.toString(facum);
                    bflagopant = 0;
                    break;
                case 3:
                    facum = fnuma * fnumb;
                    fnuma = facum;
                    sacum = Float.toString(facum);
                    bflagopant = 0;
                    break;
                case 4:
                    facum = fnuma / fnumb;
                    fnuma = facum;
                    sacum = Float.toString(facum);
                    bflagopant = 0;
                    break;
                default:
                    break;
            }
        }
}