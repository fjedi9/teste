package br.com.vepilef.util;

import java.time.LocalDate;
import java.time.Period;

import br.com.vepilef.model.Cliente;

public class CalcularIdade {
	public static int idade(Cliente cliente) {
		
		return(int) Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
	}
}
