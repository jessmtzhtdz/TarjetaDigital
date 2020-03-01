package org.certificatic.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetaDigital.model.Tarjeta;

@WebService
public interface TarjetaService {
	/**
	 * Método para crear una tarjeta nueva
	 * @param tarjeta
	 * @return tarjeta creada
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	/**
	 * Método para obtener todas las tarjetas
	 * @return
	 */
	List<Tarjeta> obtenerTodas();

}
