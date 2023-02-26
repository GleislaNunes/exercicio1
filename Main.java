import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
        int x = 999999999;
        while(da < x){
	    System.out.print("Digite o tamanho do vetor A:");
	    int da = sc.nextInt();
        }
        int x = 999999999;
        while(db < x){
	    System.out.print("Digite o tamanho do vetor B:");
	    int db = sc.nextInt();
        }
        
	    double [] A = new double[da];
	    double [] B = new double[db];
	    int dc= da;
	    double [] C = new double[dc];
	    int indice = 0;
	    
        while(indice < da){
	    System.out.println("Digite os elementos do vetor A:" );

	    for (int i=0; i<da; i++) {
	        System.out.printf( "A[%d] = ", i );
			A[i] = sc.nextInt();
			indice++;
	    }
        }
        int indice = 0;
        while (indice < db){
	    System.out.println("Digite os valores do vetor B:");

	    for (int i=0; i<db; i++) {
	        System.out.printf( "B[%d] = ", i );
	        B[i] = sc.nextInt();
	        indice++;
	    }
        }
	    
	    double soma = 0;
	    for( int i = 0; i < db; i++){
	        soma = soma + B[i];}

	    for (int i=0; i<dc; i++) {
	        C[i] = a[i] + soma;
	    }
	    
	     for (int i=0; i<da; i++) {
	    	System.out.printf("%d\n", A[i]);
	    }
	    
	     for (int i=0; i<db; i++) {
	    	System.out.printf("%d\n", B[i]);
	    }

	    for (int i=0; i<dc; i++) {
	    	System.out.printf("%d\n", C[i]);
	    }

		sc.close();
	}
}