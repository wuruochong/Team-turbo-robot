public class Hitmonchan extends Pokemon{
    public Hitmonchan(){
	_name = "Hitmonchan";
	Type1 = "Fighting";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 105;
	_defb = 79;
	_spdb = 76;
	_spb = 35;
	_hitPtsb = 50;
	HealPP();
    }

    public int Comet_Punch(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,18);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Fire_Punch(Pokemon a){
	int main = damageCalc(a,75);
	double mod = Effective(a, "Fire");
	return (int)(main * mod);
    }

    public int Ice_Punch(Pokemon a){
	int main = damageCalc(a,75);
	double mod = Effective(a, "Ice");
	return (int)(main * mod);
    }
    
    public int Thunder_Punch(Pokemon a){
	int main = damageCalc(a,75);
	double mod = Effective(a, "Thunder");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Comet_Punch(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Fire_Punch(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Ice_Punch(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Thunder_Punch(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Comet Punch \t" + getPP1() + "\n" +
		"2:Fire Punch \t" +getPP2() + "\n" +
		"3:Ice Punch \t" + getPP3() + "\n" +
		"4:Thunder Punch \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(15);
	setPP2(15);
	setPP3(15);
	setPP4(15);
    }
  
}
