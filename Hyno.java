public class Hypno extends Pokemon{
    public Hypno(){
	_name = "Hypno";
	Type1 = "Psychic";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 73;
	_defb = 70;
	_spdb = 67;
	_spb = 115;
	_hitPtsb = 85;
	HealPP();
    }

    public int Pound(Pokemon a){
	int main = damageCalc(a,35);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Confusion(Pokemon a){
	int main = damageCalcsp(a,50);
	double mod = 1.5 * Effective(a, "Psychic");
	return (int)(main * mod);
    }

    public int Headbutt(Pokemon a){
	int main = damageCalc(a,70);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }
    
    public int Psychic(Pokemon a){
	int main = damageCalcsp(a,90);
	double mod = 1.5 * Effective(a, "Psychic");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Pound(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Confusion(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Headbutt(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Psychic(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Pound \t" + getPP1() + "\n" +
		"2:Confusion \t" +getPP2() + "\n" +
		"3:Headbutt \t" + getPP3() + "\n" +
		"4:Psychic \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(35);
	setPP2(25);
	setPP3(15);
	setPP4(10);
    }
  
}
