package br.com.easycond.rn;

import java.util.List;

import br.com.easycond.daointerf.UsuarioDAOInterf;
import br.com.easycond.model.Usuario;
import br.com.easycond.util.DAOFactory;

public class UsuarioRN {
	
	private UsuarioDAOInterf usuarioDAO;
	
	public UsuarioRN() {
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}
	
	public Usuario carregar(Integer codigo) {
		return this.usuarioDAO.carregar(codigo);
	}
	
	public List<Usuario> listar() {
		return this.usuarioDAO.listar();
	}
	
	public void salvar(Usuario usuario) {
		Integer codigo = usuario.getCodigo();
		
		if(codigo == null || codigo == 0) {
			this.usuarioDAO.salvar(usuario);
		} 
		else {
			this.usuarioDAO.atualizar(usuario);
		}
	}
	
	public void excluir(Usuario usuario) {
		this.usuarioDAO.excluir(usuario);
	}

}