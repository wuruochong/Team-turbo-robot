public class Dugtrio extends Pokemon{
    public Dugtrio(){
	_name = "Dugtrio";
	Type1 = "Ground";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 80;
	_defb = 50;
	_spdb = 120;
	_spb = 70;
	_hitPtsb = 35;
	HealPP();
    }

    public int Scratch(Pokemon a){
	int main = damageCalc(a,35);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }
   
    public int Dig(Pokemon a){
	int main = damageCalc(a,100);
	double mod = 1.5 * Effective(a, "Ground");
	return (int)(main * mod);
    }

    public int Slash(Pokemon a){
	int main = damageCalc(a,70);
	double mod = Effective(a, "Normal");
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
	    return Scratch(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Dig(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Slash(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Earthquake(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Scratch \t" + getPP1() + "\n" +
		"2:Dig \t" +getPP2() + "\n" +
		"3:Slash \t" + getPP3() + "\n" +
		"4:Earthquake \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(35);
	setPP2(10);
	setPP3(20);
	setPP4(10);
    }
  
}
