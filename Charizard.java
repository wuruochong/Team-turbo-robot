public class Charizard extends Pokemon{
    public Charizard(){
	_name = "Charizard";
	Type1 = "Fire";
	Type2 = "Flying";
	_exp = 0;
	_lvl = 50;
	_atkb = 84;
	_defb = 78;
	_spdb = 100;
	_spb = 85;
	_hitPtsb = 78;
	HealPP();
    }

    public int Slash(Pokemon a){
	int main = damageCalc(a,70);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Ember(Pokemon a){
	int main = damageCalcsp(a,40);
	double mod = 1.5 * Effective(a, "Fire");
	return (int)(main * mod);
    }

    public int Flamethrower(Pokemon a){
	int main = damageCalcsp(a,95);
	double mod = 1.5 * Effective(a, "Fire");
	return (int)(main * mod);
    }

    public int Fire_Spin(Pokemon a){
	int main = damageCalcsp(a,15);
	double mod = 1.5 * Effective(a, "Fire");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Slash(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Ember(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Flamethrower(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Fire_Spin(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Slash \t" + getPP1() + "\n" +
		"2:Ember \t" +getPP2() + "\n" +
		"3:Flamethrower \t" + getPP3() + "\n" +
		"4:Fire Spin \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(20);
	setPP2(25);
	setPP3(15);
	setPP4(15);
    }
  
}
