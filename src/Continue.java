
public class Continue {

	public static void main(String[] args) {
		
		int a = 0;
		
		for(int i=0;i<5;i++)
		{
		if (i == 4)
			break;
		if (i%2 == 0)
			continue;
		System.out.println(i);
		}


	}

}
