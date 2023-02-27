import java.util.*;

public class RemoveDuplicate{
	public static String removeDuplicate(String str){
		char ch[] = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		for(char c: ch){
			charSet.add(c);
		}
		
		StringBuilder newStr = new StringBuilder();
		for(Character c: charSet){
			newStr.append(c);
		}
		return newStr.toString();
	}

	public static void main(String[]args){
		System.out.println("String without Duplicates: "+ removeDuplicate("AthAthminmin"));
	}
}
//        cromapus
Input:
3 3
O O O
W B B
W O O

Output:
 2 1 1 
-1 0 0 
-1 1 1

Explanation:
The walls at (1,0) and (2,0) are replaced by -1.
The bombs at (1,1) and (1,2) are replaced by 0.
The impact zone for the bomb at (1,1) includes open spaces at index (0,0), (0,1) and (2,1) with distance from bomb calculated as 2,1,1 respectively.
The impact zone for the bomb at (1,2) includes open spaces at index (0,3) and (2,2) with distance from bomb calculated as 1,1 respectively.

Input:
3 3
B W B
W O W
B W B

Output:
0 -1 0
-1 -1 -1
0 -1 0

Explanation:
There is no possible path from the open space to 