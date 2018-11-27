import java.util.ArrayList;
public class ArrayListGit{
	public static void main(String [] args){
	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
			for (int i = 0; i < 5; i ++)
				list1.add((int)(Math.random()*10)+1);
			for (int i = 0; i < 5; i ++)
				list2.add((int)(Math.random()*10)+1);

		System.out.println(combine(list1,list2));

	}
	public static ArrayList<Integer> combine(ArrayList<Integer> num1, ArrayList<Integer> num2){
		ArrayList<Integer> list3 = new ArrayList<>();

		list3.addAll(num1);
		list3.addAll(num2);
		return list3;
	}
}