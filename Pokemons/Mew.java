public class Mew extends Pokemon{
    public Mew(){
	_name = "Mew";
	Type1 = "Psychic";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 100;
	_defb = 100;
	_spdb = 100;
	_spb = 100;
	_hitPtsb = 100;
	HealPP();
    }
    
    public int Pound(Pokemon a){
	int main = damageCalc(a,35);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Mega_Punch(Pokemon a){
	int main = damageCalcsp(a,80);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Explosion(Pokemon a){
	int main = damageCalcsp(a,170);
	double mod = Effective(a, "Normal");
	setHP(0);
	return (int)(main * mod);
    }
    
    public int Psychic(Pokemon a){
	int main = damageCalcsp(a,90);
	double mod = 1.5 * Effective(a, "Psychic");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Pound(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Mega_Punch(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Explosion(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Psychic(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Pound \t" + getPP1() + "\n" +
		"2:Mega Punc \t" +getPP2() + "\n" +
		"3:Explosion \t" + getPP3() + "\n" +
		"4:Psychic \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(35);
	setPP2(20);
	setPP3(5);
	setPP4(10);
    }
  
}

