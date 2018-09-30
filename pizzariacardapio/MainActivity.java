package com.example.rober.pizzariacardapio;


        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends Activity {

    EditText visor;
    double somando = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visor = findViewById(R.id.visor);


      //  setContentView(R.layout.activity_main);
  // /      visor = findViewById(R.id.visor);
    }

    public void valorDaConta(View botao){
        switch (botao.getId()){
            case R.id.bt1:
                somando = somando + 25.00;
                visor.setText("Valor total da conta R$" + somando); break;
            case R.id.bt2:
                somando = somando + 27.25;
                visor.setText("Valor total da conta R$" + somando); break;
            case R.id.bt3:
                somando = somando + 35.00;
                visor.setText("Valor total da conta R$" + somando); break;
            case R.id.bt4:
                somando = somando + 21.50;
                visor.setText("Valor total da conta R$" + somando); break;
            case R.id.bt5:
                somando = somando + 23.00;
                visor.setText("Valor total da conta R$" + somando); break;
        }
    }
}