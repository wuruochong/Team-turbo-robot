public class Fearow extends Pokemon{
    public Fearow(){
	_name = "Fearow";
	Type1 = "Normal";
	Type2 = "Flying";
	_exp = 0;
	_lvl = 50;
	_atkb = 90;
	_defb = 65;
	_spdb = 100;
	_spb = 61;
	_hitPtsb = 65;
	HealPP();
    }

    public int Fury_Attack(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,15);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Peck(Pokemon a){
	int main = damageCalc(a,35);
	double mod = 1.5 * Effective(a, "Flying");
	return (int)(main * mod);
    }

    public int Drill_Peck(Pokemon a){
	int main = damageCalc(a,80);
	double mod = 1.5 * Effective(a, "Flying");
	return (int)(main * mod);
    }
    
    public int Double_Edge(Pokemon a){
	int main = damageCalc(a,100);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Fury_Attack(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Peck(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Drill_Peck(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Double_Edge(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Fury Attack \t" + getPP1() + "\n" +
		"2:Peck \t" +getPP2() + "\n" +
		"3:Drill Peck \t" + getPP3() + "\n" +
		"4:Double Edge \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(20);
	setPP2(35);
	setPP3(20);
	setPP4(15);
    }
  
}
