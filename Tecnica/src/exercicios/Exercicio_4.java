package exercicios;

import java.util.HashMap;
import java.util.Map;

public class Exercicio_4 {

	public static void main(String[] args) {
		Map<String, Double> faturamentoPorEstado = new HashMap<>();

		faturamentoPorEstado.put("SP", 67836.43);
		faturamentoPorEstado.put("RJ", 36678.66);
		faturamentoPorEstado.put("MG", 29229.88);
		faturamentoPorEstado.put("ES", 27165.48);
		faturamentoPorEstado.put("Outros", 19849.53);
		
		double faturamentoTotal = 0;
		for(double valor : faturamentoPorEstado.values()) {
			faturamentoTotal += valor;
		}
		
		Map<String, Double> percentualPorEstado = new HashMap<>();
		
		for(Map.Entry<String, Double> estadoFaturamento : faturamentoPorEstado.entrySet()) {
			String estado = estadoFaturamento.getKey();
			double faturamento = estadoFaturamento.getValue();
			
			double percentual = (faturamento / faturamentoTotal) * 100;
			
			percentualPorEstado.put(estado, percentual);
		}
		
		for (Map.Entry<String, Double> entry : percentualPorEstado.entrySet()) {
            String estado = entry.getKey();
            double percentual = entry.getValue();
            
            String percentualFormatado = String.format("%.2f", percentual);
            
            System.out.println(estado + ": " + percentualFormatado + "%");
        }
	}

}
