public class Moltres extends Pokemon{
    public Moltres(){
	_name = "Moltres";
	Type1 = "Flying";
	Type2 = "Fire";
	_exp = 0;
	_lvl = 50;
	_atkb = 100;
	_defb = 90;
	_spdb = 90;
	_spb = 125;
	_hitPtsb = 90;
	HealPP();
    }

    public int Peck(Pokemon a){
	int main = damageCalc(a,35);
	double mod = 1.5 * Effective(a, "Flying");
	return (int)(main * mod);
    }

    public int Sky_Attack(Pokemon a){
	int main = damageCalc(a,140);
	double mod = 1.5 * Effective(a, "Flying");
	return (int)(main * mod);
    }

    public int Double_Edge(Pokemon a){
	int main = damageCalc(a,100);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }
    
    public int Fire_Blast(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Fire");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Peck(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Sky_Attack(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Double_Edge(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Fire_Blast(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Peck \t" + getPP1() + "\n" +
		"2:Sky Attack \t" +getPP2() + "\n" +
		"3:Double Edge \t" + getPP3() + "\n" +
		"4:Fire Blast \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(35);
	setPP2(5);
	setPP3(15);
	setPP4(5);
    }
  
}
