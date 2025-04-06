package methods;

public class MathEx {

	public static void main(String[] args) {
		// Math 클래스의 주요 메서드 사용
		// 절대값
		int v1 = Math.abs(-10);
		System.out.println("v1 = "+v1);
		
		// 반올림 
		long v2 = Math.round(5.68);
		System.out.println("v2 = "+v2);
		
		//내림
		double v3 = Math.floor(2.3);
		System.out.println("v3 = "+v3);
		
		//난수 (0.0 <= random < 1.0)
	    double v4 = Math.random();
	    System.out.println("random = "+v4);
	    
	    //동전 던지기
	    int coin = (int)(Math.random() * 2);
	    System.out.println(coin);
         
	    if(coin == 0) {
	    	System.out.println("앞면");
	    }else {
	    	System.out.println("뒷면");
	    }
	    
	    //주사위
	    	    
	    for(int i=1 ; i<11; i++) {
	    	int dice = (int)(Math.random()*6) + 1;
	    	System.out.print(dice + " ");
	    }
	    System.out.println();
	    //문자열을 랜덤하게
	    String[] word = {"나","너","우리","세계","우주"};
	    int index = (int)(Math.random()*word.length);
	    
	    System.out.println(index +" " + word[index]);
	    
	    
	    
	}

}
