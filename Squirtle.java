public class Squirtle extends Pokemon{
    public Squirtle(){
	_name = "Squirtle";	
	_exp = 0;
	_lvl = 5000;
	_atkb = 48;
	_defb = 65;
	_spdb = 43;
	_hitPtsb = 44;
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
