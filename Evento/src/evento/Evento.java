package evento;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Evento  {

    //Simulado: sistema de compra e venda de ingresso.
     private String nome, data, evento, op, dados;
     private int valor_unico, capacidade_maxima, indice_ingresso, operacao, i;
     ArrayList<String> lista_de_ingresso = new ArrayList<String>();
 
     public static void main(String[] args) {
 
        Evento ev = new Evento();
         ev.Menu_Principal();
     }
     public void Menu_Principal()
     {
         op = null;
         try
         {
         op = JOptionPane.showInputDialog(null, "OPÇÕES" + "\n1-Registrar evento" + "\n2-Vender Ingresso" + "\n3-Lista De Ingressos Vendidos" + 
         "\n0-Sair");
         operacao = Integer.parseInt(op);
         }catch(NumberFormatException erro)
         {
              JOptionPane.showMessageDialog(null, "Somente números!");
              Menu_Principal();
         }
         if(operacao < 0 || operacao > 3)
         {
             JOptionPane.showMessageDialog(null, "Opção incorreta!");
             Menu_Principal();
         }
 
          switch(operacao)
          {
              case 1:
              nome = JOptionPane.showInputDialog(null, "Nome do evento");
              dados = JOptionPane.showInputDialog(null, "Data do evento");
              data = dados;
              try
              {
              dados = JOptionPane.showInputDialog(null, "Valor do ingresso");
              valor_unico = Integer.parseInt(dados);
              dados = JOptionPane.showInputDialog(null, "Capacidade do evento");
              capacidade_maxima = Integer.parseInt(dados);
              }catch(NumberFormatException erro)
              {
                   JOptionPane.showMessageDialog(null, "Somente números!");
              }
              evento = "Nome: " + nome + "\nData: " + data + "\nValor: " + valor_unico
              + "\nCapacidade: " + capacidade_maxima; 
              Menu_Principal();
              break;
              case 2:
              Vender_Ingresso();
              break;
              case 3:
              Lista_De_Ingressos_Vendidos();
              break;
              case 0:
              System.exit(0);
              break;
          }
          Menu_Principal();
     }
     public void Vender_Ingresso()
     {
         //Adiciona o ingresso na lista com a condição de capacidade máxima.
         Ingresso ig = new Ingresso();

         if(evento == null && indice_ingresso == 0)
         {
             JOptionPane.showMessageDialog(null, "Nenhum evento registrado!");
             Menu_Principal(); 
         }else
         {
           if(indice_ingresso < capacidade_maxima)
           {
             do
             {
               try
               {
               op = JOptionPane.showInputDialog(null, "Informações do evento\n" + evento
               + "\nConfirmar evento? " + "\n1-Sim 2-Não");
               operacao = Integer.parseInt(op);
               if(operacao < 1 || operacao > 2)
               {
                   JOptionPane.showMessageDialog(null, "Opção incorreta!");
                   Menu_Principal();
               }
           }catch(NumberFormatException erro)
           {
                JOptionPane.showMessageDialog(null, "Somente números!");
           }
       }while(operacao < 1 || operacao > 2);
           }else
           {
               JOptionPane.showMessageDialog(null, "Sem ingresso disponível!");
               Menu_Principal();
           }
           switch(operacao)
           {
               case 1:
                ig.setValor_unico(valor_unico);
                ig.setNomeDoEvento(nome);
                ig.setData(data);
                dados = JOptionPane.showInputDialog(null, "Nome");
                ig.setNome(dados);
                try
                {dados = JOptionPane.showInputDialog(null, "CPF");
                    ig.setCPF(Integer.parseInt(dados));
                    setDados(JOptionPane.showInputDialog(null, "Informe o tipo de ingresso:" + "\n1-Ingresso Pista"
                    + "\n2-Ingresso VIP" + "\n3-Ingresso Camarote"));
                    
                    i = Integer.parseInt(dados);
                    if(i < 0 || i > 3)
                    {
                       JOptionPane.showMessageDialog(null, "Opção incorreta!");
                      Vender_Ingresso();
                    }else
                    {
                    switch(i)
                    {
                      case 1:
                      ig.setOp(i);
                      ig.Dados_do_ingresso();
                      break;
                      case 2:
                      ig.setOp(i);
                      ig.Dados_do_ingresso();
                      break;
                      case 3:
                      ig.setOp(i);
                      ig.Dados_do_ingresso();
                      break;
                    }
                  }
                }catch(NumberFormatException erro)
                {
                     JOptionPane.showMessageDialog(null, "Somente números!");
                }
               break;
               case 2:
               Menu_Principal();
               break;
           }
       }
     }
     public void Lista_De_Ingressos_Vendidos()
     {
         //Mostra histórico de ingressos vendidos

         if(indice_ingresso == 0)
         {
             JOptionPane.showMessageDialog(null, "Nenhum ingresso vendido!"); 
         }else
         { 
             for(i = 0; i < lista_de_ingresso.size(); i++)
             {
             JOptionPane.showMessageDialog(null, "Total de ingressos vendidos: " 
             + indice_ingresso + "\n" + lista_de_ingresso.get(i));
             }
         }
         Menu_Principal();
     }
     public String getNome(String _Nome)
     {
         return nome;
     }
     public void setNome(String _Nome)
     {
         this.nome = _Nome;
     }
     public String getEvento(String _Evento)
     {
         return evento;
     }
     public void setEvento(String _Evento)
     {
         this.evento = _Evento;
     }
     public int getCapacidade(int _capacidade)
     {
         return capacidade_maxima;
     }
     public void setCapacidade(int _capacidade)
     {
         this.capacidade_maxima = _capacidade;
     }
     public int getIndice_Ingresso(int _Indice_Ingresso)
     {
         return indice_ingresso;
     }
     public void setIndice_Ingresso(int _Indice_Ingresso)
     {
         this.indice_ingresso = _Indice_Ingresso;
     }
     public String getOp(String _Op)
     {
         return op;
     }
     public void setOp(String _Op)
     {
         this.op = _Op;
     }
     public int getOperacao(int _Operacao)
     {
         return operacao;
     }
     public void setOperacao(int _Operacao)
     {
         this.operacao = _Operacao;
     }
     public String getDados(String _Dados)
     {
         return dados;
     }
     public void setDados(String _Dados)
     {
         this.dados = _Dados;
     }
     public String getData(String _Data)
     {
         return data;
     }
     public void setData(String _Data)
     {
         this.data = _Data;
     }
     public ArrayList<String> getListar_Ingressos(ArrayList<String> _Listar_Ingressos)
     {
         return lista_de_ingresso;
     }
     public void setListar_Ingressos(ArrayList<String> _Listar_Ingressos)
     {
         this.lista_de_ingresso = _Listar_Ingressos;
     }
}
