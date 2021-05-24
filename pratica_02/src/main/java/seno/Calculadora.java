package seno;
import java.math.BigDecimal;
import java.math.MathContext;

public class Calculadora{
	public BigDecimal seno(BigDecimal x, BigDecimal y)  throws Exception {

		/*
		BigDecimal catetoLimiteSuperior = new BigDecimal(50);
		BigDecimal catetoLimiteInferior = new BigDecimal(1);
		BigDecimal hipotenusaLimiteSuperior = new BigDecimal(100);
		BigDecimal hipotenusaLimiteInferior = new BigDecimal(70);
		if(x.compareTo(catetoLimiteSuperior) == 1){ 
			throw new Exception("Cateto deve ser menor que 50!");	
		}
		if(x.compareTo(catetoLimiteInferior) == -1){ 
			throw new Exception("Cateto deve ser maior que 1!");	
		}
		if(y.compareTo(hipotenusaLimiteSuperior) == 1){ 
			throw new Exception("Hipotenusa deve ser menor que 100!");	
		}
		if(y.compareTo(hipotenusaLimiteInferior) == -1){ 
			throw new Exception("Hipotenusa deve ser maior que 70!");	
		}*/
		return new BigDecimal(0); //x.divide(y, MathContext.DECIMAL128);
	}
}