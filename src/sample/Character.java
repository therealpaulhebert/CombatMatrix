package sample;

import static java.lang.Math.abs;

public class Character {
    private String name;
    private int roll;
    private int attacks;
    private String i30;
    private String i29;
    private String i28;
    private String i27;
    private String i26;
    private String i25;
    private String i24;
    private String i23;
    private String i22;
    private String i21;
    private String i20;
    private String i19;
    private String i18;
    private String i17;
    private String i16;
    private String i15;
    private String i14;
    private String i13;
    private String i12;
    private String i11;
    private String i10;
    private String i9;
    private String i8;
    private String i7;
    private String i6;
    private String i5;
    private String i4;
    private String i3;
    private String i2;
    private String i1;

    public Character() {
    }

    public Character(String name) {
        this.setName(name);
    }

    public Character(String name, int roll, int attacks) {
        this.setName(name);
        this.setRoll(roll);
        this.setAttacks(attacks);
    }

    public void attackCadence (int roll, int attack) {
        if (attack > 0) {
        	if (roll < attack) {
        		System.out.print("Roll is less than attack, changing calculated roll to " + attack );
        		roll = attack;
        	}
            int[] attacksAt = new int[attack];

            int deviation = (roll + attack - 1) / attack;
            int i = 1;

            System.out.println("Start with " + roll + "; Deviation is: " + deviation);
            System.out.println("");

            attacksAt[0] = roll;

            int attackAt = roll - deviation;
            
            while (i <= attack - 1 ) {
                attacksAt[i] = attackAt;
                System.out.println("Next attack @ " + attackAt);
                
            	int remainingAttacks = (attacks - i) ;
            	if (remainingAttacks > attackAt - 1 ) {
            		System.out.println("**** There are more attacks than spaces left! attackAt:" + attackAt + " remaining attacks: " + remainingAttacks);
            		deviation = (attackAt  + remainingAttacks - 1) / remainingAttacks;
            	}
                
                if (attackAt <= deviation) {
                    attackAt = attackAt - 1;
                } else attackAt = attackAt - deviation;

                i += 1;
            }

            for (int n : attacksAt) {
                System.out.println("   Array of Attacks:" + n);
                switch (n) {
                    case 30:
                        this.setI30("X");
                        break;
                    case 29:
                        this.setI29("X");
                        break;
                    case 28:
                        this.setI28("X");
                        break;
                    case 27:
                        this.setI27("X");
                        break;
                    case 26:
                        this.setI26("X");
                        break;
                    case 25:
                        this.setI25("X");
                        break;
                    case 24:
                        this.setI24("X");
                        break;
                    case 23:
                        this.setI23("X");
                        break;
                    case 22:
                        this.setI22("X");
                        break;
                    case 21:
                        this.setI21("X");
                        break;
                    case 20:
                        this.setI20("X");
                        break;
                    case 19:
                        this.setI19("X");
                        break;
                    case 18:
                        this.setI18("X");
                        break;
                    case 17:
                        this.setI17("X");
                        break;
                    case 16:
                        this.setI16("X");
                        break;
                    case 15:
                        this.setI15("X");
                        break;
                    case 14:
                        this.setI14("X");
                        break;
                    case 13:
                        this.setI13("X");
                        break;
                    case 12:
                        this.setI12("X");
                        break;
                    case 11:
                        this.setI11("X");
                        break;
                    case 10:
                        this.setI10("X");
                        break;
                    case 9:
                        this.setI9("X");
                        break;
                    case 8:
                        this.setI8("X");
                        break;
                    case 7:
                        this.setI7("X");
                        break;
                    case 6:
                        this.setI6("X");
                        break;
                    case 5:
                        this.setI5("X");
                        break;
                    case 4:
                        this.setI4("X");
                        break;
                    case 3:
                        this.setI3("X");
                        break;
                    case 2:
                        this.setI2("X");
                        break;
                    case 1:
                        this.setI1("X");
                        break;
                }//End Switch
            }//end for loop attacksAt
        } else
        this.clearAttacks(); //end if attacks > 0
    }//end attackCadence

