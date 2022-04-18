package util;

	public class CurrencyConverter {
		
		public static double price;
		public static double quantity;
		
		public static double amount() {
			return price * quantity * 1.06;
		}
}
