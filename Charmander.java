public class Charmander extends Pokemon{
    public Charmander(){
	_name = "Charmander";	
	_exp = 0;
	_lvl = 5;
	_atk = 52;
	_def = 43;
	_spd = 65;
	_hitPts = 39;
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
}
