public class Blastoise extends Pokemon{
    public Blastoise(){
	_name = "Blastoise";
	Type1 = "Water";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 83;
	_defb = 100;
	_spdb = 78;
	_spb = 85;
	_hitPtsb = 79;
	_hitPts = HPCalc();
	_atk = statCalc(_atkb);
	_def = statCalc(_defb);
	_spd = statCalc(_spdb);
	_sp = statCalc(_spb);
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
