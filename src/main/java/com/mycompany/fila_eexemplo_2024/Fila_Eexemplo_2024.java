/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fila_eexemplo_2024;

/**
 *
 * @author nando
 */
public class Fila_Eexemplo_2024 {

    public static void main(String[] args) {
        //Cria a fila do refeitório
        Fila filaRefeitorio = new Fila();
        
        //Cria os alunos
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        
        //Cria os professores
        
        Professor prof1 = new Professor();
        Professor prof2 = new Professor();
        Professor prof3 = new Professor();
        
        //Cria os TAE
        
        TAE tae1 = new TAE();
        TAE tae2 = new TAE();
        TAE tae3 = new TAE();
        
        //preenche os dados dos alunos
        
        aluno1.nome = "A1";
        aluno1.Matricula = "123";
        
        aluno2.nome = "A2";
        aluno2.Matricula = "456";
        
        aluno3.nome = "A3";
        aluno3.Matricula = "789";
        
        //preenche os dados dos professores
        
        prof1.Nome = "P1";
        prof1.Titulacao = "esp";
        
        prof2.Nome = "P2";
        prof2.Titulacao = "Me";
        
        prof3.Nome = "P3";
        prof3.Titulacao = "Dr";
        
        //preenche os dados dos TAE
        
        tae1.Nome = "T1";
        tae1.cargo = "Secretaria";
        
        tae2.Nome = "T2";
        tae2.cargo = "Engenheiro";
        
        tae3.Nome = "T3";
        tae3.cargo = "Segurança";
        
        //insere pessoas na fila
        filaRefeitorio.filaDePessoas.add(aluno1);
        filaRefeitorio.filaDePessoas.add(prof1);
        filaRefeitorio.filaDePessoas.add(tae1);
        filaRefeitorio.filaDePessoas.add(aluno2);
        filaRefeitorio.filaDePessoas.add(aluno3);
        
        //Referências para realizar o casting
        Object obj;
        Aluno respAluno;
        Professor respProf;
        TAE respTAE;
        
        //Laço de repetição para imprimir os dados das pessoas na fila
        for(int i=0;i<5;i++ ){
            obj = filaRefeitorio.filaDePessoas.remove();
            
            if(obj instanceof Aluno) {
                respAluno = (Aluno) obj; //Casting
                System.out.println("Nome do Aluno..: "+respAluno.nome);
                System.out.println("Matricula do Aluno..: "+respAluno.Matricula);
                System.out.println("-----------");
            } else if(obj instanceof Professor){
                    respProf = (Professor) obj; //Casting
                    System.out.println("Nome do Professor..: "+respProf.Nome);
                    System.out.println("Titulacao do Professor..: "+respProf.Titulacao);
                    System.out.println("-----------");
                } else {
                        respTAE = (TAE) obj; //Casting
                        System.out.println("Nome do TAE..: "+respTAE.Nome);
                        System.out.println("Cargo do TAE..: "+respTAE.cargo);
                        System.out.println("-----------");
            }
        }
    }
}
