public class Venusaur extends Pokemon{
    public Venusaur(){
	_name = "Venusaur";
	Type1 = "Grass";
	Type2 = "Poison";
	_exp = 0;
	_lvl = 50;
	_atkb = 82;
	_defb = 83;
	_spdb = 80;
	_spb = 100;
	_hitPtsb = 80;
	HealPP();
    }

    public int Double_Edge(Pokemon a){
	int main =  damageCalc(a,100);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int SolarBeam(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Grass");
	return (int)(main * mod);
   }

    public int Razor_Leaf(Pokemon a){
	int main = damageCalcsp(a,55);
	double mod = 1.5 * Effective(a, "Grass");
	return (int)(main * mod);
    }
    
    public int Vine_Whip(Pokemon a){
	int main = damageCalc(a,35);
	double mod = 1.5 * Effective(a, "Grass");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Double_Edge(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return SolarBeam(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Razor_Leaf(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Vine_Whip(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Double Edge \t" + getPP1() + "\n" +
		"2:SolarBeam \t" +getPP2() + "\n" +
		"3:Razor Leaf \t" + getPP3() + "\n" +
		"4:Vine Whip \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(15);
	setPP2(10);
	setPP3(25);
	setPP4(10);
    }
  
}
