public class Squirtle extends Pokemon{
    public Squirtle(){
	_name = "Squirtle";
	Type1 = "Water";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 48+IVgen();
	_defb = 65+IVgen();
	_spdb = 43+IVgen();
	_hitPtsb = 44+IVgen();
	_hitPts = HPCalc();
	_atk = statCalc(_atkb);
	_def = statCalc(_defb);
	_spd = statCalc(_spdb);
    }

    public int Pound(){
	return 15;
    }

    public int Bubble(){
	return 20;
    }

    public int ReadMove(int x){
	if ( x == 1){
	    return Pound();
	}
	else if ( x == 2){
	    return Bubble();
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return "1:Pound" + "\n" + "2.Ember";
    }
}
