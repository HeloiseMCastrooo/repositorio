package br.org.filmeseseries.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;
import br.org.filmeseseries.controller.Conexao;
import br.org.filmeseseries.model.Filme;
import br.org.filmeseseries.model.Filme;
import br.org.filmeseseries.model.Filme;
import br.org.filmeseseries.model.Filme;

public class CrudDAO {
		//create 
	public void create(Filme filme) {
	String sql = "INSERT INTO  filmeseseries (titulo, genero, classificacao, ator) VALUES (?, ?, ?, ?)";/////
	Connection conn = null;
	PreparedStatement p = null;
	try {
		conn = Conexao.criandoConexao();
		p = (PreparedStatement) conn.prepareStatement(sql); ///cast
		p.setString(1, filme.getTitulo());///
		p.setString(2, filme.getGenero());///
		p.setFloat(3, filme.getClassificacao());//
		p.setString(4, filme.getAtor());//
		p.execute();
	}catch (Exception e) {
		JOptionPane.showMessageDialog(null, "erro ao inserir dados! \nERRO: " + e);
	}finally {
		try {
			if(p != null);
			p.close();
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
}//fim create
	//update
	public void update(Filme filme) {/////
		String sql = "UPDATE filmeseseries SET  genero = ?, classificacao = ?, ator = ? WHERE titulo = ?";///
		Connection conn = null;
		PreparedStatement p = null;
		try {
			conn = Conexao.criandoConexao();
			p = (PreparedStatement) conn.prepareStatement(sql);
			p.setString(1, filme.getTitulo());///
			p.setString(2, filme.getGenero());////
			p.setFloat(3, filme.getClassificacao());////
			p.setString(4, filme.getAtor());///
			p.execute();
			JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!" );
			System.out.println("Dados atualizados com sucesso!");
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, "Erro ao inserir os dados! \nERRO: " + e );
		}finally {
			try {
				if(p != null);
				p.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}//fim update
	
	//read
	public List<Filme> read(){
		String sql = "SELECT * FROM seriesefilmes";
		List<Filme> seriesefilmes = new ArrayList<Filme>();
		Connection conn = null;
		PreparedStatement p = null;
		ResultSet resultado = null;
	try {
		conn = Conexao.criandoConexao();
		p = (PreparedStatement) conn.prepareStatement(sql);
		resultado = p.executeQuery();
		while(resultado.next()) {
			Filme ver_filme = new Filme();
			ver_filme.setTitulo(resultado.getString("titulo"));//
			//recuperar o genero
			ver_filme.setGenero(resultado.getString("genero"));///
			//recuperar classificacao
			ver_filme.setClassificacao(resultado.getInt("classificacao"));///
			//recuperar ator
			ver_filme.setAtor(resultado.getString("ator"));
			//add na lista
			seriesefilmes.add(ver_filme);///		
		}
	} catch(Exception e ) {
		e.printStackTrace();
	}finally{
		try {
		if(p != null);
		p.close();
	}catch(Exception e ) {
		e.printStackTrace();
	}
	}return seriesefilmes;
}//fim read
	//delete
	public boolean delete (String titulo) {
		String sql = "DELETE FROM seriesefilmes  WHERE titulo = ?";
		Connection conn = null;
		PreparedStatement p  = null;
		try {
		conn = Conexao.criandoConexao();
		p = (PreparedStatement) conn.prepareStatement(sql);
		p.setString(1, titulo);
		p.execute();
		JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!" );
		System.out.println("Dados excluidos com sucesso!");
			
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, "Erro ao excluir os dados! \nERRO: " + e );
		}finally{
			try {
				if(p != null);
				p.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}
	}//fim finally
		return false;
	}//fim delete
}
