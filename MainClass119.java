public class MainClass119{
	static int e=0,o=0,p=0,ar,prm;
	static int x[]={25,36,44,55,10};
	public static void main(String[] str){
		for(int j=0;j<x.length;j++){		
		if(x[j]%2==0)
			e++;
		else
			o++;
			
		int rev=0,org=x[j],rem=0;
		while( org!=0 ){
			rem= org%10;
			rev= rev*10 + rem;
			org /= 10;
		}
		if(x[j]==rev)
			p++;
		ar=armstrong();
		prm=prime();
		}
		System.out.println("No. of even integers: "+e);
		System.out.println("No. of odd integers: "+o);
		System.out.println("No. of palindromes: "+p);
		System.out.println("No. of armstrong: "+ar);
		System.out.println("No. of prime numbers: "+prm);
		
	}
	public static int armstrong(){
		int org, rem, result = 0,a=0;
		for(int j=0;j<x.length;j++){
		

		org=x[j];

		while (org!= 0){
        rem = org%10;
        result += rem*rem*rem;
        org/= 10;
		}
		if(result==x[j])
			a++;
		}
		return a;
		
	}
	public static int prime(){
		int i, f= 0,pr=0;
		for(int j=0;j<x.length;j++){
		

		for(i=2; i<=x[j]/2; ++i){
        if(x[j]%i==0){
            f=1;
            break;
        }
		}
		if (f==0)
			pr++;
		}
		return pr;
		
		
	}
    
}