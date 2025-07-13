package war;


public class Card {

		private Integer value;
		private String name;
		
		
		public Card(Integer value, String name) {
			this.value = value;
			this.name = name;
		}
	
	public Card() {
		}

	public void describe() {
		System.out.println(this.name);
		}
	

	public Integer getValue() {
		return value;
	}


	


	@Override
	public String toString () {
		return this.name +" with a value of: " + this.value;
	}

}