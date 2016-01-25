public class Flareon extends Pokemon{
    public Flareon(){
	_name = "Flareon";
	Type1 = "Fire";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 130;
	_defb = 60;
	_spdb = 65;
	_spb = 110;
	_hitPtsb = 65;
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

    public int Flamethrower(Pokemon a){
	int main = damageCalcsp(a,95);
	double mod = 1.5 * Effective(a, "Fire");
	return (int)(main * mod);
    }
    
    public int Fire_Blast(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Fire");
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
	    return Flamethrower(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Fire_Blast(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Ember \t" + getPP1() + "\n" +
		"2:Bite \t" +getPP2() + "\n" +
		"3:Flamthrower \t" + getPP3() + "\n" +
		"4:Fire Blast \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(25);
	setPP2(25);
	setPP3(15);
	setPP4(5);
    }
  
}
