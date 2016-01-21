public abstract class Pokemon {
    protected int _hitPts;
    protected int _exp;
    protected int _lvl;
    protected int _atk;
    protected int _def;
    protected int _spd;
    protected String _name;

    public Pokemon(){
	_hitPts = 20;
	_exp = 0;
	_lvl = 1;
	_atk = 30;
	_def = 30;
	_spd = 30;
	_name = "MissingNo.";
    }

    //=========Accessors=========
    public String getName(){
	return _name;
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

    //=========Other Methods=========
    public boolean isAlive(){
	return _hitPts > 0;
    }

    public String toString(){
	return getName()+"\t"+getLvl()+"\n"+getHP();
    }
    
    public void lowerHP(int damage){
    	setHP(getHP()-damage);
    }
    
    public abstract int ReadMove(int x);
    public abstract String PrintMoves();
}
