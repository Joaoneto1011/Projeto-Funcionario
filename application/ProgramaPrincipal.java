package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoPorHora;
import entities.Departamento;
import entities.Funcionario;
import entities_enums.NivelTrabalhador;

public class ProgramaPrincipal {
	
	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Insira os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		
		System.out.print("Nivel: ");
		String nivelTrabalhador = sc.nextLine();
		
		System.out.print("Salario Base: ");
		double salarioBase = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		
		System.out.print("Quantos contratos esse funcionario tem? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Insira os dados do" + i + " contrato:");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Horas de duração: ");
			int horas = sc.nextInt();
			
			ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorPorHora, horas);
			funcionario.adicionarContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Insira o mes e o ano para calcular a renda (MM/YYYY): ");
		String mes_ano = sc.next();
		
		int mes = Integer.parseInt(mes_ano.substring(0, 2));
		int ano = Integer.parseInt(mes_ano.substring(3));
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
		System.out.println("Renda para " + mes_ano + ": " + String.format("%.2f", funcionario.renda(ano, mes)));
		
		sc.close();
	}

}
