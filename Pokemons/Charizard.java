public class Charizard extends Pokemon{
    public Charizard(){
	_name = "Charizard";
	Type1 = "Fire";
	Type2 = "Flying";
	_exp = 0;
	_lvl = 50;
	_atkb = 84;
	_defb = 78;
	_spdb = 100;
	_spb = 85;
	_hitPtsb = 78;
	_hitPts = HPCalc();
	_atk = statCalc(_atkb);
	_def = statCalc(_defb);
	_spd = statCalc(_spdb);
	_sp = statCalc(_spb);
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
