package Assignments;
import java.util.*;
class Program7 {
	public  void Subsets(List<List<Integer> > subset, int [] nums, ArrayList<Integer> output, int index)
	{
		if (index == nums.length) {
			subset.add(output);
			return;
		}
		Subsets(subset, nums, new ArrayList<>(output), index + 1);
		output.add(nums[index]);
		Subsets(subset, nums, new ArrayList<>(output), index + 1);
	}

	public static void main(String[] args)
	{
        Scanner s=new Scanner(System.in);
		List<List<Integer> > subset = new ArrayList<>();
        System.out.println("Enter the no of Elements:");
        int n=s.nextInt();
		int arr[]=new int[n];
        System.out.println("Enter the list:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Program7 prgm=new Program7();
		prgm.Subsets(subset, arr, new ArrayList<>(), 0);
		
		for (int i = 0; i < subset.size(); i++) {
			System.out.println(subset.get(i));
		}
        s.close();
	}
}
