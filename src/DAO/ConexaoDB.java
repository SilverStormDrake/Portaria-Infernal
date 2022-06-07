package DAO;

import java.sql.*;

public class ConexaoDB {
    
    private static String url = "jdbc:mysql://localhost:3306/";
    private static String senha = "_superSenha2912";
    private static String usuario = "root";
    
    public static Connection ConexaoDB(String banco){
        
        try {
            //Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection(url+banco, usuario, senha);
            System.out.println("conexao bem sucedida!");
            return con;
            
        } catch (Exception e) {
            System.out.println("Erro: "+ e);
            System.out.println("Conexao mal sucedida");
            return null;
        }
    }
    
}
