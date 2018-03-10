package blockchain1;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] genesistransaction = {"a gave 10 coins to b" , "b gave 5 coins to c"};
		block genesisblock = new block(0, genesistransaction); 
		       
        String[] block2transaction = {"d gave 50 coins to e" , "e gave 20 coins to f"};
		block block2 = new block(genesisblock.getBlockHash(), block2transaction); 
		             
        String[] block3transaction = {"g gave 100 coins to h" , "h gave 50 coins to i"};
		block block3 = new block(block2.getBlockHash(), block3transaction); 
		
		
        System.out.print("Hash of genesis block:");
        System.out.println(genesisblock.getBlockHash());
        System.out.print("Hash of 2nd block:");
        System.out.println(block2.getBlockHash());
        System.out.print("Hash of 3rd block:");
        System.out.println(block3.getBlockHash());
        
 String[] list1 = {"a", "b" , "c"};
 String[] list2 = {"aa", "b" , "c"};
 
 System.out.println(Arrays.hashCode(list1));
 System.out.println(Arrays.hashCode(list2));
	}

}
