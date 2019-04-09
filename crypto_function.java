public class crypto_function{
	
	
	public String encrypt(String message, String keyy) {
		for(int count=0;count<100000000;count++) {
			
		}
//		System.out.println("Original Message : " + message);
		String enc_msg = "";
		String dec_msg = "";
		char msg[] = message.toCharArray();
		char key[] = keyy.toCharArray();
		int msgLen = msg.length, i, j;
		
		char newKey[] = new char[msgLen];
		char encryptedMsg[] = new char[msgLen];		
		//generate new key in cyclic manner equal to the length of original message
		for(i = 0, j = 0; i < msgLen; ++i, ++j){
			if(j == key.length)
				j = 0;
			
			newKey[i] = key[j];
		}
		
		//encryption
		for(i = 0; i < msgLen; ++i) {
			encryptedMsg[i] = (char)(((msg[i] + newKey[i]) % 26) + 'A');
			enc_msg += encryptedMsg[i];
		}
//		System.out.println("Encrypted message : " + enc_msg);
		//decryption
		for(i = 0; i < msgLen; ++i)
			dec_msg += (char)((((encryptedMsg[i] - newKey[i]) + 26) % 26) + 'A');
//		System.out.println("Decrypted Message : " + dec_msg);
		return dec_msg;
	}
//	public static void main(String args[]) {
//		crypto_function obj = new crypto_function();
//		obj.encrypt("ANURAGSHARMA","ANU");
//		
//	}

}