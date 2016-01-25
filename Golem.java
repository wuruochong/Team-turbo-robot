public class Golem extends Pokemon{
    public Golem(){
	_name = "Golem";
	Type1 = "Ground";
	Type2 = "Rock";
	_exp = 0;
	_lvl = 50;
	_atkb = 110;
	_defb = 130;
	_spdb = 45;
	_spb = 55;
	_hitPtsb = 80;
	HealPP();
    }

    public int Tackle(Pokemon a){
	int main = damageCalc(a,35);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Rock_Throw(Pokemon a){
	int main = damageCalc(a,50);
	double mod = 1.5 * Effective(a, "Rock");
	return (int)(main * mod);
    }

    public int Explosion(Pokemon a){
	int main = damageCalcsp(a,130);
	double mod = Effective(a, "Normal");
	setHP(0);
	return (int)(main * mod);
    }
    
    public int Earthquake(Pokemon a){
	int main = damageCalc(a,100);
	double mod = 1.5 * Effective(a, "Ground");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Tackle(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Rock_Throw(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Explosion(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Earthquake(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Tackle \t" + getPP1() + "\n" +
		"2:Rock Throw \t" +getPP2() + "\n" +
		"3:Explosion \t" + getPP3() + "\n" +
		"4:Earthquake \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(35);
	setPP2(15);
	setPP3(5);
	setPP4(10);
    }
  
}