    public void clearAttacks() {
        System.out.println("Clearing attacks");
        this.setI30("");
        this.setI29("");
        this.setI28("");
        this.setI27("");
        this.setI26("");
        this.setI25("");
        this.setI24("");
        this.setI23("");
        this.setI22("");
        this.setI21("");
        this.setI20("");
        this.setI19("");
        this.setI18("");
        this.setI17("");
        this.setI16("");
        this.setI15("");
        this.setI14("");
        this.setI13("");
        this.setI12("");
        this.setI11("");
        this.setI10("");
        this.setI9("");
        this.setI8("");
        this.setI7("");
        this.setI6("");
        this.setI5("");
        this.setI4("");
        this.setI3("");
        this.setI2("");
        this.setI1("");
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = abs(roll);
    }

    public int getAttacks() {
        return attacks;
    }

    public void setAttacks(int attacks) {
        this.attacks = abs(attacks);
    }

    public String getI30() {
        return i30;
    }

    public void setI30(String i30) {
        this.i30 = i30;
    }

    public String getI29() {
        return i29;
    }

    public void setI29(String i29) {
        this.i29 = i29;
    }

    public String getI28() {
        return i28;
    }

    public void setI28(String i28) {
        this.i28 = i28;
    }

    public String getI27() {
        return i27;
    }

    public void setI27(String i27) {
        this.i27 = i27;
    }

    public String getI26() {
        return i26;
    }

    public void setI26(String i26) {
        this.i26 = i26;
    }

    public String getI25() {
        return i25;
    }

    public void setI25(String i25) {
        this.i25 = i25;
    }

    public String getI24() {
        return i24;
    }

    public void setI24(String i24) {
        this.i24 = i24;
    }

    public String getI23() {
        return i23;
    }

    public void setI23(String i23) {
        this.i23 = i23;
    }

    public String getI22() {
        return i22;
    }

    public void setI22(String i22) {
        this.i22 = i22;
    }

    public String getI21() {
        return i21;
    }

    public void setI21(String i21) {
        this.i21 = i21;
    }

    public String getI20() {
        return i20;
    }

    public void setI20(String i20) {
        this.i20 = i20;
    }

    public String getI19() {
        return i19;
    }

    public void setI19(String i19) {
        this.i19 = i19;
    }

    public String getI18() {
        return i18;
    }

    public void setI18(String i18) {
        this.i18 = i18;
    }

    public String getI17() {
        return i17;
    }

    public void setI17(String i17) {
        this.i17 = i17;
    }

    public String getI16() {
        return i16;
    }

    public void setI16(String i16) {
        this.i16 = i16;
    }

    public String getI15() {
        return i15;
    }

    public void setI15(String i15) {
        this.i15 = i15;
    }

    public String getI14() {
        return i14;
    }

    public void setI14(String i14) {
        this.i14 = i14;
    }

    public String getI13() {
        return i13;
    }

    public void setI13(String i13) {
        this.i13 = i13;
    }

    public String getI12() {
        return i12;
    }

    public void setI12(String i12) {
        this.i12 = i12;
    }

    public String getI11() {
        return i11;
    }

    public void setI11(String i11) {
        this.i11 = i11;
    }

    public String getI10() {
        return i10;
    }

    public void setI10(String i10) {
        this.i10 = i10;
    }

    public String getI9() {
        return i9;
    }

    public void setI9(String i9) {
        this.i9 = i9;
    }

    public String getI8() {
        return i8;
    }

    public void setI8(String i8) {
        this.i8 = i8;
    }

    public String getI7() {
        return i7;
    }

    public void setI7(String i7) {
        this.i7 = i7;
    }

    public String getI6() {
        return i6;
    }

    public void setI6(String i6) {
        this.i6 = i6;
    }

    public String getI5() {
        return i5;
    }

    public void setI5(String i5) {
        this.i5 = i5;
    }

    public String getI4() {
        return i4;
    }

    public void setI4(String i4) {
        this.i4 = i4;
    }

    public String getI3() {
        return i3;
    }

    public void setI3(String i3) {
        this.i3 = i3;
    }

    public String getI2() {
        return i2;
    }

    public void setI2(String i2) {
        this.i2 = i2;
    }

    public String getI1() {
        return i1;
    }

    public void setI1(String i1) {
        this.i1 = i1;
    }


}
