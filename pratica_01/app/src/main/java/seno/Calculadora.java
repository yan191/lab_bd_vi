package seno;

public class Calculadora{
	public float seno(float x, float y)  throws Exception {
		if (x == 0 || y == 0) {
			throw new Exception("Não pode ter zero!");
		}
		if (x < 0 || y < 0) {
			throw new Exception("Não pode ser negativo!");
		}
		return x/y;
	}
}