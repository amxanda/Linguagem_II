package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa 
{
	//declaração de atributos
	private String nome;
	private String cnpj;
	private List<Funcionario> funcionario;
	
	//declaração do construtor
	public Empresa(String eNome, String eCnpj)
	{
		this.nome = eNome;
		this.cnpj = eCnpj;
		this.funcionario = new ArrayList<Funcionario>();
	}
	
	public void adicionaFuncionario(Funcionario eFuncionario, int qtd)
	{
		if(this.funcionario.size() < qtd)
		{
			this.funcionario.add(eFuncionario);
		}
	}
	
	//getAll
	public String getNome()
	{
		return this.nome;
	}
	
	public String getCnpj()
	{
		return this.cnpj;
	}
	
	public List<Funcionario>getFuncionario()
	{
		return this.funcionario;
	}
	
	//setAll
	public void setNome(String eNome)
	{
		this.nome = eNome;
	}
	
	public void setCnpj(String eCnpj)
	{
		this.cnpj = eCnpj;
	}
	
	public void setFuncionario(List<Funcionario> eFuncionario)
	{
		this.funcionario = eFuncionario;
	}

}