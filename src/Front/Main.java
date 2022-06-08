package Front;

// imports
import DAO.ManipuladorDB;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        teste06();
    }
    // testes
    
    // teste inserção
    static void teste1(){
        String[] valor={"Lulu", "Demonio", "suave", "100"},
        param={"nome_residente", "raca_residente", "temperamento_residente", "vida_residente"};
        
        ManipuladorDB mbd = new ManipuladorDB("banco_portaria_infernal");
        mbd.inserirDados("tb_residente", param, valor);
        mbd.desconectar();
    }
    
    // checar login
    static void teste2(){
        ManipuladorDB mbd = new ManipuladorDB("banco_portaria_infernal");
        boolean resposta = mbd.checarLoginPorteiro("jorge", "12345");
        System.out.println(resposta);
        mbd.desconectar();
    }
    
    // consultar dados e dados avançados
    static void teste3(){
        String[] param={"nome_admin"}, valor={"amilton"};
        ManipuladorDB mbd = new ManipuladorDB("banco_portaria_infernal");
        
        ArrayList<Object[]> lista = mbd.consultarDadosAdv("tb_admin", param, valor);
        ArrayList<Object[]> lista2 = mbd.consultarDados("tb_residente");
        mbd.desconectar();
        
        System.out.println("--------------");
        for (int x=0; x< lista.size(); x++){
            System.out.println(lista.get(x));
        }
        System.out.println("--------------");
        for (int x=0; x< lista2.size(); x++){
            for (int v=0; v<lista2.get(x).length; v++){
                System.out.print(lista2.get(x)[v]+" - ");
            }
            System.out.println("");
        }
    }
    
    // alterar dados
    static void teste4(){
        String[]
            param = {"temperamento_residente"},
            valor = {"moderado"},
            paramPesquisa = {"id_residente"},
            valorPesquisa = {"6"};
        ManipuladorDB mbd = new ManipuladorDB("banco_portaria_infernal");
        mbd.alterarDados("tb_residente", param, valor, paramPesquisa, valorPesquisa);
        mbd.desconectar();
    }

    // excluir dados
    static void teste5(){
        String param="nome_residente", valor="Lulu";
        ManipuladorDB mbd = new ManipuladorDB("banco_portaria_infernal");
        
        mbd.deletarRegistro("tb_residente", param, valor);
        mbd.desconectar();
    }
    
    static void teste06(){ // adicionando informações em um arquivo de texto

        File arquivo = new File("src");
        String arqF = arquivo.getAbsolutePath();
        //declaração de variáveis
        Path arquivo1 = Paths.get(arqF+"\\Banco\\anotacao.txt");
        Scanner entrada = new Scanner(System.in);
        String nome, senha, forma;
        
        System.out.print("insira seu nome: ");
        nome = entrada.nextLine();
        System.out.print("insira sua senha: ");
        senha = entrada.nextLine().trim();

        forma = "||"+nome+"||"+senha+"||\n";
        System.out.println(arquivo1);
        try {Files.write(arquivo1, forma.getBytes(), StandardOpenOption.APPEND);}
        catch (IOException e) {System.out.println("erro: "+e);}
        catch (Exception e) {System.out.println("erro: "+e);}

        entrada.close();
    }
    
}
