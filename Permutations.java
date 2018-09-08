import java.util.*;
class Permutations{
	ArrayList<String> allpermutations;	
	Permutations(int n){
		n=fact(n);
		allpermutations=new ArrayList<String>(n);
	}
	public String[] permutations(String s){
		permutations(s.toCharArray(),0,s.length()-1);
		return allpermutations.toArray(new String[allpermutations.size()]);
	}
	/*public ArrayList<String> permutations(String s){
		permutations(s,0,s.length()-1,0);
		return allpermutations;
	}*/
	public void permutations(char[] s,int i,int j){
		if(i==j){
			allpermutations.add(new String(s));
			return ;
		}
		for(int k=i;k<=j;k++){
			swap(s,i,k);
			permutations(s,i+1,j);
			swap(s,i,k);
		}
	}
	private void swap(char[] s,int i,int j){
		char c=s[i];
		s[i]=s[j];
		s[j]=c;
	}
	private int fact(int n){
		if(n==1)
			return 1;
		return n*(n-1);
	}
	/*public static void main(String []args){
		Permutations p=new Permutations(3);
		String s[]=p.permutations("abc");
		System.out.println(Arrays.toString(s));
	}*/
}
