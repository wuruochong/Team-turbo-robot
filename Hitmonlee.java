public class Hitmonlee extends Pokemon{
    public Hitmonlee(){
	_name = "Hitmonlee";
	Type1 = "Fighting";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 120;
	_defb = 53;
	_spdb = 87;
	_spb = 35;
	_hitPtsb = 50;
	HealPP();
    }

    public int Double_Kick(Pokemon a){
	int main = 2 * damageCalc(a,30);
	double mod = 1.5 * Effective(a, "Fighting");
	return (int)(main * mod);
    }

    public int Rolling_Kick(Pokemon a){
	int main = damageCalc(a,60);
	double mod = 1.5 * Effective(a, "Fighting");
	return (int)(main * mod);
    }

    public int Jump_Kick(Pokemon a){
	int main = damageCalc(a,70);
	double mod = 1.5 * Effective(a, "Fighting");
	return (int)(main * mod);
    }
    
    public int Hi_Jump_Kick(Pokemon a){
	int main = damageCalc(a,85);
	double mod = 1.5 * Effective(a, "Fighting");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Double_Kick(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Rolling_Kick(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Jump_Kick(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Hi_Jump_Kick(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Double Kick \t" + getPP1() + "\n" +
		"2:Rolling Kick \t" +getPP2() + "\n" +
		"3:Jump Kick \t" + getPP3() + "\n" +
		"4:Hi Jump Kick \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(30);
	setPP2(15);
	setPP3(25);
	setPP4(20);
    }
  
}
