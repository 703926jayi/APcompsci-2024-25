package Class;

public class Pokemon {

	String name;
	String type;
	int power, defense, level, hp, maxHP;
	boolean isFainted;
	public Pokemon(){
        name = "Pikachu";
        type = "Electric";
        hp = 15;
        power = 6;
        defense = 2;
        isFainted = false;
        maxHP = 15;
        level = 0;
    }

    public Pokemon(String n, String t, int h, int m, int p, int d, int l, boolean f)
	{
		name = n;
        type = t;
        hp = h;
        power = p;
        defense = d;
        isFainted = f;
        maxHP = m;


	}
	public String toString()
	{
		return "\nName:\t" + name + "\nLevel:\t"+ level + "\t\tType:\t\t" + type + "\nPower:\t" 
				+ power + "\t\tDef:\t\t" + defense + "\nHealth:\t"+hp+"/"+maxHP +"\t\tFainted?:\t" + isFainted; 
	}
	public void levelUp()
	{
	          int oldmax = maxHP;
                int oldpow = power;
                int oldef = defense;
                    level++;
                    maxHP = maxHP + (int)((Math.random()* 8) + 1);
                    hp = maxHP;
                     power = power + (int)((Math.random()* 3) + 1);
                    defense = defense + (int)((Math.random()* 3) + 1);
                
                int newh = maxHP - oldmax;
                int newp = power - oldpow;
                int newd = defense - oldef;
                
              System.out.println("LEVEL UP !!!! :3");
              System.out.println(name + " gained " + newh + " health");
              System.out.println(name + " gained " + newp + " power");
              System.out.println(name + " gained " + newd + " defense");
	}

	public void attack(Pokemon enemy)
{
            int normalDamage = power - enemy.getDefense();
            if (enemy.isFainted()==true)
                {
                    System.out.println(enemy.getName()+ " is already fainted!\n");
                }
               
                if( (type=="Electric"&&enemy.getType()=="Fire") || (type=="Grass"&&enemy.getType()=="Electric") || (type=="Water"&&enemy.getType()=="Electric") || (type=="Fire"&&enemy.getType()=="Electric"))
                {
                    System.out.println(name + " attacks " + enemy.getName()+"\n");
                    enemy.setHp(enemy.getHp()-normalDamage);
                    if(enemy.getHp()<=0) enemy.kill();
                }
                if( (type=="Water"&&enemy.getType()=="Fire") || (type=="Electric"&&enemy.getType()=="Water") || (type=="Fire"&&enemy.getType()=="Grass") || (type=="Grass"&&enemy.getType()=="Water") )
                {
                    int doubleDamage = normalDamage*2;
                    System.out.println(name + " attacks " + enemy.getName());
                    System.out.println(enemy.getType() + " is weak against " + type + " and takes 2x damage!");
                    System.out.println(enemy.getName() + " takes " + -doubleDamage + " damage.\n");
                    enemy.setHp(enemy.getHp()-doubleDamage);
                   
                    if(enemy.getHp()<=0) enemy.kill();
                }
                if( (type=="Fire"&&enemy.getType()=="Fire") || (type=="Fire"&&enemy.getType()=="Water") || (type=="Water"&&enemy.getType()=="Grass") || (type=="Water"&&enemy.getType()=="Water") || (type=="Electric"&&enemy.getType()=="Electric") || (type=="Electric"&&enemy.getType()=="Grass") || (type=="Grass"&&enemy.getType()=="Grass") || (type=="Grass"&&enemy.getType()=="Fire"))
                {
                    int halfDamage = normalDamage/2;
                    System.out.println(name + " attacks " + enemy.getName());
                    System.out.println(enemy.getType() + " is strong against " + type + " and takes 0.5x damage!");
                    System.out.println(enemy.getName() + " takes " + -halfDamage + " damage.\n");
                    enemy.setHp(enemy.getHp()-halfDamage);
                    if(enemy.getHp()<=0) {
                        enemy.kill();
                    }
                }

                }
	public void kill()
	{
    
            System.out.println(name + " has fainted");
            isFainted = true;
            hp = 0;
        
	}
	public void heal(int amount)
	{
		if(maxHP>hp){
            if(hp+amount<maxHP&& hp !=0){
                hp = hp+ amount;
                System.out.println(name + " healed " + amount + " hp");
            } else if(hp+amount<maxHP&& hp ==0){
                hp = hp+ amount;
                isFainted = false;
                System.out.println(name + " healed " + amount  + " hp");
            } else if(hp+amount>maxHP){
                System.out.println(name + " healed " + (maxHP-hp) + " hp");
                hp = maxHP;
            } 
        } else{
            System.out.println("This pokemon cannot be healed");
        }
	}


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public boolean isFainted() {
        return isFainted;
    }
    public void setFainted(boolean isFainted) {
        this.isFainted = isFainted;
    }
    
}
