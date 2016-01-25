public class Clefable extends Pokemon{
    public Clefable(){
	_name = "Clefable";
	Type1 = "Normal";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 70;
	_defb = 73;
	_spdb = 60;
	_spb = 85;
	_hitPtsb = 95;
	HealPP();
    }

    public int DoubleSlap(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,15);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }
   
    public int Double_Edge(Pokemon a){
	int main = damageCalc(a,100);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Take_Down(Pokemon a){
	int main = damageCalc(a,90);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int HyperBeam(Pokemon a){
	int main = damageCalc(a,150);
	double mod = 1.5 * Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return DoubleSlap(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Double_Edge(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Take_Down(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return HyperBeam(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:DoubleSlap \t" + getPP1() + "\n" +
		"2:Double-Edge \t" +getPP2() + "\n" +
		"3:Take Down \t" + getPP3() + "\n" +
		"4:HyperBeam \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(10);
	setPP2(15);
	setPP3(20);
	setPP4(5);
    }
  
}
