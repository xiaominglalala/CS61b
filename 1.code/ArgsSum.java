public class ArgsSum{
	public static void main(String[] args){
	int index = 0;
	int sum = 0;
	while (index < args.length){
		sum = sum +Integer.parseInt(args[index]);
		index = index +1;
	}
	System.out.println(sum);
	}
}