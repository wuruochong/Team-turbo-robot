public class Gengar extends Pokemon{
    public Gengar(){
	_name = "Gengar";
	Type1 = "Ghost";
	Type2 = "Poison";
	_exp = 0;
	_lvl = 50;
	_atkb = 65;
	_defb = 60;
	_spdb = 110;
	_spb = 130;
	_hitPtsb = 60;
	HealPP();
    }

    public int Lick(Pokemon a){
	int main = damageCalc(a,20);
	double mod = 1.5 * Effective(a, "Ghost");
	return (int)(main * mod);
    }

    public int Night_Shade(){
	return 50;
    }

    public int Mega_Kick(Pokemon a){
	int main = damageCalc(a,120);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }
    
    public int Dream_Eater(Pokemon a){
	int main = damageCalc(a,100);
	double mod = Effective(a, "Psychic");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Lick(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Night_Shade();
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Mega_Kick(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Dream_Eater(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Lick \t" + getPP1() + "\n" +
		"2:Night Shade \t" +getPP2() + "\n" +
		"3:Mega Kick \t" + getPP3() + "\n" +
		"4:Dream Eater \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(30);
	setPP2(15);
	setPP3(5);
	setPP4(15);
    }
  
}
