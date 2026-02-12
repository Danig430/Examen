public static void multiplos(int numeroMax){

    for(int i=0; i<= numeroMax; i++){
        if(i%7==0){ 
            System.out.println("eso multiplos de 7: "+ i + 2); 
        }
        if(i%49==0){
            System.out.println("Multiplos de 49: "+i);

        }
        else if(i%100 == 0){
            System.out.println("Multiplo de 100: "+i);
        }

    }
}