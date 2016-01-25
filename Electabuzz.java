public class Electabuzz extends Pokemon{
    public Electabuzz(){
	_name = "Electabuzz";
	Type1 = "Electric";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 83;
	_defb = 57;
	_spdb = 105;
	_spb = 85;
	_hitPtsb = 65;
	HealPP();
    }

    public int ThunderShock(Pokemon a){
	int main = damageCalcsp(a,40);
	double mod = 1.5 * Effective(a, "Electric");
	return (int)(main * mod);
    }
   
    public int ThunderPunch(Pokemon a){
	int main = damageCalc(a,75);
	double mod= 1.5 * Effective(a, "Electric");
	return (int)(main * mod);
    }

    public int Thunder(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Electric");
	return (int)(main * mod);
    }

    public int Mega_Punch(Pokemon a){
	int main = damageCalc(a,80);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return ThunderShock(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return ThunderPunch(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Thunder(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Mega_Punch(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:ThunderShock \t" + getPP1() + "\n" +
		"2:ThunderPunch \t" +getPP2() + "\n" +
		"3:Thunder \t" + getPP3() + "\n" +
		"4:Mega Punch \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(30);
	setPP2(15);
	setPP3(10);
	setPP4(20);
    }
  
}
