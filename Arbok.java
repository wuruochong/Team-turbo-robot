public class Arbok extends Pokemon{
    public Arbok(){
	_name = "Arbok";
	Type1 = "Poison";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 85;
	_defb = 69;
	_spdb = 80;
	_spb = 65;
	_hitPtsb = 60;
	HealPP();
    }

     public int Poison_Sting(Pokemon a){
	int main = damageCalc(a,15);
	double mod = 1.5 * Effective(a, "Poison");
	return (int)(main * mod);
    }

    public int Bite(Pokemon a){
	int main = damageCalc(a,60);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Wrap(Pokemon a){
	int main = damageCalc(a,15);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Acid(Pokemon a){
	int main = damageCalcsp(a,40);
	double mod = 1.5 * Effective(a, "Poison");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Poison_Sting(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Bite(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Wrap(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Acid(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Poison Sting \t" + getPP1() + "\n" +
		"2:Bite \t" +getPP2() + "\n" +
		"3:Wrap \t" + getPP3() + "\n" +
		"4:Acid \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(35);
	setPP2(25);
	setPP3(20);
	setPP4(30);
    }
  
}
