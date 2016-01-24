public class Cloyster extends Pokemon{
    public Cloyster(){
	_name = "Cloyster";
	Type1 = "Water";
	Type2 = "Ice";
	_exp = 0;
	_lvl = 50;
	_atkb = 95;
	_defb = 180;
	_spdb = 70;
	_spb = 85;
	_hitPtsb = 50;
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
