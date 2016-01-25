public class Charmander extends Pokemon{
    public Charmander(){
	_name = "Charmander";
	Type1 = "Fire";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 52+IVgen();
	_defb = 43+IVgen();
	_spdb = 65+IVgen();
	_hitPtsb = 39+IVgen();
	_hitPts = HPCalc();
	_atk = statCalc(_atkb);
	_def = statCalc(_defb);
	_spd = statCalc(_spdb);

    }

    public int Scratch(){
	return 15;
    }

    public int Ember(){
	return 20;
    }

    public int ReadMove(int x){
	if ( x == 1){
	    return Scratch();
	}
	else if ( x == 2){
	    return Ember();
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return "1:Scratch" + "\n" + "2:Ember";
    }
}
