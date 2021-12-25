class ValueIn2Line{
	public static void main(String[] userName){
		byte i =0;
		for(int id = 0; id < userName.length; id= id+1){
			if(id<=userName.length/2){
				System.out.print(userName[id]+" ");
			}else{
				if(id<=userName.length){
				if(i==0){
					System.out.println();
				}
					System.out.print(userName[id]+" ");
					i =1;
					}
				}
			}
	}
}