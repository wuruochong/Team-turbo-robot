public class Raticate extends Pokemon{
    public Raticate(){
	_name = "Raticate";
	Type1 = "Normal";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 81;
	_defb = 60;
	_spdb = 97;
	_spb = 50;
	_hitPtsb = 55;
	_hitPts = HPCalc();
	_atk = statCalc(_atkb);
	_def = statCalc(_defb);
	_spd = statCalc(_spdb);
	_sp = statCalc(_spb);
    }

    public int Tackle(){
	return 35;
    }

    public int Razor_Leaf(){
	return 35;
    }

    public int Vine_Whip(){
	return 55;
    }

    public int SolarBeam(){
	return 120;
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
