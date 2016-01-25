public class Cloyster extends Pokemon{
    public Cloyster(){
	_name = "Cloyster";
	Type1 = "Water";
	Type2 = "Ice";
	_exp = 0;
	_lvl = 50;
	_atkb = 95;
	_defb = 180;
	_spdb = 70;
	_spb = 85;
	_hitPtsb = 50;
	HealPP();
    }
    
    public int Clamp(Pokemon a){
	int main = damageCalc(a,35);
	double mod = 1.5 * Effective(a, "Water");
	return (int)(main * mod);
    }
   
    public int Aurora_Beam(Pokemon a){
	int main = damageCalcsp(a,65);
	double mod = 1.5 * Effective(a, "Ice");
	return (int)(main * mod);
    }

    public int Spike_Cannon(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,20);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Ice_Beam(Pokemon a){
	int main = damageCalcsp(a,95);
	double mod = 1.5 * Effective(a, "Ice");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Clamp(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Aurora_Beam(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Spike_Cannon(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Ice_Beam(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Clamp \t" + getPP1() + "\n" +
		"2:Aurora Beam \t" +getPP2() + "\n" +
		"3:Spike Cannon \t" + getPP3() + "\n" +
		"4:Ice Beam \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(10);
	setPP2(20);
	setPP3(15);
	setPP4(10);
    }
  
}
