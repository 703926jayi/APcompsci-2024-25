package Class;

public class CookieRunner {

	public static void main(String[] args) {
		Cookie c1 = new Cookie();
		Cookie c2 = new Cookie("Sugar cookie", 85, 12, false);
		Cookie c3 = new Cookie("No-bake cookie", 60, 6, false);
		Cookie c4 = new Cookie("Oreo", 75, 0, true);
		Cookie c5 = new Cookie("Chips Ahoy", 90, 0, true);
		//output the cost of all cookies
                System.out.println(c1.calculateCost());
                System.out.println(c2.calculateCost());
                System.out.println(c3.calculateCost());
                System.out.println(c4.calculateCost());
                System.out.println(c5.calculateCost());
		//output c3 and c5
                System.out.println(c3);
                System.out.println(c5);
		//output the numCookies data field
                System.out.println(Cookie.getNumCookies());
		//choose some cookies
		c2.choose(c3);
		c4.choose(c1);
		c5.choose(c2);
	}

}
