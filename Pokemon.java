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

    public String getName(){
	return _name;
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



    public boolean isAlive(){
	return _hitPts > 0;
    }

    public 
