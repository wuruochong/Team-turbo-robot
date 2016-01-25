public class Farfetchd extends Pokemon{
    public Farfetchd(){
	_name = "Farfetch'd";
	Type1 = "Normal";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 65;
	_defb = 55;
	_spdb = 60;
	_spb = 58;
	_hitPtsb = 52;
	HealPP();
    }

    public int Fury_Attack(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,15);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Peck(Pokemon a){
	int main = damageCalc(a,35);
	double mod = 1.5 * Effective(a, "Flying");
	return (int)(main * mod);
    }

    public int Slash(Pokemon a){
	int main = damageCalc(a,70);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Body_Slam(Pokemon a){
	int main = damageCalc(a,85);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Fury_Attack(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Peck(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Slash(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Body_Slam(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Fury Attack \t" + getPP1() + "\n" +
		"2:Peck \t" +getPP2() + "\n" +
		"3:Slash \t" + getPP3() + "\n" +
		"4:Body Slam \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(20);
	setPP2(35);
	setPP3(20);
	setPP4(15);
    }
  
}
