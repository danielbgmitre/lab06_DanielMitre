package loja;

import usuario.Usuario;
import usuario.UsuarioCollection;
import jogo.Jogo;
import excecoes.*;

public class Loja {
	private UsuarioCollection usuarios;
	
	public Loja(){
		usuarios = new UsuarioCollection();
	}
	
	public boolean addUsuario(Usuario user) throws DuplicatedUsernameException, InvalidFieldValueException {
		if (usuarios.hasUsuario(user)){
			throw new DuplicatedUsernameException();
		} else {
			usuarios.add(user);
			return true;
		}
	}
	
	public void fazUpgrade(String username) throws InvalidFieldValueException, UserNotFoundException{
		fazUpgrade(usuarios.get(username));
	}
	
	public void fazUpgrade(Usuario user) throws InvalidFieldValueException, UserNotFoundException {
		if (usuarios.hasUsuario(user)){
			user.upgrade();
		} else {
			throw new UserNotFoundException();
		}
	}
	
	public boolean addMoney(String username, double money) throws InvalidFieldValueException, UserNotFoundException {
		if (usuarios.hasUsuario(username)){
			return usuarios.get(username).addMoney(money);
		} else {
			throw new UserNotFoundException();
		}
		
	}
	
	public boolean vendeJogo(String username, Jogo jogo) throws InvalidFieldValueException, UserNotFoundException {
		if (usuarios.hasUsuario(username)){
			return usuarios.get(username).compraJogo(jogo);
		} else {
			throw new UserNotFoundException();
		}
	}
	
	public void listarUsuarios(){
		System.out.println("=== Central P2-CG ===\n");
		usuarios.listarUsuarios();
	}
}
