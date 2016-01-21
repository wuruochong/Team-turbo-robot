public class Squirtle extends Pokemon{
    public Squirtle(){
	_name = "Squirtle";	
	_exp = 0;
	_lvl = 5;
	_atk = 48;
	_def = 65;
	_spd = 43;
	_hitPts = 44;
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
