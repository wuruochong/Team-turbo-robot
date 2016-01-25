public class Jolteon extends Pokemon{
    public Jolteon(){
	_name = "Jolteon";
	Type1 = "Electric";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 65;
	_defb = 60;
	_spdb = 130;
	_spb = 110;
	_hitPtsb = 65;
	HealPP();
    }

    public int Double_Kick(Pokemon a){
	int main = 2 * damageCalc(a,30);
	double mod = Effective(a, "Fighting");
	return (int)(main * mod);
    }

    public int Pin_Missile(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,14);
	double mod = Effective(a, "Bug");
	return (int)(main * mod);
   }

    public int Thunder(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Electric");
	return (int)(main * mod);
    }
    
    public int ThunderShock(Pokemon a){
	int main = damageCalcsp(a,40);
	double mod = 1.5 * Effective(a, "Electric");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Double_Kick(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Pin_Missile(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Thunder(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return ThunderShock(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Double Kick \t" + getPP1() + "\n" +
		"2:Pin Missile \t" +getPP2() + "\n" +
		"3:Thunder \t" + getPP3() + "\n" +
		"4:ThunderShock \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(30);
	setPP2(20);
	setPP3(10);
	setPP4(30);
    }
  
}
