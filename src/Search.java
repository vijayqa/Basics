
public class Search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] search = {10,20,3,6,28,13,41};
		int searchItem = 3;
		boolean s = false;
		//int i;
		for (int i : search)
		{
			if (i == searchItem)
				{
				s = true;
				break;
				}
		}
		if(s)System.out.println("search item " + searchItem + " found in Position");
		else System.out.println("search item not found");

	}

}
