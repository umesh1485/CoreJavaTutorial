
public class Test123 {

	public static void main(String[] args) {
		int arr[][][] = new int [2][2][3];
		
			arr[0][0][0] = 111;
			arr[0][0][1] = 222;
			arr[0][0][2] = 333;
			
			arr[0][1][0] = 444;
			arr[0][1][1] = 111;
			arr[0][1][2] = 222;
			
			arr[1][0][0] = 333;
			arr[1][0][1] = 444;
			arr[1][0][2] = 5555;
			
			arr[1][1][0] = 311;
			arr[1][1][1] = 411;
			arr[1][1][2] = 511;
			
			
			
			for(int k=0; k<2; k++){
				
				for(int j=0; j<2;j++){
					
					for(int m=0;m<3;m++){
						
						//System.out.println("for index:  "+ k+" "+j+" "+m);
						System.out.println(arr[k][j][m]);
					}
				}
			}
	}

}
