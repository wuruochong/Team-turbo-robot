public class Beedrill extends Pokemon{
    public Beedrill(){
	_name = "Beedrill";
	Type1 = "Bug";
	Type2 = "Poison";
	_exp = 0;
	_lvl = 50;
	_atkb = 80;
	_defb = 40;
	_spdb = 75;
	_spb = 45;
	_hitPtsb = 65;
	HealPP();
    }

    public int Fury_Attack(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,15);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Twineedle(Pokemon a){
	int main = 2*damageCalc(a,25);
	double mod = 1.5 * Effective(a, "Bug");
	return (int)(main * mod);
    }

    public int Rage(Pokemon a){
	int main = damageCalc(a,20);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Pin_Missile(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,14);
	double mod = 1.5 * Effective(a, "Bug");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Fury_Attack(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Twineedle(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Rage(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Pin_Missile(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Fury Attack \t" + getPP1() + "\n" +
		"2:Twineedle \t" +getPP2() + "\n" +
		"3:Rage \t" + getPP3() + "\n" +
		"4:Pin Missile \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(20);
	setPP2(20);
	setPP3(20);
	setPP4(20);
    }
  
}
