package ParseQuery;

public class ParseQuery {
	private String query = "";

	public ParseQuery(String query) {
		this.query = query;
	}

	public ParseQuery() {
		
	}
	
	public String[] getAllQueryWords() {
		return query.replace( "," , "" ).split(" ");
	}

	public String getMainQuery() {
		return query.split(" where ")[0].split(" order by ")[0].split(" group by ")[0];
	}
	
	public String getQueryCondition() {
		String[] conditionWords = query.split(" where ");
		if (conditionWords.length > 1) {
			return conditionWords[1].split(" order by ")[0].split(" group by ")[0];
		} 
		
		return "none";
	}
	
	public String getQueryOrderBy() {
		String[] orderByWords = query.split(" order by ");
		if (orderByWords.length > 1) {
			return orderByWords[1].split(" group by ")[0].split(" where ")[0];
		} 
		
		return "none";
	}
	
	public String getQueryGroupBy() {
		String[] groupByWords = query.split(" group by ");
		if (groupByWords.length > 1) {
			return groupByWords[1].split(" order by ")[0].split(" where ")[0];
		} 
		
		return "none";
	}
	
	public String[] getQueryProjectedFields(String firstKeyword) {
		return query.replace(firstKeyword+" ", "").split(" from ")[0].replace(",","").split(" ");
	}
	
	public String getQueryFileName() {
		String[] words = getMainQuery().split(" from ");
		if (words.length > 1) {
			return words[1];
		}
		
		return "none";
	}
	
	
	
}
