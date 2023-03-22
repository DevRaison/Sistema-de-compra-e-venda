package evento;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ingresso_VIP extends Ingresso {

     private int valor_unico, valor_calculado, operacao;
     private String op, valor_total, ingresso;
     
     DecimalFormat df = new DecimalFormat("###,###,###,###.##");

     public void Calcular_Valor_Do_Ingresso()
     {
          //Se o ingresso for VIP calcular valor único mais 30% do valor único.
          valor_calculado = valor_unico * 30 / 100;
          valor_calculado = valor_calculado + valor_unico;
          valor_total = "VIP" + "\nValor R$ " + df.format(valor_calculado);
          Imprimir_Valor();
     }

    public void Imprimir_Valor()
    {
        //Retorna o tipo de ingresso com valor calculado.
        Ingresso ig = new Ingresso();
        try
        {
        op = JOptionPane.showInputDialog(null, "1 ingresso tipo " + valor_total
        + "\nDeseja confirmar? " + "\n1-Sim 2-Não");
        operacao = Integer.parseInt(op);
        if(operacao == 1)
        {
            ig.setIngresso(ingresso + valor_total + "\nConfirmado com sucesso! \n");
            ig.Mostrar_Resumo();

        }else
        {
           Evento ev = new Evento();
            ev.Vender_Ingresso();
        }
    }catch(NumberFormatException erro)
    {
         JOptionPane.showMessageDialog(null, "Somente números!");
         Imprimir_Valor();
    }
    }
    public int getValor_Unico(int _Valor_Unico)
    {
        return valor_unico;
    }
    public void setValor_unico(int _Valor_Unico)
    {
        this.valor_unico = _Valor_Unico;
    }
     public String getIngresso(String _Ingresso)
     {
         return ingresso;
     }
     public void setIngresso(String _Ingresso)
     {
         this.ingresso = _Ingresso;
     }
}
