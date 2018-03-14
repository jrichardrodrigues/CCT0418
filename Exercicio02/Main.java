package Exercicio02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import javax.swing.*;

public class Main {
    
    public static void main(String args[]){
        
        // DECLARAÇÃO DE IDs
        int op = 0;
        int idUsuario = 1;
        int idVenda = 1;
        int idCarro = 1;
        
        // DECLARAÇÃO DO ARRAYLIST DE CARROS
        ArrayList<Carro> carrosL = new ArrayList<Carro>();
        
        // DECLARAÇÃO DO ARRAYLIST DO TOTAL DE CARROS  EM UMA ÚNICA VENDA
        ArrayList<Venda> vendasL = new ArrayList<Venda>();
        
        // DECLARAÇÃO DO ARRAYLIST DO TOTAL DE COMISSÕES
        ArrayList<Float> comissoesL = new ArrayList<Float>();
                
        do{
            // SOLICITANDO A OPÇÃO DE VENDA
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n"
                + "0- Sair;\n"
                + "1- Adicionar usuário; \n"
                + "2- Adicionar venda; \n"
                + "3- Adicionar carro; \n"
                + "4- Visualizar comissão; \n"
                + "5- Visualizar total vendido;"));
            
            if(op == 1){

               // SOLICITANDO DADOS DO USUÁRIO 
               String nome = JOptionPane.showInputDialog("Digite o nome do usuário: ");
               
               String cpf = JOptionPane.showInputDialog("Digite o CPF do usuário: ");
               
               String email = JOptionPane.showInputDialog("Digite o email do usuário: ");
               
               String telefone = JOptionPane.showInputDialog("Digite o telefone do usuário: ");
               
               Usuario u = new Usuario(idUsuario, nome, cpf, email, telefone);
               
               idUsuario++;
               
            } if(op == 2){
                
                // SOLICITANDO DADOS DA VENDA
                String data = JOptionPane.showInputDialog("Digite a data da venda: ");

                // TRANSFORMANDO O ARRAYLIST EM APENAS UMA STRING
                StringBuilder sb = new StringBuilder();
                for (int i = 0 ; i < carrosL.size(); i++) { 
                    sb.append(Integer.toString(carrosL.get(i).getId()) + ". " + carrosL.get(i).getNome() + "(" + Double.toString(carrosL.get(i).getValor()) + ")"); sb.append("\n"); 
                }
                String carrosDisponiveis = sb.toString();
                    
                // MOSTRANDO O ARRAYLIST DE CARROS E PERGUNTANDO QUAIS CARROS FORAM VENDIDOS
                String carros = JOptionPane.showInputDialog(carrosDisponiveis + "Digite os ids dos carros: ");
               
                // SEPARANDO OS IDS DOS CARROS
                String carrosVendidos[] = carros.split(Pattern.quote(","));
                
                float valor = 0;
                float comissaoImportados = 0;
                float comissoesImportados = 0;
                float comissaoNacionais = 0;
                float comissoesNacionais = 0;
                
                // SOMANDO O VALOR DE TODOS OS CARROS VENDIDOS
                for(int i = 0; i < carrosVendidos.length; i++){
                    
                    int id = Integer.parseInt(carrosVendidos[i])-1;
                                        
                    float valorUnitario = carrosL.get(id).getValor();
                    
                    if(Integer.parseInt(carrosL.get(id).getTipo()) == 1){
                        
                        comissaoNacionais = (valorUnitario*10)/100;
                                                
                    } else { comissaoImportados = (valorUnitario*10)/100; }
                    
                    valor =+ valorUnitario;
                    
                    valorUnitario = 0;

                    comissoesNacionais =+ comissaoNacionais;
                    
                    comissoesImportados =+ comissaoImportados;
       
                }
                
                float totalComissoes = comissoesNacionais+comissoesImportados;
                                
                // CADASTRANDO A VENDA
                Venda v = new Venda(idVenda, data, valor);

                // ADICIONANDO ITENS NAS VENDAS DO DIA
                vendasL.add(idVenda-1,v);
                
                // ADICIONANDO ITENS NAS VENDAS DO DIA
                comissoesL.add(idVenda-1,totalComissoes);

                // INCREMENTO DO ID DA VENDA
                idVenda++;
                
            } if (op == 3){
               
               String nome = JOptionPane.showInputDialog("Digite o nome do carro: ");
               
               String cor = JOptionPane.showInputDialog("Digite a cor do carro: ");
               
               String ano = JOptionPane.showInputDialog("Digite o ano do carro: ");

               String marca = JOptionPane.showInputDialog("Digite a marca do carro: ");
               
               String modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
               
               String valor = JOptionPane.showInputDialog("Digite o valor do carro: ");
               
               String tipo = JOptionPane.showInputDialog("1- Nacional; \n2- Importado;\n Digite o tipo do carro: ");
               
               String obs = JOptionPane.showInputDialog("Digite alguma observação: ");
               
               Carro c = new Carro(idCarro, nome, cor, ano, marca, modelo, Float.parseFloat(valor), tipo, obs);
               
               // ADICIONANDO O CARRO NA NO ARRAYLIST
               carrosL.add(idCarro-1,c);
               
               // INCREMENTO DO ID DO CARRO
               idCarro++;
                
            } if (op == 4){
                
                // TOTAL DE COMISSÕES DO DIA
                double totalComissoes = 0;
                
                for (int i = 0 ; i < comissoesL.size(); i++) { 
                    
                    totalComissoes =+ comissoesL.get(i).doubleValue();
                    
                }
                JOptionPane.showConfirmDialog(null, "Total de vendas do dia: " + Double.toString(totalComissoes)); 
                
            } if (op == 5){
                
                // EXERCÍCIO: CALCULAR AS VENDAS DO DIA
                JOptionPane.showMessageDialog(null, "EXERCÍCIO: \n"
                        + "1. DESENVOLVER MÓDULO PARA CALCULAR AS VENDAS DO DIA; \n"
                        + "2. PREPARAR PELO MENOS UMA JANELA DE CADASTRO UTILIZANDO O JFRAME. \n"
                        + "3. QUANDO UM CARRO FOR VENDIDO, DEVE SER RETIRADO DA LISTA.\n"
                        + "4. REVISAR E SE POSSÍVEL MELHORAR O CÓDIGO DESENVOLVIDO.");
                
            }

     
        }while(op != 0);
        
        
    }
    
}