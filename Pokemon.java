public abstract class Pokemon {
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
    protected String _name;

    public Pokemon(){
	_hitPtsb = 20;
	_exp = 0;
	_lvl = 1;
	_atkb = 30;
	_defb = 30;
	_spdb = 30;
	_name = "MissingNo.";
	_hitPts = HPCalc();
	_atk = statCalc(_atkb);
	_def = statCalc(_defb);
	_spd = statCalc(_spdb);
    }

    //=========Accessors=========

    public int HPCalc(){
	return (((getHP() * 2 * getLvl()) / 100)+ getLvl()+ 10);
    }

    public int statCalc(int stat){
	return (((stat * 2 * getLvl())/100) + 5);
    }
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
	return getName()+"\t Lvl "+getLvl()+"\n HP: "+getHP();
    }
    
    public void lowerHP(int damage){
    	setHP(getHP()-damage);
    }
    
    public abstract int ReadMove(int x);
    public abstract String PrintMoves();
}
