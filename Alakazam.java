public class Alakazam extends Pokemon{
    public Alakazam(){
	_name = "Alakazam";
	Type1 = "Psychic";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 50;
	_defb = 45;
	_spdb = 120;
	_spb = 135;
	_hitPtsb = 55;
	HealPP();
    }

    public int Confusion(Pokemon a){
	int main = damageCalcsp(a,50);
	double mod = 1.5 * Effective(a, "Psychic");
	return (int)(main * mod);
    }

    public int Psybeam(Pokemon a){
	int main = damageCalcsp(a,65);
	double mod = 1.5 * Effective(a, "Psychic");
	return (int)(main * mod);
    }

    public int Psychic(Pokemon a){
	int main = damageCalcsp(a,90);
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

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Confusion(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Psybeam(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Psychic(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    Recover();
	    return 0;
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Confusion \t" + getPP1() + "\n" +
		"2:Psybeam \t" +getPP2() + "\n" +
		"3:Psychic \t" + getPP3() + "\n" +
		"4:Recover \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(25);
	setPP2(20);
	setPP3(10);
	setPP4(20);
    }
  
}
