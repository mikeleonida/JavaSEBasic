package ParseQuery;

public class Main {

	public static void main(String[] args) {
		String[] queries = { "Select name, age, where_city, from_city, order_by_city, "
				+ "city_where from data.csv where age > 40 order by name group by city",
				"Select name, age from data.csv where age > 40 order by name",
				"Select name, age from data.csv where age > 40",
				"Select name, age from data.csv",
				"Select name, age from data.csv order by name group by city",
				"Select name, age from data.csv order by name",
				"Select name, age from data.csv group by city" };
		
		for (int i = 0; i<queries.length; i++) {
			ParseQuery pq = new ParseQuery(queries[i]);
			
			System.out.println("*************************");
			System.out.print("Ex. 1 ");
			for (String word : pq.getAllQueryWords()) {
				System.out.println("Word : " + word);
			};
			
			System.out.println("Ex. 2 Main query = " + pq.getMainQuery());
			
			System.out.println("Ex. 3 Query condition = " + pq.getQueryCondition());
			
			System.out.println("Ex. 4 Order By = " + pq.getQueryOrderBy());
			
			System.out.println("Ex. 5 Group By = " + pq.getQueryGroupBy());
			
			System.out.println("Ex. 6 Projected Fields: ");
			for (String word : pq.getQueryProjectedFields("Select")) {
				System.out.println("\t" + word);
			}
			
			System.out.println("Ex. 7 File name = " + pq.getQueryFileName());
		}
	}

}
