public class Charmander extends Pokemon{
    public Charmander(){
	_name = "Charmander";	
	_exp = 0;
	_lvl = 5;
	_atkb = 52;
	_defb = 43;
	_spdb = 65;
	_hitPtsb = 39;
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
