package evento;

import javax.swing.JOptionPane;

public class Ingresso {

     private int cpf, valor_unico;    
     private String nome, nomeDOEvento, data, ingresso;
     private int indice_ingresso, op;
    
     public void Mostrar_Resumo()
     {
         //Mostrar CPF, tipo de ingresso, nome do evento, data e valor.
         Evento ev = new Evento();
         JOptionPane.showMessageDialog(null, ingresso);

         ev.lista_de_ingresso.add(ingresso);

         indice_ingresso++;
         ev.setIndice_Ingresso(indice_ingresso);
         
         ev.Menu_Principal();
     }
     public void Dados_do_ingresso()
     {
        ingresso = "\nCOMPROVANTE" + "\nNome: " + nome + "\nCPF: " + cpf + 
        "\nEvento: " + nomeDOEvento + "\nData: " + data + 
        "\nIngresso tipo ";
        
       switch(op)
       {
           case 1:
           Ingresso_Pista ingresso_pista = new Ingresso_Pista();
           ingresso_pista.setIngresso(ingresso);
           ingresso_pista.setValor_unico(valor_unico);
           ingresso_pista.Calcular_Valor_Do_Ingresso();
           break;
           case 2:
           Ingresso_VIP ingresso_VIP = new Ingresso_VIP();
           ingresso_VIP.setIngresso(ingresso);
           ingresso_VIP.setValor_unico(valor_unico);
           ingresso_VIP.Calcular_Valor_Do_Ingresso();
           break;
           case 3:
           Ingresso_Camarote ingresso_Camarote = new Ingresso_Camarote();
           ingresso_Camarote.setIngresso(ingresso);
           ingresso_Camarote.setValor_unico(valor_unico);
           ingresso_Camarote.Calcular_Valor_Do_Ingresso();
           break;
       }
     }
     public String getNome(String _Nome)
     {
         return nome;
     }
     public void setNome(String _Nome)
     {
         this.nome = _Nome;
     }
     public int getCPF(int _CPF)
     {
         return cpf;
     }
     public void setCPF(int _CPF)
     {
         this.cpf = _CPF;
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
     public String getNomeDoEvento(String _NomeDoEvento)
     {
         return nomeDOEvento;
     }
     public void setNomeDoEvento(String _NomeDoEvento)
     {
         this.nomeDOEvento = _NomeDoEvento;
     }
     public String getData(String _Data)
     {
         return data;
     }
     public void setData(String _Data)
     {
         this.data = _Data;
     }
     public int getOp(int _Op)
     {
         return op;
     }
     public void setOp(int _Op)
     {
         this.op = _Op;
     }
}