package string;

public class StringMethods2 {
	public static void main(String[] args) {
		//indexOf 와 lastIndexOf
		
		String url = "http://www.korea.it.kr/custom/boards";
		
		//첫 인덱스부터 검색해서 매개로 전달된 문자열을 찾는다
		int n1 = url.indexOf("//");
		
		System.out.println(n1);
		
		int n2 = url.lastIndexOf("/");
		
		System.out.println(n2);
		
		String path = url.substring(n2);
		System.out.println(path);		
		
		
		String str1 = "Hello World!";
		String str2 = "HELLO WORLD!";
		
		if (str1.equals(str2)) { //문자열의 일치여부(대소문자 구분)
			System.out.println(str1.toUpperCase());
		}else if(str1.equalsIgnoreCase(str2)){ //문자열의 일치 여부(대소문자 구분안함)
			System.out.println(str1.toLowerCase());
		}else {
			System.out.println(str2);
		}
		
		
		String carts = "potato strawberry garlic";
		String [] array = carts.split(" "); // carts를 공백으로 구분
	     for(int i =0; i< array.length ; i++) {
	    	 System.out.print(array[i] + " ");
	     }
	     
	    System.out.println();
	    System.out.println("==========================");
	    String str = "1,2,3,4,5,6,7,8,9";
	    String[] array2 = str.split(",");
	    
	    System.out.println(array2[0]);
	    for(int i=0; i<array2.length ; i++) {
	        if(i%3==0) {
	        	System.out.println();
	        }
	    	System.out.print(array2[i]) ;
	    
	    
	    	}
	    
	    
	    
	    
	}

}
