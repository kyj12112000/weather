import java.util.*;
 
public class SetMain {
 
	public static void main(String[] args) {
		  
		  HashSet set = new HashSet();//순서가 없는 형태
		  LinkedHashSet set2 = new LinkedHashSet();//순서기억
		  Object [] oo = {"1","7","7","3","2","1","1","2","4","3","1","2",new Integer(1)};
		  
		  for(int i=0;i<oo.length;i++)
		  {
		   set.add(oo[i]);//중복된 자료는 입력되지 않는다
		   set2.add(oo[i]);
		  }
		  System.out.println(set);
		  System.out.println(set2);
		  
		  //-----------------------------------빙고
		  
		  HashSet bingo = new HashSet();
		  for(;bingo.size()<25;)
		  {//bingo의 크기가 25까지 돌린다
		   bingo.add((int)(Math.random()*50)+1);
		   //같은값은 입력되지 않고 다른값으로만 25개가 들어감
		   //1---> 50 사이의 경우에 값이 입력됨
		   
		  }
		  
		  System.out.println("빙고");
		  Iterator it = bingo.iterator();
		  for(int i=1;i<=bingo.size();i++)
		  {
		   System.out.print(it.next()+"\t");
		   
		   if(i%5==0)
		    System.out.println();
		   //i가 5일때마다 줄바꿈
		  }
		  
		  //-----------------------------------빙고
		  
		  HashSet lotto = new HashSet();
		  while(lotto.size()<7)
		  {
		   lotto.add((int)(Math.random()*45)+1);
		  }
		  
		  System.out.println("로또");
		  Iterator loit = lotto.iterator();
		  int bo=0;
		  while(loit.hasNext())
		  {
		   bo++;
		   if(bo==7)
		   {
		    System.out.print("보너스:"+loit.next()+"\t");
		   }else{
		    System.out.print(loit.next()+"\t");
		   }
		  }
		  System.out.println();
		  
		  
		 }
		}