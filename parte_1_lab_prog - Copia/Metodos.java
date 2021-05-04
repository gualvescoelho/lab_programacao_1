package parte_1_lab_prog;

import java.util.Scanner;

public class Metodos {
	
	Get_set dados = new Get_set();
	
	public void atribuir()
	{
		double dist, temp, cons;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a distancia: ");
		dist = entrada.nextDouble();
		dados.setDistancia(dist);
		
		System.out.println("Informe o tempo: ");
		temp = entrada.nextDouble();
		dados.setHoras(temp);
		
		System.out.println("Informe o consumo: ");
		cons = entrada.nextDouble();
		dados.setCombustivel(cons);
		
		entrada.close();
	}
	
	public double calcular_vel_media()
	{
		double temp, dist, vel_media;
		
		temp = dados.getHoras();
		dist = dados.getDistancia();
		
		vel_media = dist / temp;
		
		return vel_media;
	}
	
	public double calcular_rendimento()
	{
		double rendimento, dist, combust;
		
		dist = dados.getDistancia();
		combust = dados.getCombustivel();
		
		rendimento = dist / combust;
		
		return rendimento;
	}
	
	public void calcular_exibir()
	{
		atribuir();
		
		System.out.println("\nVelocidade media aproximada (km/h): " + Math.round(calcular_vel_media()));
		System.out.println("\nConsumo medio aproximado (km/l): " + Math.round(calcular_rendimento()));
	}
}
