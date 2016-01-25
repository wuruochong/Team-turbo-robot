public class Mewtwo extends Pokemon{
    public Mewtwo(){
	_name = "Mewtwo";
	Type1 = "Psychic";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 110;
	_defb = 90;
	_spdb = 130;
	_spb = 154;
	_hitPtsb = 106;
	HealPP();
    }

    public int Swift(Pokemon a){
	int main = damageCalcsp(a,60);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Confusion(Pokemon a){
	int main = damageCalcsp(a,50);
	double mod = 1.5 * Effective(a, "Psychic");
	return (int)(main * mod);
    }

    public void Recover(){
	if (getHP() > HPCalc()/2){
	    setHP(HPCalc());
	}
	else
	    setHP(getHP()+ HPCalc()/2);       
    }
    
    public int Psychic(Pokemon a){
	int main = damageCalcsp(a,90);
	double mod = 1.5 * Effective(a, "Psychic");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Swift(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Confusion(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Recover(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Psychic(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Swift \t" + getPP1() + "\n" +
		"2:Confusion \t" +getPP2() + "\n" +
		"3:Recover \t" + getPP3() + "\n" +
		"4:Psychic \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(20);
	setPP2(25);
	setPP3(20);
	setPP4(10);
    }
  
}
