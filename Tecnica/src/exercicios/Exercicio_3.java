package exercicios;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Exercicio_3 {

	public static void main(String[] args) {
		try {
			Gson gson = new Gson();
			FileReader reader = new FileReader("C:\\Users\\enzos\\eclipse-workspace\\Tecnica\\src\\exercicios\\faturamentos.json");

			
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            JsonArray jsonArray = jsonObject.getAsJsonArray("faturamento");
            reader.close();
            
            double[] faturamentoDiario = new double[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonElement element = jsonArray.get(i);
                JsonObject jsonElement = element.getAsJsonObject();
                faturamentoDiario[i] = jsonElement.get("valor").getAsDouble();
            }
			
			
			// O menor valor de faturamento ocorrido em um dia do mês
			double menorFaturamento = faturamentoDiario[0];
			
			for (int i = 0; i < faturamentoDiario.length; i++) {
				if (faturamentoDiario[i] < menorFaturamento && faturamentoDiario[i] != 0.0) {
					menorFaturamento = faturamentoDiario[i];
				}
			}
			
			System.out.println("O valor de menor faturamento diario é de : R$" + menorFaturamento);
			
			// O maior valor de faturamento ocorrido em um dia do mês
			double maiorFaturamento = faturamentoDiario[0];
			
			for (int i = 0; i < faturamentoDiario.length; i++) {
				if (faturamentoDiario[i] > maiorFaturamento && faturamentoDiario[i] != 0.0) {
					maiorFaturamento = faturamentoDiario[i];
				}
			}
			
			System.out.println("O valor de maior faturamento diario é de : R$" + maiorFaturamento);
			
			// Número de dias no mês em que o valor de faturamento diário foi superior à média mensal
			int dias = 0;
			double media = 0, soma = 0; 
			
			for(int i = 0; i < faturamentoDiario.length; i++) {
				if(faturamentoDiario[i] != 0) {
					soma += faturamentoDiario[i];
				}
			}
			
			media = soma / faturamentoDiario.length;
			
			for(int i = 0; i < faturamentoDiario.length; i++) {
				if(faturamentoDiario[i] > media && faturamentoDiario[i] != 0) {
					dias++;
				}
			}
			
			System.out.println("Houveram " + dias + " dias onde o valor do faturamento foi superior que a media de R$" + String.format("%.2f", media));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
