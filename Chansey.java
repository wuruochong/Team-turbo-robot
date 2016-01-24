public class Chancey extends Pokemon{
    public Chancey(){
	_name = "Chancey";
	Type1 = "Normal";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 5;
	_defb = 5;
	_spdb = 50;
	_spb = 105;
	_hitPtsb = 250;
	HealPP();
    }

    public int Pound(Pokemon a){
	int main = damageCalc(a,40);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Double_Edge(Pokemon a){
	int main = damageCalc(a,100);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int DoubleSlap(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,15);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Mega_Punch(Pokemon a){
	int main = damageCalc(a,80);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Pound(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Double_Edge(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return DoubleSlap(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Mega_Punch(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Pound \t" + getPP1() + "\n" +
		"2:Double-Edge \t" +getPP2() + "\n" +
		"3:DoublesSlap \t" + getPP3() + "\n" +
		"4:Mega Punch \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(35);
	setPP2(15);
	setPP3(10);
	setPP4(20);
    }
  
}
