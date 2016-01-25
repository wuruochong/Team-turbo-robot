public class Golduck extends Pokemon{
    public Golduck(){
	_name = "Golduck";
	Type1 = "Water";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 82;
	_defb = 78;
	_spdb = 85;
	_spb = 80;
	_hitPtsb = 80;
	HealPP();
    }

    public int Fury_Swipes(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,18);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Scratch(Pokemon a){
	int main = damageCalc(a,40);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Confusion(Pokemon a){
	int main = damageCalc(a,50);
	double mod = 1.5 * Effective(a, "Psychic");
	return (int)(main * mod);
    }
    
    public int Hydro_Pump(Pokemon a){
	int main = damageCalc(a,120);
	double mod = 1.5 * Effective(a, "Water");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Fury_Swipes(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Scratch(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Confusion(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Hydro_Pump(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Fury Swipes \t" + getPP1() + "\n" +
		"2:Scratch \t" +getPP2() + "\n" +
		"3:Confusion \t" + getPP3() + "\n" +
		"4:Hydro Pump \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(15);
	setPP2(35);
	setPP3(25);
	setPP4(5);
    }
  
}
