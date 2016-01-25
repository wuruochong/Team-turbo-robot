public class Jynx extends Pokemon{
    public Jynx(){
	_name = "Jynx";
	Type1 = "Psychic";
	Type2 = "Ice";
	_exp = 0;
	_lvl = 50;
	_atkb = 50;
	_defb = 35;
	_spdb = 95;
	_spb = 95;
	_hitPtsb = 65;
	HealPP();
    }

    public int Ice_Punch(Pokemon a){
	int main =  damageCalc(a,75);
	double mod = 1.5 * Effective(a, "Ice");
	return (int)(main * mod);
    }

    public int Body_Slam(Pokemon a){
	int main = damageCalc(a,85);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
   }

    public int Thrash(Pokemon a){
	int main = damageCalc(a,90);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }
    
    public int Blizzard(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Ice");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Ice_Punch(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Body_Slam(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Thrash(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Blizzard(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Ice Punch \t" + getPP1() + "\n" +
		"2:Body Slam \t" +getPP2() + "\n" +
		"3:Thrash \t" + getPP3() + "\n" +
		"4:Blizzard \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(15);
	setPP2(15);
	setPP3(20);
	setPP4(5);
    }
  
}
