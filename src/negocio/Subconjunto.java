package negocio;

import java.util.HashSet;
import java.util.Set;

public class Subconjunto
{
	private final Set<Offer> objetos;
	private double peso;
	private double beneficio;

	public Subconjunto()
	{
		objetos = new HashSet<>();
		peso = 0;
		beneficio = 0;
	}

	public double peso()
	{
		return peso;
	}

	public double beneficio()
	{
		return beneficio;
	}

	public void agregar(Offer obj)
	{
		objetos.add(obj);
		peso += obj.getPeso();
		beneficio += obj.getBeneficio();
	}

	public void sacar(Offer obj)
	{
		objetos.remove(obj);
		peso -= obj.getPeso();
		beneficio -= obj.getBeneficio();
	}

	public Subconjunto clonar()
	{
		Subconjunto s = new Subconjunto();
		for (Offer o: objetos)
			s.agregar(o);

		return s;
	}

	@Override
	public String toString()
	{
		String s = "{";
		for (Offer o: objetos)
			s += o.getNombre() + ", ";
		
		return s + "}";
	}

	public boolean tieneMayorBeneficioQue(Subconjunto s)
	{
		return s == null || this.beneficio() >= s.beneficio();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Subconjunto otro = (Subconjunto) obj;
		if (objetos.size() != otro.cantidadDeObjetos())
			return false;
		
		for(Offer objeto: objetos) if (otro.contiene(objeto) == false)
			return false;
		
		return true;
	}

	public boolean contiene(Offer objeto)
	{
		return objetos.contains(objeto);
	}

	public int cantidadDeObjetos()
	{
		return objetos.size();
	}
}
