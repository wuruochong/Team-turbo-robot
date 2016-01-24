public abstract class Pokemon {
    protected String Type1;
    protected String Type2;
    protected int _hitPtsb;
    protected int _hitPts;
    protected int _exp;
    protected int _lvl;
    protected int _atkb;
    protected int _atk;
    protected int _defb;
    protected int _def;
    protected int _spdb;
    protected int _spd;
    protected int _spb;
    protected int _sp;
    protected String _name;
    protected int PP1;
    protected int PP2;
    protected int PP3;
    protected int PP4;

    public Pokemon(){
	_hitPtsb = 20;
	_exp = 0;
	_lvl = 1;
	_atkb = 30;
	_defb = 30;
	_spdb = 30;
	_spb = 30;
	_name = "MissingNo.";
    }

    //=========Stat Calculators=========
    
    public int HPCalc(){
	return (((getHP() * 2 * getLvl()) / 100)+ getLvl()+ 10);
    }

    public int statCalc(int stat){
	return (((stat * 2 * getLvl())/100) + 5);
    }
    
    public int IVgen(){
	return (int)(Math.random()*16);
    }

    public void setStats(){
	_atkb += IVgen();
	_defb += IVgen();
	_spdb += IVgen();
	_spb += IVgen();
	_hitPtsb+= IVgen();
	_hitPts = HPCalc();
	_atk = statCalc(_atkb);
	_def = statCalc(_defb);
	_spd = statCalc(_spdb);
	_sp = statCalc(_spb);
    }
    
    //=========Accessors=========
    
    public String getName(){
	return _name;
    }

    public String getType1(){
	return Type1;
    }

    public String getType2(){
	return Type2;
    }
    
    public int getHP(){
	return _hitPts;
    }

    public int getExp(){
	return _exp;
    }

    public int getLvl(){
	return _lvl;
    }

    public int getAtk(){
	return _atk;
    }

    public int getDef() {
	return _def;
    }


    public int getSpd(){
	return _spd;
    }

    public int getSp(){
	return _sp;
    }

    public int getPP1(){
	return PP1;
    }

    public int getPP2(){
	return PP2;
    }

    public int getPP3(){
	return PP3;
    }

    public int getPP4(){
	return PP4;
    }

    //=========Mutators=========
    
    public void setHP(int x){
	_hitPts = x;
    }

    public void setexp(int x){
	_exp = x;
    }

    public void setlvl(int x){
	_lvl = x;
    }

    public void setatk(int x){
	_atk = x;
    }

    public void setdef(int x){
	_def = x;
    }

    public void setspd(int x){
	_spd = x;
    }

    public void setsp(int x){
	_sp = x;
    }

    public void setPP1(int x){
	PP1 = x;
    }
    public void setPP2(int x){
	PP2 = x;
    }
    public void setPP3(int x){
	PP3 = x;
    }	  
    public void setPP4(int x){
	PP4 = x;
    }
  
    //=========Other Methods=========
    public boolean isAlive(){
	return _hitPts > 0;
    }

    public String toString(){
	return getName()+"\t Lvl "+getLvl()+"\n HP: "+getHP();
    }
    
    public void lowerHP(int damage){
    	setHP(getHP()-damage);
    }
    
    public abstract int ReadMove(int x,Pokemon a);
    public abstract String PrintMoves();
    public abstract void HealPP();
    public void Heal(){
	_hitPts = HPCalc();
	_atk = statCalc(_atkb);
	_def = statCalc(_defb);
	_spd = statCalc(_spdb);
	_sp = statCalc(_spb);
	HealPP();
    }

    public int damageCalc(Pokemon a,int base){
	int num = (2 * getLvl() + 10) * getAtk() * base;
	int den = (250* a.getDef());
	return (int)(num/den + 2);
    }

    public int damageCalcsp(Pokemon a, int base){
	int num = (2 * getLvl() + 10) * getSp() * base;
	int den = (250* a.getSp());
	return (int)(num/den + 2);
    }

    public double Effective(Pokemon a,String type){
	double retint = 1;
	if (type.equals("Normal")){
	    if ( (a.getType1()).equals("Ghost")
		 || (a.getType2()).equals("Ghost"))
		retint *= 0;
	    else if ( (a.getType1()).equals("Rock")
		      || (a.getType2()).equals("Rock"))
		retint *= 0.5;
	}
	else if (type.equals("Fire")){
	    if ( (a.getType1()).equals("Fire")
		 || (a.getType1()).equals("Water")
		 || (a.getType1()).equals("Rock")
		 || (a.getType1()).equals("Dragon"))
		retint *= 0.5;
	    if ( (a.getType2()).equals("Fire")
		 || (a.getType2()).equals("Water")
		 || (a.getType2()).equals("Rock")
		 || (a.getType2()).equals("Dragon"))
		retint *= 0.5;
	    if ( (a.getType1()).equals("Grass")
		 || (a.getType1()).equals("Ice")
		 || (a.getType1()).equals("Bug"))
		retint *= 2;
	    if ( (a.getType2()).equals("Grass")
		 || (a.getType2()).equals("Ice")
		 || (a.getType2()).equals("Bug"))
		retint *= 2;
	}
	else if (type.equals("Water")){
	    if ( (a.getType1()).equals("Fire")
		 || (a.getType1()).equals("Ground")
		 || (a.getType1()).equals("Rock"))
		retint *= 2;
	    if ( (a.getType2()).equals("Fire")
		 || (a.getType2()).equals("Ground")
		 || (a.getType2()).equals("Rock"))
		retint *= 2;
	    if ( (a.getType1()).equals("Water")
		 || (a.getType1()).equals("Grass")
		 || (a.getType1()).equals("Dragon"))
		retint *= 0.5;
	    if ( (a.getType2()).equals("Water")
		 || (a.getType2()).equals("Grass")
		 || (a.getType2()).equals("Dragon"))
		retint *= 0.5;
	}
	else if (type.equals("Electric")){
	    if ( (a.getType1()).equals("Ground")
		 || (a.getType2()).equals("Ground"))
		retint *= 0;
	    if ( (a.getType1()).equals("Electric")
		 || (a.getType1()).equals("Grass")
		 || (a.getType1()).equals("Dragon"))
		retint *= 0.5;
	    if ( (a.getType2()).equals("Electric")
		 || (a.getType2()).equals("Grass")
		 || (a.getType2()).equals("Dragon"))
		retint *= 0.5;
	    if ( (a.getType1()).equals("Water")
		 || (a.getType1()).equals("Flying"))
		retint *= 2;
	    if ( (a.getType2()).equals("Water")
		 || (a.getType2()).equals("Flying"))
		retint *= 2;
	}
	else if (type.equals("Grass")){
	    if ( (a.getType1()).equals("Water")
		 || (a.getType1()).equals("Ground")
		 || (a.getType1()).equals("Rock"))
		retint *= 2;
	    if ( (a.getType2()).equals("Water")
		 || (a.getType2()).equals("Ground")
		 || (a.getType2()).equals("Rock"))
		retint *= 2;
	    if ( (a.getType1()).equals("Fire")
		 || (a.getType1()).equals("Grass")
		 || (a.getType1()).equals("Poison")
		 || (a.getType1()).equals("Bug")
		 || (a.getType1()).equals("Dragon"))
		retint *= 0.5;
	    if ( (a.getType2()).equals("Fire")
		 || (a.getType2()).equals("Grass")
		 || (a.getType2()).equals("Poison")
		 || (a.getType2()).equals("Bug")
		 || (a.getType2()).equals("Dragon"))
		retint *= 0.5;
	}
	else if (type.equals("Ice")){
	    if ( (a.getType1()).equals("Water")
		 || (a.getType1()).equals("Ice"))
		retint *= 0.5;
	    if ( (a.getType2()).equals("Water")
		 || (a.getType2()).equals("Ice"))
		retint *= 0.5;
	    if ( (a.getType1()).equals("Grass")
		 || (a.getType1()).equals("Ground")
		 || (a.getType1()).equals("Flying")
		 || (a.getType1()).equals("Dragon"))
		retint *= 2;
	    if ( (a.getType2()).equals("Grass")
		 || (a.getType2()).equals("Ground")
		 || (a.getType2()).equals("Flying")
		 || (a.getType2()).equals("Dragon"))
		retint *= 2;
	}
	else if (type.equals("Fighting")){
	    if ( (a.getType1()).equals("Ghost")
		 || (a.getType2()).equals("Ghost"))
		retint *= 0;
	    if ( (a.getType1()).equals("Poison")
		 || (a.getType1()).equals("Psychic")
		 || (a.getType1()).equals("Flying")
		 || (a.getType1()).equals("But"))
		retint *= 0.5;
	    if ( (a.getType2()).equals("Poison")
		 || (a.getType2()).equals("Psychic")
		 || (a.getType2()).equals("Flying")
		 || (a.getType2()).equals("But"))
		retint *= 0.5;
	    if ( (a.getType1()).equals("Normal")
		 || (a.getType1()).equals("Ice")
		 || (a.getType1()).equals("Rock"))
		retint *= 2;
	    if ( (a.getType2()).equals("Normal")
		 || (a.getType2()).equals("Ice")
		 || (a.getType2()).equals("Rock"))
		retint *= 2;
	}
	else if (type.equals("Poison")){
	    if ( (a.getType1()).equals("Poison")
		 || (a.getType1()).equals("Ground")
		 || (a.getType1()).equals("Rock")
		 || (a.getType1()).equals("Ghost"))		
		retint *= 0.5;
	    if ( (a.getType2()).equals("Poison")
		 || (a.getType2()).equals("Ground")
		 || (a.getType2()).equals("Rock")
		 || (a.getType2()).equals("Ghost"))		
		retint *= 0.5;
	    if ( (a.getType1()).equals("Grass")
		 || (a.getType1()).equals("Bug"))		
		retint *= 2;
	    if ( (a.getType2()).equals("Grass")
		 || (a.getType2()).equals("Bug"))		
		retint *= 2;
	}
	else if (type.equals("Ground")){
	    if ( (a.getType1()).equals("Flying")
		 || (a.getType2()).equals("Flying"))
		retint *= 0;
	    if ( (a.getType1()).equals("Poison")
		 || (a.getType1()).equals("Fire")
		 || (a.getType1()).equals("Rock")
		 || (a.getType1()).equals("Electric"))		
		retint *= 2;
	    if ( (a.getType2()).equals("Poison")
		 || (a.getType2()).equals("Fire")
		 || (a.getType2()).equals("Rock")
		 || (a.getType2()).equals("Electric"))		
		retint *= 2;
	    if ( (a.getType1()).equals("Grass")
		 || (a.getType1()).equals("Bug"))		
		retint *= 0.5;
	    if ( (a.getType2()).equals("Grass")
		 || (a.getType2()).equals("Bug"))		
		retint *= 0.5;
	}
	else if (type.equals("Flying")){
	    if ( (a.getType1()).equals("Grass")
		 || (a.getType1()).equals("Fighting")
		 || (a.getType1()).equals("Bug"))
		retint *= 2;
	    if ( (a.getType2()).equals("Grass")
		 || (a.getType2()).equals("Fighting")
		 || (a.getType2()).equals("Bug"))
		retint *= 2;
	    if ( (a.getType1()).equals("Electric")
		 || (a.getType1()).equals("Rock"))
		retint *= 0.5;
	    if ( (a.getType2()).equals("Electric")
		 || (a.getType2()).equals("Rock"))
		retint *= 0.5;
	}
	else if (type.equals("Psychic")){
	    if ( (a.getType1()).equals("Fighting")
		 || (a.getType1()).equals("Poison"))
		retint *= 2;
	    if ( (a.getType2()).equals("Fighting")
		 || (a.getType2()).equals("Poison"))
		retint *= 2;
	    if ( (a.getType1()).equals("Psychic")
		 || (a.getType2()).equals("Psychic"))
		retint *= 0.5;
	}
	else if (type.equals("Bug")){
	    if ( (a.getType1()).equals("Fire")
		 || (a.getType1()).equals("Fighting")
		 || (a.getType1()).equals("Flying")
		 || (a.getType1()).equals("Ghost"))		
		retint *= 0.5;
	    if ( (a.getType2()).equals("Fire")
		 || (a.getType2()).equals("Fighting")
		 || (a.getType2()).equals("Flying")
		 || (a.getType2()).equals("Ghost"))		
		retint *= 0.5;
	    if ( (a.getType1()).equals("Grass")
		 || (a.getType1()).equals("Poison")
		 || (a.getType1()).equals("Psychic"))
		retint *= 2;
	    if ( (a.getType2()).equals("Grass")
		 || (a.getType2()).equals("Poison")
		 || (a.getType2()).equals("Psychic"))
		retint *= 2;
	}
	else if (type.equals("Rock")){
	    if ( (a.getType1()).equals("Fire")
		 || (a.getType1()).equals("Ice")
		 || (a.getType1()).equals("Flying")
		 || (a.getType1()).equals("Bug"))		
		retint *= 2;
	    if ( (a.getType2()).equals("Fire")
		 || (a.getType2()).equals("Ice")
		 || (a.getType2()).equals("Flying")
		 || (a.getType2()).equals("Bug"))		
		retint *= 2;
	    if ( (a.getType1()).equals("Fighting")
		 || (a.getType1()).equals("Ground"))
		retint *= 0.5;
	    if ( (a.getType2()).equals("Fighting")
		 || (a.getType2()).equals("Ground"))
		retint *= 0.5;
	}
	else if (type.equals("Ghost")){
	    if ( (a.getType1()).equals("Normal")
		 || (a.getType1()).equals("Psychic")
		 || (a.getType2()).equals("Normal")
		 || (a.getType2()).equals("Psychic"))		
		retint *= 0;
	    if ( (a.getType1()).equals("Ghost")
		 || (a.getType2()).equals("Ghost"))
		retint *= 2;
	}
	else if (type.equals("Dragon")){
	    if ( (a.getType1()).equals("Dragon")
		 || (a.getType2()).equals("Dragon"))
		retint *= 2;
	}
	return retint;
    }
}

