package model;

public class Funcionario 
{
	private String nome;
	private String cpf;
	private double salario;
	private Empresa empresa;
	
	public Funcionario(String fNome)
	{
		this.nome = fNome;
	}
	
	//getAll
	public String getNome()
	{
		return this.nome;
	}
	
	public String getCpf()
	{
		return this.cpf;
	}
	
	public double getSalario()
	{
		return this.salario;
	}
	
	public Empresa empresa()
	{
		return this.empresa;
	}
	
	//setAll
	public void setNome(String fNome)
	{
		this.nome = fNome;
	}
	
	public void setCpf(String fCpf)
	{
		this.cpf = fCpf;
	}
	
	public void setSalario(double fSalario)
	{
		this.salario = fSalario;
	}
	
	public void setEmpresa(Empresa empresa)
	{
		this.empresa = empresa;
	}
}
