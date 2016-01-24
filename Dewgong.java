public class Dewgong extends Pokemon{
    public Dewgong(){
	_name = "Dewgong";
	Type1 = "Water";
	Type2 = "Ice";
	_exp = 0;
	_lvl = 50;
	_atkb = 70;
	_defb = 80;
	_spdb = 70;
	_spb = 95;
	_hitPtsb = 90;
	HealPP();
    }

    public int Headbutt(Pokemon a){
	int main = damageCalc(a,70);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }
   
    public int Aurora_Beam(Pokemon a){
	int main = damageCalcsp(a,65);
	double mod = 1.5 * Effective(a, "Ice");
	return (int)(main * mod);
    }

    public int Take_Down(Pokemon a){
	int main = damageCalc(a,90);
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
	    return Headbutt(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Aurora_Beam(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Take_Down(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Ice_Beam(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Headbutt \t" + getPP1() + "\n" +
		"2:Aurora Beam \t" +getPP2() + "\n" +
		"3:Take Down \t" + getPP3() + "\n" +
		"4:Ice Beam \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(15);
	setPP2(20);
	setPP3(20);
	setPP4(10);
    }
  
}
