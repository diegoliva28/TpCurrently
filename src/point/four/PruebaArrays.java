package point.four;

public class PruebaArrays {

	public static void main(String[] args) {

		String [] alumnos= {"Diego","Rudy","Ariel"};
		float [] nota= {10,4,1};
		
		
		for (int i = 0; i < alumnos.length; i++) {
			  System.out.println("El alumno "+alumnos[i]+ " con la nota "+nota[i]);
			  if((nota[i]>=7)){
				  System.out.println("Esta en condicion de promocionado");				  
			  }else
				  if(nota[i]<7 && nota[i]>=4) {
					  System.out.println("Esta en condicion de aprobado");
			  }else {
				  System.out.println("Esta en condicion de desaprobado");				  
			  }
		}
	}
}
