package loop;

public class ForEx2 {

	public static void main(String[] args) {
		// 문자 세트 -아스키 , 유니코드
		char ch;
//        ch =97;
         for(ch=65; ch <123; ch++) {
        		System.out.print(ch+" ");
         }
         
         System.out.println();
         
         //한글 출력
         for (ch=12593; ch<12686; ch++) {
        	 System.out.print(ch+" ");
         }
         System.out.println();
         
         //구구단 출력
         
         int dan = 6;
         for (int i =1 ; i<10 ;i++) {
        	 System.out.println(dan + "x"+i+"="+(dan*i));
         }
	}

}
