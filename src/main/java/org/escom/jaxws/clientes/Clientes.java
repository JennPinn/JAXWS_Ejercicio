package org.escom.jaxws.clientes;

import javax.jws.WebService;

import java.util.List;

@WebService

public interface Clientes {
	
	 Cliente agregarCliente(Cliente cliente);
	
	 List<Cliente> obtenerClientes();
	
	 Cliente eliminarCliente(int id);
	
	 Cliente actualizarCliente(int idCliente, Cliente cliente);
	
	 Cliente obtenerClienteId(int id);
	

}
