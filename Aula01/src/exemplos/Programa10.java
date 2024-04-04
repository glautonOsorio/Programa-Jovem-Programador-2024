package exemplos;

public class Programa10 {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello ");
		sb.append("world");
		
		System.out.println(sb);
		
		
		sb.insert(6, "Javascript ");
		
		System.out.println(sb);
		
		sb.setCharAt(0, 'T');		
		sb.setCharAt(1, 'r');		
		sb.setCharAt(2, 'e');
		
		System.out.println(sb);
		
		sb.delete(5, 16);
		
		System.out.println(sb);
		
		
		
		
		
		
		
		
		

	}

}
