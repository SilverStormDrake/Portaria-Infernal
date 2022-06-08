package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManipuladorDB {

    private String banco;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private Connection conexao = null;
    private String sql = "";
    
    public ManipuladorDB(String banco){
        this.banco = banco;
        conectar();
    }   
    
    private void conectar(){
        try {this.conexao = ConexaoDB.ConexaoDB(this.banco);}
        catch (Exception ex) {System.out.println("Erro: " + ex);}
    }
    
    public void desconectar(){
        try{this.conexao.close();System.out.println("desconexao bem sucedida!");}
        catch(SQLException e){System.out.println("Erro: "+e);}
    }   

    // consulta geral
    public ArrayList<Object[]> consultarDados(String tabela){

        String sql = "SELECT * FROM "+tabela;

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            // instanciando o arraylist de array
            ArrayList<Object[]> listaRetornada = new ArrayList();
            int cont;
            boolean valid;

            while(rs.next()){
                cont=1;
                valid = true;
                ArrayList<Object> listatemp = new ArrayList();
                
                while(valid){
                    try{
                        listatemp.add(rs.getObject(cont));
                        cont++;
                    }
                    catch (SQLException e){
                        //System.out.println("Erro: "+e);
                        valid = false;
                        Object[] c1 = new Object[listatemp.size()];
                        
                        // passando valores do arraylist para o array de objetos
                        c1 = listatemp.toArray();
                        listaRetornada.add(c1);
                    }
                    
                    catch (Exception e){
                        System.out.println("ERro: "+e);
                        return null;
                    }
                }
            }
            return listaRetornada;
        } 
        
        catch (SQLException ex) {
            System.out.println("Erro: "+ ex);
            return null;
        }
    } 
    
    // consulta exata
    public ArrayList<Object[]> consultarDadosAdv(String tabela,String param[],String valor[]){

        String sqlParte2="", sql;

        if (param.length == 1){sql = "SELECT * FROM "+tabela+" WHERE "+param[0]+" = ?";}
        else{
            sql = "SELECT * FROM ";
            
            // where ( x=y and q=z )
            
            // adicionar parametros no sql parte2
            for (int x=0; x<param.length-1;x++){
                sqlParte2 += (param[x]+" = ?");
                sqlParte2 += " AND ";
            }
            sqlParte2 += (param[param.length-1]+" = ?");
            
            // juntando o sql ao sql2
            sql += tabela+" WHERE "+sqlParte2;
        }
        
        try {
            pst = conexao.prepareStatement(sql);
            // adicionando valores dos parametros de pesquisa
            for (int x=0; x<param.length;x++){pst.setString(x+1, valor[x]);}
            
            // executa a query
            rs = pst.executeQuery();
         
            ArrayList<Object[]> listaRetornada = new ArrayList();
            int cont;
            boolean valid;

            while(rs.next()){
                cont=1;
                valid = true;
                ArrayList<Object> listatemp = new ArrayList();
                
                while(valid){
                    try{
                        listatemp.add(rs.getObject(cont));
                        cont++;
                    }
                    catch (SQLException e){
                        //System.out.println("erro: "+e);
                        valid = false;
                        Object[] c1 = new Object[listatemp.size()];
                        c1 = listatemp.toArray();
                        //for (int x=0;x<listatemp.size();x++){c1[x] = listatemp.get(x);}
                        listaRetornada.add(c1);
                    }
                    catch (Exception e){
                        System.out.println("erro: "+e);
                    }
                }
            }
            return listaRetornada;
        } 
        
        catch (SQLException ex) {
            System.out.println("Erro: "+ ex);
            return null;
        }
    }

    // consulta aproximada
    public ArrayList<Object[]> consultarDadosAdv(String tabela,String param[],String valor[], boolean like){

        String sqlParte2="", sql;

        if (param.length == 1){sql = "SELECT * FROM "+tabela+" WHERE "+param[0]+" like ?";}
        else{
            sql = "SELECT * FROM ";
            
            // where ( x=y and q=z )
            
            // adicionar parametros no sql parte2
            for (int x=0; x<param.length-1;x++){
                sqlParte2 += (param[x]+" like ?");
                sqlParte2 += " AND ";
            }
            sqlParte2 += (param[param.length-1]+" like ?");
            
            // juntando o sql ao sql2
            sql += tabela+" WHERE "+sqlParte2;
        }
        try {
            pst = conexao.prepareStatement(sql);
            // adicionando valores dos parametros de pesquisa
            for (int x=0; x<param.length;x++){pst.setString(x+1, ("%"+valor[x]+"%"));}
            
            // executa a query
            rs = pst.executeQuery();
         
            ArrayList<Object[]> listaRetornada = new ArrayList();
            int cont;
            boolean valid;

            while(rs.next()){
                cont=1;
                valid = true;
                ArrayList<Object> listatemp = new ArrayList();
                
                while(valid){
                    try{
                        listatemp.add(rs.getObject(cont));
                        cont++;
                    }
                    catch (SQLException e){
                        //System.out.println("erro: "+e);
                        valid = false;
                        Object[] c1 = new Object[listatemp.size()];
                        c1 = listatemp.toArray();
                        //for (int x=0;x<listatemp.size();x++){c1[x] = listatemp.get(x);}
                        listaRetornada.add(c1);
                    }
                    catch (Exception e){
                        System.out.println("erro: "+e);
                    }
                }
            }
            return listaRetornada;
        } 
        
        catch (SQLException ex) {
            System.out.println("Erro: "+ ex);
            return null;
        }
    }
    
    public boolean checarLoginPorteiro(String nome, String senha){
        String sql = "SELECT * FROM tb_porteiro WHERE nome_porteiro = ? and senha_porteiro = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            boolean resposta = (rs.next())? true: false;
            return resposta;
        }
        catch (Exception e) {
            System.out.println("Erro em checarLogin: "+e);
            return false;
        }
    }
    
    public boolean checarLoginAdm(String nome, String senha){
        String sql = "SELECT * FROM tb_admin WHERE nome_admin = ? and senha_admin = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            boolean resposta = (rs.next())? true: false;
            return resposta;
        }
        catch (Exception e) {
            System.out.println("Erro em checarLogin: "+e);
            return false;
        }
    }
    
    public void inserirDados(String tabela, String[] param, String[] valor){
        
        String sql1="", sql2="", sql;
        
        // adicionando os parametros
        for(int x=0; x<(param.length-1); x++){
            sql1 += param[x];
            sql1 += ","; 
        }
        sql1 += param[param.length-1];
        
        // adicionando ? aos valores
        for(int x=0; x<valor.length-1; x++){
            sql2 += "?";
            sql2 += ",";
        }
        sql2 += "?";
        
        // juntando td
        sql = "insert into "+tabela+" ("+sql1+") values ("+sql2+");";
        try {
            pst = conexao.prepareStatement(sql);
            // adicionando valores aos ?
            for(int x=0; x<(valor.length); x++){
                pst.setString(x+1, valor[x]);}
            
            pst.executeUpdate();
        }
        
        catch (Exception ex) {System.out.println("Erro: "+ ex);}   
    }
 
    public void alterarDados(String tabela, String[] param,String[] valor,
    String[] paramPesquisa,String[] valorPesquisa){
        
        String sql1="", sql2="", sql;
        
        // criando a parte do sql "SET *parametro = valor*"
        if (param.length == 1){sql1 += param[0]+" = ?";}
        else{
            for(int x=0; x<(param.length-1); x++){
                sql1 += param[x]+" = ?";
                sql1 += ","; 
            }
            sql1 += param[param.length-1]+" = ?";
        }
 
        // criando a parte do sql "where *parametroPesquisa = valorPesquisa*"
        if (paramPesquisa.length == 1){sql2 += paramPesquisa[0]+" = ?";}
        else{
            for(int x=0; x<(paramPesquisa.length-1); x++){
                sql2 += paramPesquisa[x]+" = ?";
                sql2 += "AND"; 
            }
            sql2 += param[param.length-1]+" = "+valor[valor.length-1];
        }
        
        // montando o sql final
        sql = "UPDATE "+tabela+" SET "+sql1+" WHERE "+sql2;
        
        // criando o preparedStatement
        try {
            pst = conexao.prepareStatement(sql);
            
            //valor.length = 4
            
            // adicionando strings aos valores a serem mudados
            for(int x=0; x<(valor.length); x++){pst.setString(x+1, valor[x]);}
            
            // adicionando Strings aos valores da condição de pesquisa
            for(int x=0; x<(valorPesquisa.length); x++){
                pst.setString((x+valor.length+1), valorPesquisa[x]);}
            
            pst.executeUpdate();
        }
        
        catch (Exception ex) {System.out.println("Erro: "+ ex);}   
    }
    
    public void deletarRegistro(String tabela, String param, String valor){
        sql = "DELETE FROM "+tabela+" WHERE ("+param+" = ?)";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, valor);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ManipuladorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
