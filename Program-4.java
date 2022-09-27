class Frequency {

	public static void main(String[] args) {
		
		int input[]=new int[]{1,2,8,9,12,46,76,82,15,20,30};
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		int g=0;
		int h=0;	
		for(int i=0;i<=input.length-1;i++)
		{
			if(i%2==0)
				a++;
			if(i%3==0)
				b++;
			if(i%4==0)
				c++;
			if(i%5==0)
				d++;
			if(i%6==0)
				e++;
			if(i%7==0)
				f++;
			if(i%8==0)
				g++;
			if(i%9==0)
				h++;				
		}
		System.out.println("1: "+input.length+", 2: "+a+", 3: "+b+", 4: "+c+", 5: "+d+
				", 6: "+e+", 7: "+f+", 8: "+g+", 9: "+h);
	}

}
