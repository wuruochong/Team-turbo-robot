public class Aerodactyl extends Pokemon{
    public Aerodactyl(){
	_name = "Aerodactyl";
	Type1 = "Rock";
	Type2 = "Flying";
	_exp = 0;
	_lvl = 50;
	_atkb = 105;
	_defb = 65;
	_spdb = 130;
	_spb = 60;
	_hitPtsb = 80;
    }

    public int Wing_Attack(Pokemon a){
	int main = damageCalc(a,35);
	int mod = 1.5 * Effective(a, "Flying");
	return int(main * mod);
    }

    public int Bite(Pokemon a){
	int main = damageCalc(a,60);
	int mod = Effective(a, "Normal");
	return int(main * mod);
    }

    public int Take_Down(Pokemon a){
	int main = damageCalc(a,90);
	int mod = Effective(a, "Normal");
	return int(main * mod);
    }

    public int HyperBeam(Pokemon a){
	int main = damageCalc(a,150);
	int mod = 1.5 * Effective(a, "Normal");
	return int(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Wing_Attack(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Bite(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Take_Down(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return HyperBream(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Wing Attack \t" + getPP1() + "\n" +
		"2:Bite \t" +getPP2() + "\n" +
		"3:Take Down \t" + getPP3() + "\n" +
		"4:HyperBeam \t" + getPP4() + "\n");
    }
}
