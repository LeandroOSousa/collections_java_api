package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	// atributo
	List<Integer> numerosList;

	public OrdenacaoNumeros() {
		this.numerosList = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		numerosList.add(numero);
	}

	public List<Integer> ordenarAscendente() {
		List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
		Collections.sort(numerosAscendentes);
		return numerosAscendentes;
	}

	public List<Integer> ordenarDescendente() {
		List<Integer> numerosDescendente = new ArrayList<>(this.numerosList);
		numerosDescendente.sort(Collections.reverseOrder());
		return numerosDescendente;
	}
	
	 public void exibirNumeros() {
		    if (!numerosList.isEmpty()) {
		      System.out.println(this.numerosList);
		    } else {
		      System.out.println("A lista está vazia!");
		    }
		  }

		  public static void main(String[] args) {
		    // Criando uma instância da classe OrdenacaoNumeros
		    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

		    // Adicionando números à lista
		    numeros.adicionarNumero(2);
		    numeros.adicionarNumero(5);
		    numeros.adicionarNumero(4);
		    numeros.adicionarNumero(1);
		    numeros.adicionarNumero(99);

		    // Exibindo a lista de números adicionados
		    numeros.exibirNumeros();

		    // Ordenando e exibindo em ordem ascendente
		    System.out.println(numeros.ordenarAscendente());

		    // Exibindo a lista
		    numeros.exibirNumeros();

		    // Ordenando e exibindo em ordem descendente
		    System.out.println(numeros.ordenarDescendente());

		    // Exibindo a lista
		    numeros.exibirNumeros();
		  }
		}