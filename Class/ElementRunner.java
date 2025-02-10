package Class;

public class ElementRunner {

	
	public static void main(String[] args) {
		System.out.println("Combination # 1 - Hydrogen and Oxygen");
		Element hydrogen = new Element();
		Element oxygen = new Element("Oxygen", true, -2, "O");
		hydrogen.combine(oxygen);
		System.out.println("\nCombination # 2 - Helium and Einsteinium");
		Element helium =new Element("Helium", "He", 0);
		Element einsteinium = new Element("Einsteinium", false,  -4, "Es");
		helium.combine(einsteinium);
		System.out.println("\nCombination # 3 - Manganese and Fluorine");
		Element manganese = new Element("Manganese", "Mn", 7);
		Element fluorine = new Element("Fluorine", "F", -1);
		manganese.combine(fluorine);
		System.out.println("\nCombination # 4 - Silicon and Hydrogen");
		Element silicon = new Element();
		silicon.setName("Silicon");	
		silicon.setValence(-4);
		silicon.setSymbol("Si");
		silicon.combine(hydrogen);
		System.out.println("\nCombination # 5 - Copernicium and Nitrogen");
		Element copernicium = new Element("Copernicium", false,  2, "Cn");
		Element nitrogen = new Element("Nitrogen", "N", 5);
		copernicium.combine(nitrogen);
		System.out.println("\nCombination # 6 - Gold and Carbon");
		Element gold = new Element("Gold", true, -6, "Au");
		Element carbon = new Element("Carbon", "C", 4);
		gold.combine(carbon);
		System.out.println("\nCombination # 7 - Boron and Carbon");
		Element boron = new Element("Boron", true, -3, "B");
		boron.combine(carbon);
	
	}

}