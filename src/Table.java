//CHRIS TUFENKJIAN
//COMP282 ASSIGNMENT 1

import java.util.TreeMap;

public  class Table <K extends Comparable<K>, T>  
{											      
	TreeMap<K,T> tree	   = new TreeMap<K,T>();  
	TreeMap<K,T> treeclone = new TreeMap<K,T>();
	
  public boolean isEmpty()
  {
	if (tree.size()>0)						
		return false;
	return true;
  }
  
   public int size()						
   {
	   return tree.size();   
   }
	
   public void tableInsert(K key, T item) 	throws TableException //insert method with exception
   {
	   if(tree.get(key) != null)
		   throw new TableException
		   			("ERROR, THIS KEY ALREADY EXISTS.");
	   else
		   tree.put(key, item);   
   }

   public boolean tableDelete(K key)		
   {
	   if (tree.size() > 0)
	   {
		   tree.remove(key);
		   return true;
	   }
	   else return false;
   };
   
   public T tableRetrieve(K key)
   {
	   return tree.get(key);
   }
   
@SuppressWarnings("unchecked")
public void printTable()
   {										
	   treeclone = (TreeMap<K, T>)tree.clone();
	   int n = treeclone.size();
	   for (int i = 0; i<n; i++)
	   {
		  System.out.println(treeclone.pollFirstEntry());
	   }
   }
}