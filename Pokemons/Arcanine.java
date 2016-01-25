public class Arcanine extends Pokemon{
    public Arcanine(){
	_name = "Arcanine";
	Type1 = "Fire";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 110;
	_defb = 80;
	_spdb = 95;
	_spb = 80;
	_hitPtsb = 90;
	HealPP();
    }

    public int Ember(Pokemon a){
	int main = damageCalcsp(a,40);
	double mod = 1.5 * Effective(a, "Fire");
	return (int)(main * mod);
    }

    public int Bite(Pokemon a){
	int main = damageCalc(a,60);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Take_Down(Pokemon a){
	int main = damageCalc(a,90);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Flamethrower(Pokemon a){
	int main = damageCalcsp(a,95);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Ember(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Bite(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Take_Down(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Flamethrower(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Ember \t" + getPP1() + "\n" +
		"2:Bite \t" +getPP2() + "\n" +
		"3:Take Down \t" + getPP3() + "\n" +
		"4:Flamethrower \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(25);
	setPP2(25);
	setPP3(20);
	setPP4(15);
    }
  
}
